package cn.zhf.myCollection;
/**
 * 模拟实现JDK中提供的ArrayList类
 * @author 11522
 *
 */
public class MyArrayList {
    /**
     * The value is used for character storage.
     */
    Object[] value;

    /**
     * The count is the number of characters used.
     */
    private int size;
    public MyArrayList() {
 //   	value = new Object[16];
    	this(16);
    }
    public MyArrayList(int size) {
    	value = new Object[size];
    }
    public void add(Object obj) {
    	value[size] = obj;
    	size++;
    	if(size>=value.length) {
    		int newCapacity = value.length*2;
    		Object[] newList = new Object[newCapacity]; //System.arraycopy(src, srcPos, dest, destPos, length);

    		for(int i=0;i<value.length;i++) {
    			newList[i]= value[i];
    		}
    		value = newList;
    	}
    }
    public Object get(int index) {
    	indexCheck(index);
    	return value[index];
    }
    
    
    public int size() {
    	return size;
    }
    
    
    public void indexCheck(int index) {
    	if(index<0||index>size-1) {
    		try {
    			throw new Exception();//手动抛出一个异常。
    		}catch(Exception e) {
    			e.printStackTrace();
    		}
    	}
    }//index是否越界。
    
    public int indexOf(Object obj) {
    	if(obj==null) {
    		return -1;
    		
    	}else {
    		for(int i = 0 ;i < value.length;i++) {
    			if(obj==value[i]) {
    				return i ;
    			}
    		}
    		return -1;
    	}
    }
	public Object set(int index,Object object) {
		indexCheck(index);
		Object old = value[index];
		value[index] = object;
		return old;
	}
    public static void main(String[] args) {
		MyArrayList list = new MyArrayList(2);
		list.add("aaa");
		list.add(new Human("zhf"));
		list.add("bbb");
		Human h = (Human)list.get(1);
		System.out.println(h.getName());
		System.out.println(list.get(0));
		System.out.println(list.indexOf("aaa"));
		System.out.println(list.set(0, "bbb"));
		
	}
}
