package ex01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double div = 0;
		System.out.println("정수 2개 입력>>");
		
		
		
		try {                       // 문제 소지가 있는 녀석들을 처리해주는 문항
		int num1 = sc.nextInt();   //정수입력을요구-> 문자열 그때 어떻게?
		int num2 = sc.nextInt();   //0아닌 값 요구-> 0 입력하면 어떻게?
		
		div = num1 / num2;
		
		int[] arr = new int[3];    //배열 크기 3
		for(int i=0; i<3; i++)
			//for(int i=0; i<arr.length; i++) 일경우 오류가 없음
			arr[i] = i;            //배열 벗어난 입력을 하면?
		
		}catch(InputMismatchException e) {   // 정수가 아닌 입력하면 처리
            e.printStackTrace();
		}catch(ArithmeticException e) {      // 0으로 나누기 했을때 처리
			e.printStackTrace();
		}catch(Exception e) {            //아무거나
			e.printStackTrace();
		}finally {
			// 여기는 예외가 발생하든 발생하지 않든 무조건 처리하는 구문
			
		}
		System.out.println("나누기:" + div);
		System.out.println("프로그램종료");
		

	}

}
