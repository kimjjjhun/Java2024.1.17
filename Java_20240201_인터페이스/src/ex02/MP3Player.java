package ex02;

public class MP3Player implements MediaPlayer {
	private String filename;
	private Double filesize;
	private Double time;
    public static int state;  // -1(정지),0(일시정지),1(실행)
	@Override
	public void pause() {
		state = 0;
		System.out.println("일시정지");
	}
	@Override
	public void stop() {
		state = -1;
		System.out.println("종료");
	}
	@Override
	public void file() {
		System.out.println("로드하기" + "파일명" + filename + "파일크기" + filesize + "시간" + time);
	    System.out.println("로딩중입니다....");
	}
	@Override
	public void play() {
		state = 1;
		System.out.println("MP3 파일 실행 중...");
	}
	
	

	

	
	
	

	
	

	

}
