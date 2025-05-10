package part1.section05_loop;
/*
 * 3. do-while 문
 * 	최소 한번은 실행하는 반복문
 * 
 * 	do {
 *		// 반복 실행할 코드 
 * 	} while(조건식);
 * 
 */
public class Loop05 {
	
	public static void main(String[] args) {
		
		int sum = 0;
		int i = 1;
		
		do {
			sum += i;
			i++;
		} while(i <= 10);
		
		System.out.println("합: " + sum);
		
	}
}









