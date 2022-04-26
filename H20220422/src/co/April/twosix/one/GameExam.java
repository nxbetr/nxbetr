package co.April.twosix.one;

public class GameExam {

	public static void main(String[] args) {
		RPGgame rg = new RPGgame();
		
		
		rg.leftUpButton();
		rg.rightUpButton();
		rg.changeMode();
		rg.rightUpButton();
		rg.rightDownButton();
		rg.leftDownButton();
		rg.changeMode();
		rg.rightDownButton();
		
		System.out.println("======================");
		
		ArcadeGame ag = new ArcadeGame();
		
		ag.leftUpButton();
		ag.rightUpButton();
		ag.changeMode();
		ag.rightUpButton();
		ag.rightDownButton();
		ag.leftDownButton();
		ag.changeMode();
		ag.rightDownButton();
	}

}




