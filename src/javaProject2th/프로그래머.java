package javaProject2th;

// 변수가 제일 위에
public class 프로그래머 {
	String name;
	private int age;
	private String gender;
	double 연차;
	String 주언어;
	private String 현직장 = "휴먼";

	// 그 다음에 생성자
	// 생성자 = 이 설계도대로 인스턴스를 생성할 때 호출하는 놈
	public 프로그래머(String name, String 주언어) {
		this.name = name;
		this.주언어 = 주언어;
	}

	public 프로그래머(String name) {
		this.name = name;
	}

	// 그 다음에 함수
	public void 쿼리작성() {
		System.out.println(name + "이 쿼리를 작성합니다.");
	}

	public boolean 자바함수작성(String functionName) {
		System.out.println(name + "이 자바의 함수를 작성합니다.");
		return false;
	}

	public boolean 자바설치(int version) {
		System.out.printf("%s이(가) 자바 버전%d을(를) 설치합니다.", name, version);
		return false;
	}

	public String get현직장(String 현직장) {
		this.현직장 = 현직장;
		return this.현직장;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		if (age < 0 || age >= 200) {
			return;
		} else {
			this.age = age;
		}
	}

}
