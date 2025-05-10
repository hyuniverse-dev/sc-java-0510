package part1.section05_loop;
/*

1번 - 분석하기
*
**
***
****
*****
******
*******

2번
   *
  **
 ***
****

3번
   *
  ***
 *****
******* 
  
4번
		 i < 7		j < 7
   *   	 0	        4, 5, 6  (j > 3 + i)
  ***	 1			5, 6     (j > 3 + i)
 *****	 2			6        (j > 3 + i)
*******	 3	
 *****	 4		    6		 (j > 9-i)
  ***	 5			5, 6	 (j > 9-i)	
   *	 6			4, 5, 6  (j > 9-i)
 

 */

public class LoopHomeWork01 {
	
	public static void main(String[] args) {
		
		for(int i=0; i < 7; i++) {
			
			for(int j=0; j < 7; j++) {
				
				if(i < 4) {
					if(j < 3-i) {
						System.out.print(" ");
					} else if(j > 3+i) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
					
				} else {
					
					if(j < i-3) {
						System.out.print(" ");
					} else if(j > 9-i) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
					
				}
				
			}
			
			System.out.println();
			
		}
		
				
	}

}










