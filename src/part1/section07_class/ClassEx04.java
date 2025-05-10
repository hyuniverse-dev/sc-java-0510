package part1.section07_class;
/*
 * 필드 기본값 예제
 * 
 */

class Computer {
	
	String cpu = "Intel i5";	// 초기값 지정
	int memory;					// 초기화하지 않음(기본값 0)
	double hdd;					// 초기화하지 않음(기본값 0.0)
	String brand;				// 초기화하지 않음(기본값 null)
}

public class ClassEx04 {
	
	public static void main(String[] args) {
		// 지역변수 초기화 하지 않으면 사용할 수 없음! 기본값 없음!
		String name;
//		System.out.println(name);
		
		
		Computer com1 = new Computer();
		System.out.println(com1.cpu);
		System.out.println(com1.memory);
		System.out.println(com1.hdd);
		System.out.println(com1.brand);
		
	}
	

}







