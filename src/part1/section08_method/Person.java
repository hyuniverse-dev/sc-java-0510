package part1.section08_method;

public class Person {
	private int age;	// private 필드

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age <= 0) {
			System.out.println("잘못된 수를 입력하셨습니다.");
			return;
		}
		
		this.age = age;
	}
	

}
