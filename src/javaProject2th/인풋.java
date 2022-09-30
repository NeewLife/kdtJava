package javaProject2th;

import java.io.Console;
import java.util.Scanner;

public class 인풋 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inputNum;
		//inputNum = 키보드로부터 입력값;
		//1. console클래스를 이용해서 받기 -> 이클립스의 버
		//2. Scanner클래스를 이용해서 받기
		System.out.print("홀수인지 짝수인지 판단할 숫자를 입력해주세요 : ");
		Scanner scanner = new Scanner(System.in);
		inputNum = scanner.nextInt();
		if(isOdd(inputNum) == true) {
			System.out.println("홀수");
		}else {
			System.out.println("짝수");
		}
		System.out.println("입력받은 숫자 : "+inputNum);
		System.out.println(isOdd(inputNum));
		scanner.close();
		
	}
	
	public static boolean isOdd(int num) {
		if(num%2 ==1) {
			return true;
		}else {
			return false;
		}
	}

}
