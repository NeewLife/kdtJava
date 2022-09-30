package javaProject2th;

public class 배열 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] rainbow = {"빨", "주", "노", "초", "파", "남", "보"};
		String[] 카카시 = rainbow.clone();
		카카시[2] = "노란색";
		for(String 색깔 : rainbow) {
			System.out.println(색깔);
		}
		String[] 태양계 = {"수", "금", "지", "화", "목", "토", "천", "해","명"};
		for(int i = 0; i<태양계.length; i++) {
			if(태양계[i].equals("명")) {
				태양계[i] = "";
			}
		}
		for(String 행성 : 태양계) {
			System.out.println(행성);
		}
		
		
		//태양계라는 수금지화목토천해명 각각 문자열이 들어있는 배열을 만들고 
		//태양계에서 "명" 에 들어있는 값 ""로 바꿔보세요.
	}
	

	
} 
