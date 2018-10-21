
public class roll {
	/**
	 * 
	 *    Ò¡É«×Ó
	 * @author 11522
	 * @param args
	 */
	public static void main(String[] args) {
		double a = Math.random();
		int e = (int)(1+a*6);
		switch(e) {
		case 6:
			System.out.println('6');
			break;
		case 5:
			System.out.println('5');
			break;
		case 4:
			System.out.println('4');
			break;
		default:
			System.out.println('0');
			break;
		}
	}
}
