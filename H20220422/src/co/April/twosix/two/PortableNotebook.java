package co.April.twosix.two;

public class PortableNotebook implements Notebook, Tablet {

	// - MODE, 문서 프로그램, 인터넷 브라우저, 영상종류, 앱종류를 필드로 가지며 생성자를 이용하여 값을 초기화한다.
	// ( 단, MODE 필드는 매개변수를 이용하지 않으며 TABLET_MODE를 초기값으로 가지며 현재 모드를 출력해준다. )
	int MODE = TABLET_MODE;
	
	String kind;
	String appKind;
	

	@Override
	public void watchVideo() {
		System.out.println(kind + "를 시청.");
	}

	@Override
	public void useApp() {
		// - NOTEBOOK_MODE : 현재 모드를 바꾸고 "'앱종류'를 실행."를 출력한다.
		// - TABLET_MODE : "'앱종류'를 실행."을 출력한다.
	}

	@Override
	public void writeDocumentaion() {
		System.out.println("'문서 프로그램'을 통해 문서를 작성.");

	}

	@Override
	public void searchInternet() {
		System.out.println("'인터넷 브라우저'를 통해 인터넷을 검색.");
	}

}
