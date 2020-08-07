package honux.calendar;

import java.util.Scanner;

public class Prompt {

	public void printMenu() {
		System.out.println("+----------------------+");
		System.out.println("| 1. 일정 등록 ");
		System.out.println("| 2. 일정 검색");
		System.out.println("| 3. 달력 보기");
		System.out.println("| h. 도움말      q. 종료");
		System.out.println("+----------------------+");
	}

	/*
	 * @param week 요일명
	 * 
	 * @return 0~6 (0 = Sunday, 6 = Saturday)
	 * 
	 */

	public int parseDay(String week) {
		if (week.equals("SU")) {
			return 0;
		} else if (week.equals("MO")) {
			return 1;
		} else if (week.equals("TU")) {
			return 2;
		} else if (week.equals("WE")) {
			return 3;
		} else if (week.equals("TH")) {
			return 4;
		} else if (week.equals("FR")) {
			return 5;
		} else if (week.equals("SA")) {
			return 6;
		} else {
			return 0;
		}
	}

	public void runPrompt() {
		printMenu();

		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();

		while (true) {
			System.out.println("명령 (1, 2, 3, h, q)");
			String cmd = scanner.next();
			if (cmd.equals("1")) {
				cmdRegister();
			} else if (cmd.equals("2")) {
				cmdSearch();
			} else if (cmd.equals("3")) {
				cmdCal(scanner, cal);
			} else if (cmd.equals("h")) {
				printMenu();
			} else if (cmd.equals("q")) {
				System.out.println("Thank you. Bye~");
				break;
			}

		}
	}

	private void cmdCal(Scanner s, Calendar c) {

		int month = 1;
		int year = 2020;

		System.out.println("년도를 입력하세요.");
		System.out.print("YEAR> ");
		year = s.nextInt();

		System.out.println("달을 입력하세요.");
		System.out.print("MONTH> ");
		month = s.nextInt();

		if (month > 12 || month < 1) {
			System.out.println("잘못된 입력입니다.");
			System.out.println();
			return;
		}

		c.printCalendar(year, month);
	}

	private void cmdSearch() {
		// TODO Auto-generated method stub

	}

	private void cmdRegister() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		// 셀 실행
		Prompt p = new Prompt();
		p.runPrompt();
	}
}
