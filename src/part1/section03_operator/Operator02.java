package part1.section03_operator;
/*
 * 2. 증감연산자
 * 	++ : 1씩 증가시킨다.
 * 	-- : 1씩 감소시킨다.
 * 
 */
public class Operator02 {
	
	public static void main(String[] args) {
		
		int num = 0;
		num = num + 1;
		System.out.println("num : " + num);	// num: 1
		++num;	// num 1증가	  num = num + 1
		System.out.println("num : " + num);	// num: 2
		
		int num2 = 0;
		
		// 전위 증감연산자 - 명령어가 실행전 1증가
		System.out.println(++num2);
		// 후위 증감연산자 - 명령어가 실훙후 1증가
		System.out.println(num2++);
		System.out.println(num2);
		
		System.out.println(--num2);
		System.out.println(num2--);
		System.out.println(num2);
		
	}

}







