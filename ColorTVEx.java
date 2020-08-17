package Inheritance;

//main 메소드와 실행 결과를 참고하여 TV를 상속받은 ColorTV클래스를 완성하여라
class TV{
	private int size;
	
	public TV(int size)
	{this.size = size;}
	
	protected int getSize(){
		return size;
	}	
}

class ColorTV extends TV{
	private String color;
	
	public ColorTV(int size ,String color) {
		super(size);
		// TODO Auto-generated constructor stub
		this.color = color;
	}
	
	protected String getColor() {
		return color;
	}
	
	public void printProperty() {
		System.out.println(getSize()+"인치" +getColor()+"컬러");
	}


}

public class ColorTVEx {
	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32,"1024");
		myTV.printProperty();
	}
}
