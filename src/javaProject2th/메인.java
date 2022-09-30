package javaProject2th;

public class 메인 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		프로그래머 steveJobs = new 프로그래머("스티브잡스", "자바");
		steveJobs.setAge(65);

		프로그래머 billgates = new 프로그래머("빌 게이츠", "C#");
		billgates.name = "빌 게이츠";
		billgates.setAge(67);
		System.out.println("빌 게이츠의 나이 : " + billgates.getAge());

		프로그래머 hongseunggi = new 프로그래머("홍승기");
		System.out.println(hongseunggi.get현직장("먼휴"));

		System.out.println(billgates.getGender()); // 안찍힘
		billgates.setGender("여성"); // setGender()함수로 변수를 변경
		System.out.println(billgates.getGender()); // 변경된 변수로 다시 함수호출

		포켓몬 피카츄 = new 포켓몬("피카츄", "전기");
		System.out.println(피카츄.속성);
	}

}
