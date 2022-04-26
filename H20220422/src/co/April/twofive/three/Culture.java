package co.April.twofive.three;

public abstract class Culture {

	
	//제목, 참여감독 수, 참여배우 수, 관객수, 총점을 필드로 가진다.
	String title;
	int director;
	int actor;
	int audience;
	int rate;
	
	//제목, 참여감독 수, 참여배우 수는 생성자를 이용하여 값을 초기화한다.
	
	public Culture(String title, int director, int actor, int audience, int rate) {
		this.title=title;
		this.director=director;
		this.actor=actor;
		this.audience=audience;
		this.rate=rate;
		
	}
	
	
	
	
	//메소드는 다음과 같이 정의한다.
	public void setTotalScore(int score) {
		//관객수와 총점을 누적시키는 기능
	}
	public String getGrade() {
	//평점을 구하는 기능
	}
	public abstract void getInformation();
	// 정보를 출력하는 추상메소드
}
