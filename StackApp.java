package Inheritance;

import java.util.Scanner;

interface Stack{
	int length(); //현재 스택에 저장된 개수 리턴
	int capacity(); //스택에 저장가능한 개수 리턴
	String pop(); //스택의 톱에 실수 저장
	boolean push(String val); //스택의 톱에 저장된 실수 리턴
}

class StringStack implements Stack{
	private int num; //저장 가능한 개수
	private int set; //저장 인덱스
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
		if(set -1< 0) //stack에 아무것도 넣지 않았을 떄 
			return null;
		set--;
		String s = stack[set]; //맨 위의 값
		return s;
		return null;
	}

	@Override
	public boolean push(String val) {
		if(set < num) {
			stack[set] = val; //맨 위에 문자열을 넣어줌
			set++; //stack 한칸을 올려줌
			return true;
		}
		else
			return false;
	}	
}
public class StackApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("총 스택 저장 공간의 크기 입력");
		int num = sc.nextInt();
		StringStack stack = new StringStack(num);
		
		while(true) {
			System.out.print("문자열 입력>>");
			String val = sc.next();
			if(val.equals("그만"))
				break;
			if(!stack.push(val)) {
				System.out.println("스택에 꽉 차서 푸시 불가");
			}
		}
		
		System.out.print("스택에 저장된 모든 문자열 팝");
		int len = stack.length();
		for(int i=0; i<len; i++) {
			String s = stack.pop();
			System.out.print(s + " ");
		}
		sc.close();
	}
}
