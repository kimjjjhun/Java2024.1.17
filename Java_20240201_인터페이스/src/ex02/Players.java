package ex02;

import java.util.Scanner;


public class Players {

	public static void main(String[] args) {
		MediaPlayer mp = new MP3Player();
		
		Scanner sc = new Scanner(System.in);
        
		
		while(MP3Player.state != -1) {
			System.out.println("1 : 실행, 0 : 일시정지, -1  중지 ---->");
		
        	switch(sc.nextInt()) {
        	
        	case 1:
			mp.play();
			mp.file();
			break;
		
        	case 0:
			mp.pause();
			break;
		
        	case -1:
			mp.stop();
			break;
		}
	}
		
	}
		
		
		
		

	}

