package part1.section03_operator;
/*
 * 7. 쉬프트연산자
 * 	<< : 지정한 수만큼 비트를 전부 왼쪽으로 이동시킴
 * 	>> : 부호를 유지하면서 지정한 수만큼 비트를 전부 오른쪽으로 이동시킴
 * 
 */
public class Operator07 {
	
	public static void main(String[] args) {
		
		int x = 3;	// 0011
		int y = 7;	// 0111
		
		System.out.println(x << 2);		// 0011 << 2 -> 1100 
		System.out.println(y >> 2);		// 0111 >> 2 -> 0001
		
	}

}









