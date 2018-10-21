
public class testpro {
	public static void main(String[] args) {
		int sum = 0;
		int sum_sum = 0;
		for(int i=1;i<=100;i++) {
			
			for(int j=1;j<=i;j++) {
				sum++;
			}
			sum_sum += sum;
			
			
		}
		System.out.println(sum_sum);
	
	
		
		int sum2 = 0;
		for(int a=1;a<=10;a++) {
			int sum1 = 1;
			for(int b=1;b<=a;b++) {
				sum1 *= b;
			}
			sum2 += sum1;
		}
		System.out.println(sum2);
	}
}
