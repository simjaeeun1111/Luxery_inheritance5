package Inheritance;

//다음 main메소드와 실행결과를 참고하여 문제 1의 ColorTv를 상속받는 IpTv 클래스를 작성하여라

class IPTV extends ColorTV{

	private String inchsize;

	public IPTV(String inchsize,int size, String color) {
		super(size, color);
		this.inchsize = inchsize;
	}
	
//	protected String getinchsize() { return inchsize; }

	
	public void printProperty() {
		System.out.print("나의 IPTV는 " + inchsize );
		super.printProperty();
	}
	
}




public class ColorTvEx2 {
	public static void main(String[] args) {
		IPTV iptv = new IPTV("192.1.1.2" ,32 , "2048"); //"192.1.1.2" 주소에 32인티 , 2048컬러
		iptv.printProperty();
	}
}
