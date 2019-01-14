// 보충수업 1-1 키보드로 숫자와 문자열 입력하기(1)

package chap01;
import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		// 위 문장은 main 메서드 맨 앞에 작성. System.in은 키보드와 연결된 표준 입력 스트림(standard input stream)
		// 변수명 : stdIn(변경가능)
		
		stdIn.nextInt();	// 초기화
		// stdIn.nextInt()가 호출되면 키보드로 입력한 정숫값을 얻을 수 있다.
		/* 예) a=stdIn.nextInt()에 키보드로 입력한 정숫값을 변수에 저장하는 과정
 			1. System.in을 통해 키보드로 정수를 입력
 			(stdIn은 키보드와 연결된 표준 입력 스트림(System.in)에서 문자나 숫자를 꺼내는 장치 역할을 합니다.)
 			2. stdIn 변수를 통해 nextInt()한 값을 a방에 입력
		 */
		// 입력값은 int형의 범위(-2,147,483,648~2,147,483,647)로 제한합니다.
		// 알파벳이나 기호 등은 입력할 수 없습니다. 
	}
}
