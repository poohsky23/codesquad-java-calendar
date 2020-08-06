package honux.calendar;

import java.util.Scanner;

public class Calendar {
	
	private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	
	public int getmaxDaysOfMonth(int month) {
		return MAX_DAYS[month - 1];
	}

	public static void main(String[] args) {

		// 숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램
		// 숫자를 입력받는다.
		System.out.println("달을 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();
		int month = scanner.nextInt();

		// 조건 문으로 판단 후 출력
		System.out.printf("%d달은 %d일까지 있습니다.\n", month, cal.getmaxDaysOfMonth(month));
		scanner.close();
	}
}
