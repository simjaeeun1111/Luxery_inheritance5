package Inheritance;

//���� main�޼ҵ�� �������� �����Ͽ� ���� 1�� ColorTv�� ��ӹ޴� IpTv Ŭ������ �ۼ��Ͽ���

class IPTV extends ColorTV{

	private String inchsize;

	public IPTV(String inchsize,int size, String color) {
		super(size, color);
		this.inchsize = inchsize;
	}
	
//	protected String getinchsize() { return inchsize; }

	
	public void printProperty() {
		System.out.print("���� IPTV�� " + inchsize );
		super.printProperty();
	}
	
}




public class ColorTvEx2 {
	public static void main(String[] args) {
		IPTV iptv = new IPTV("192.1.1.2" ,32 , "2048"); //"192.1.1.2" �ּҿ� 32��Ƽ , 2048�÷�
		iptv.printProperty();
	}
}
