package ex03;

public class continue01 {

	public static void main(String[] args) {
		
		//1 부터 10 사이의 홀수의 합
		
		int a = 0;    // 1.변수의 값 먼저 정하기
		
		for(int i=1; i<=10; i++) { //포문 앞 초기화값 , 조건 , 증감
         			if (i%2 == 1)
         				a += i;  // a변수와 i변수의 값은 같다.
		}
System.out.println("홀수합:" + a);
	
	
	int sum3=0;
	for(int i=1; i<=10; i++) {  // 변수값,조건,증감
		if(i % 2 == 0)          // 변수 나누기 2 값이 0으로 서로 같을때 참 
	continue;                   // continue 문장은 빠져나가지않고 처음으로 되돌아간다.
		sum3 += i;              // sum3의 값은 i와 같다.
	}
	System.out.println("홀수합:"+sum3);
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	

}
