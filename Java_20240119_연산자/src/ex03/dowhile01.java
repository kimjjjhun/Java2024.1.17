package ex03;

public class dowhile01 {

	public static void main(String[] args) {
		int sum=0;
		int i=1;     //초기값
		
		do {
			sum += i;
			i++;     //증가값
		}while(i<=10);   // 조건식
System.out.println("sum:" + sum);		
		

	}

}
