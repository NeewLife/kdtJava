package javaProject2th;

import java.lang.ProcessBuilder.Redirect.Type;
import java.util.Scanner;

public class 문제1 {
	public static int getLength() {
		String input="";
		Scanner sc = new Scanner(System.in);
		System.out.println("길이를 분석할 문자열을 입력해주세요 : ");
//		input = sc.next();        얘는 '공백'을 기준으로 끊어버림..
		input = sc.nextLine(); // 얘는 '라인'을 기준으로 끊음
		
		return input.length() ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(isClean());
		System.out.println(getLength());
		System.out.println(plus());
	}
	// 숫자 2개를 받아서 정수로 깔끔하게 나누어 떨어지는지
	public static boolean isClean() {
		Scanner sc = new Scanner(System.in);
		System.out.println("나눠질 수를 입력해주세요");
		int 나눠질수 = sc.nextInt();
		System.out.println("나눌 수를 입력해주세요");
		int 나눌수 = sc.nextInt();
		sc.close();
		if(나눠질수%나눌수 == 0) {
			return true;
		}else {
			return false;
		}
	}
	// 문자열 하나를 입력받아서 공백을 포함한 문자열의 길이 출력

	// 숫자 2개를 띄워쓰기로 한번에 입력받아서 합치는 plus함수를 만들어보세요.
	public static int plus() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 2개를 띄워쓰기로 입력해주세요.");
		int sum = 0;
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sum = num1 + num2;
		return sum;
		
	}
	// 숫자가 몇개 들어올지 모르지만 한줄에 공백으로 구분되어 입력되면
	// 그것을 다 합치는 sum 함수를 만들어보세요
	// 예) 2 5 9 11	이면 4개 들어온거ㅣ
	
}
