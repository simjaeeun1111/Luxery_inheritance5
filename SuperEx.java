package Inheritance;
//super�� �̿��Ͽ� ColorPointŬ������ �����ڿ��� ���� Ŭ������ Point �����ڸ� ȣ���ϴ� ���� ���δ�.

class Point{
	private int x,y;  //�� ���� �����ϴ� x,y��ǥ

	public Point() {
		this.x = this.y =0;
	}
	
	public Point(int x , int y) {
		this.x = x;
		this.y = y;
	}
	public void showPoint() { //���� ��ǥ ���
		System.out.println("(" + x + ","+")");
	}
}

class ColorPoint extends Point{
	private String color; //���� ��
	
	public ColorPoint(int x, int y ,String color) {
		super(x, y);
		this.color = color;
	}
	
	public void showColorPoint() { //�÷� ���� ��ǥ ���
		System.out.println(color);
		showPoint(); //Point Ŭ������ showPoint() ȣ��
	}
}

public class SuperEx {
	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5,6,"blue");
		cp.showColorPoint();
	}
}
