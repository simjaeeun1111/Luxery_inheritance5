package Inheritance;

//main �޼ҵ�� ���� ����� �����Ͽ� TV�� ��ӹ��� ColorTVŬ������ �ϼ��Ͽ���
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
		System.out.println(getSize()+"��ġ" +getColor()+"�÷�");
	}


}

public class ColorTVEx {
	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32,"1024");
		myTV.printProperty();
	}
}
