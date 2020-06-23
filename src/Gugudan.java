//
//public class Gugudan {
//
//	public static void main(String[] args) {
//		int number = 4;
//		int result = number * 3;
//		System.out.println(result);
//	}
//
//}
//import java.util.Scanner;
//public class Gugudan {
//	public static void main(String[] args) {
//		System.out.println("구구단 중 출력할 단은? : ");
//		Scanner scanner = new Scanner(System.in);
//		int number = scanner.nextInt();
//		System.out.println("사용자가 입력한 값 : " + number);
//		
//		if (number < 2) {
//			System.out.println("값을 잘못 입력했습니다.");
//		}	else if(number > 9) {
//				System.out.println("값을 잘못 입력했습니다.");
//				
//		} else {
//			for(int i = 1; i < 10; i++) {
//				  System.out.println(number * i);
//				}
//		      }
//	
//	}
//}

import java.util.Scanner;
public class Gugudan {
	public static void main(String[] args) {
		System.out.println("구구단 중 출력할 단은? : ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println("사용자가 입력한 값 :" + number);
		
		if (number < 2) {
			System.out.println("값이 잘못 됨");
		} else if(number >10) {
			System.out.println("값이 잘못 됨");
		} else {
			for(int i = 1; i < 10; i++) {
				System.out.println(number * i);
			}
		}
	}
}

