package koreait.day02;

public class C05_IntegerVar {

	public static void main(String[] args) {
		/* 1. main 메소드 안에서만 사용하는 지역변수를 선언합니다.
		 * 2. 기본형 (primitive) 데이터 타입 : 정수형식
 		 * 		byte, short, int, long 키워드(역할이 정해진 단어)
		 */

		byte n1; 		//byte형식의 데이터를 저장할공간. 이름은n1
		short n2;
		int n3;
		long n4;
		
		n1=123; //대입문: 오른쪽변수(123이) 왼쪽변수(n1)으로 대입됨
	//	n1=999;	//오류생김 Byte에서 저장할수있는 메모리를넘어서  127보다 큰값
		n2=29999;
		//n2=-40000;	//오류 short의 최솟값-32768보다 작은값
		n3=123456789;
		//n3=1234567890123;	//오류 int의최댓값 2147483647보다 커서
		//n4=1234567890123;	//오류:1234567890123 리터럴은 int리터럴이므로 표현오류
		n4=123; 		//오류안생기는 이유는 integer리터럴로 표현할수있는 값이라서
		//integer리터럴로 표현할수있는 값(2147483647)보다 크다면L을써줘야 long값으로표현됨
		n4=1234567890123L;	//long리터럴 표시는: L또는 ㅣ을 마지막에 씁니다.
		
		System.out.println("변수 n1="+n1);
		System.out.println("변수 n2="+n2);
		System.out.printf("변수 %s=%d \n","n3",n3);
		System.out.printf("변수 %s=%d \n","n4",n4);
		
		
		
		byte m1=100; 		
		short m2=100;
		int m3=100;
		long m4=100;
		
//		System.out.println(n1);	//초기값이 없어서 오류가나옴
		
	

	}//main 메소드끝

}
/*변수 : 메모리에 저장된 값 중에서 변경할 수 있는 데이터를 말합니다.
 *    변수는 프로그램이 실행되는 동안에 임시로 사용하는 메모리 공간입니다.
 *	    데이터가 저장된 메모리에 접근하기 위해서 변수명(식별자:중복된 이름사용안됨)을 부여합니다.
 *    변수 선언한다 -> 변수명과 데이터 형식을 지정하는 것.-> 메모리에 공간 할당 됩니다.
 *    **리터럴:  리터럴은 변수의 값이 변하지 않는 데이터(메모리 위치안의  값)를 의미

 */
