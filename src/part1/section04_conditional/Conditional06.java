package part1.section04_conditional;
/*
 * switch문 예제
 * 
 */
public class Conditional06 {
	
	public static void main(String[] args) {
		/*
		 * 환불 상태코드
		 * 01 : 환불신청중
		 * 02 : 환불처리중
		 * 03 : 환불취소
		 * 04 : 계좌이체중
		 * 05 : 환불완료
		 * 
		 * 01, 02, 04 상태일때 환불신청 불가! 
		 * 
		 */
		
		String sttCd = "03";
		
		switch(sttCd) {
		case "01":
		case "02":
		case "04":
			System.out.println("환불불가, 관리자에게 문의하세요.");
			System.out.println("환불상태코드: " + sttCd);
			
			return;
		}
		
		if(sttCd == "01" || sttCd == "02" || sttCd == "04") {
			System.out.println("환불불가, 관리자에게 문의하세요.");
			System.out.println("환불상태코드: " + sttCd);
			
			return;
		}
		
		
		//환불신청
		System.out.println("환불신청 완료되었습니다!");
		
	}

}










