package ex01;

public class ExcceptionEx2 {

	public static void main(String[] args) {
		
		System.out.println(1);         // 1출력
		System.out.println(2);         // 2출력
		try {                          // try-catch문 
			System.out.println(3);     // 3출력
			System.out.println(4);     // 4출력
		} catch (Exception e) {        // 오류로 인한 5출력을 건너뜀
			System.out.println(5);
		}
		System.out.println(6);          // 6출력

	}
}