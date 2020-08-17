package Inheritance;
import java.util.*;

//다음은 단위를 변경하는 추상클래스 Converter이다
abstract class Converter {
	
	abstract protected double convert(double src); //추상메소드
	abstract protected String getSrcString(); //추상메소드
	abstract protected String getDestString() ; //추상메소드
	protected double ratio; //비율
	
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println(getSrcString()+"을 " + getDestString() + "로 바꿉니다");
		System.out.println(getSrcString()+ "을 입력하시오 >> ");
		double val =  sc.nextDouble();
		double res = convert(val);
		
		System.out.println("변환결과: " + res + getDestString() + "입니다");
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
		return "원";
	}

	@Override
	protected String getDestString() {
		// TODO Auto-generated method stub
		return "달러";
	}
	
	
}