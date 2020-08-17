package Inheritance;

import java.util.Scanner;

interface Stack{
	int length(); //���� ���ÿ� ����� ���� ����
	int capacity(); //���ÿ� ���尡���� ���� ����
	String pop(); //������ �鿡 �Ǽ� ����
	boolean push(String val); //������ �鿡 ����� �Ǽ� ����
}

class StringStack implements Stack{
	private int num; //���� ������ ����
	private int set; //���� �ε���
	private String[] stack;
	
	public StringStack(int num) {
		this.num = num;
		this.set = 0;
		stack = new String[num];
	}

	@Override
	public int length() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int capacity() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String pop() {
		if(set -1< 0) //stack�� �ƹ��͵� ���� �ʾ��� �� 
			return null;
		set--;
		String s = stack[set]; //�� ���� ��
		return s;
		return null;
	}

	@Override
	public boolean push(String val) {
		if(set < num) {
			stack[set] = val; //�� ���� ���ڿ��� �־���
			set++; //stack ��ĭ�� �÷���
			return true;
		}
		else
			return false;
	}	
}
public class StackApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ���� ���� ������ ũ�� �Է�");
		int num = sc.nextInt();
		StringStack stack = new StringStack(num);
		
		while(true) {
			System.out.print("���ڿ� �Է�>>");
			String val = sc.next();
			if(val.equals("�׸�"))
				break;
			if(!stack.push(val)) {
				System.out.println("���ÿ� �� ���� Ǫ�� �Ұ�");
			}
		}
		
		System.out.print("���ÿ� ����� ��� ���ڿ� ��");
		int len = stack.length();
		for(int i=0; i<len; i++) {
			String s = stack.pop();
			System.out.print(s + " ");
		}
		sc.close();
	}
}
