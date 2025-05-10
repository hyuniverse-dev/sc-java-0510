package part1.section05_loop;
/*
 * 2. while 문
 * 	조건에 따라 반복하는 제어문
 * 
 * 	while(조건식) {
 * 		// 반복 실행할 코드
 * 	}
 * 
 * 
 */
public class Loop04 {
	
	public static void main(String[] args) {
		
		int sum = 0;
		int i = 1;
		
		while(i <= 10) {
			sum += i;
			i++;
		}
		
		System.out.println("합: " + sum);
		
		
	}

	
	
}







