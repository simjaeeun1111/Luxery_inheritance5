package Inheritance;
import java.util.*;

//������ ������ �����ϴ� �߻�Ŭ���� Converter�̴�
abstract class Converter {
	
	abstract protected double convert(double src); //�߻�޼ҵ�
	abstract protected String getSrcString(); //�߻�޼ҵ�
	abstract protected String getDestString() ; //�߻�޼ҵ�
	protected double ratio; //����
	
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println(getSrcString()+"�� " + getDestString() + "�� �ٲߴϴ�");
		System.out.println(getSrcString()+ "�� �Է��Ͻÿ� >> ");
		double val =  sc.nextDouble();
		double res = convert(val);
		
		System.out.println("��ȯ���: " + res + getDestString() + "�Դϴ�");
		sc.close();
	}
}

class Won2Dollar extends Converter{
	
	public Won2Dollar(double ratio) {
		this.ratio = ratio;
	}

	@Override
	protected double convert(double src) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected String getSrcString() {
		// TODO Auto-generated method stub
		return "��";
	}

	@Override
	protected String getDestString() {
		// TODO Auto-generated method stub
		return "�޷�";
	}
	
	
}