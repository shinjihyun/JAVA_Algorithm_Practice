package chap01;             // 패키지명 : chap01
import java.util.Scanner;   // import + java.util.Sca 까지 타이핑친 상태에서 Ctrl+space bar누르면 자동완성됩니다.
// 3개의 정숫값을 입력하고 최댓값을 구합니다.

public class JA_Max3 {      // 클래스명 : JA_Max3 (JAVA ALGORITHM_Max3)
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("세 정수의 최댓값을 구합니다.");
		System.out.print("a의 값 : "); int a = stdIn.nextInt();
		System.out.print("b의 값 : "); int b = stdIn.nextInt();
		System.out.print("c의 값 : "); int c = stdIn.nextInt();
    
    // a,b,c의 최댓값을 구하여 max에 대입
		int max=a;  
		if(b>max) max=b;
		if(c>max) max=c;
		
		System.out.println("최댓값은 "+ max + "입니다.");
		
	}
}
