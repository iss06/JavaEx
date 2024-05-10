package com.javaex.jdbc.dao;

import java.util.List;
import java.util.Scanner;

public class PhoneBook {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			boolean run = true;
			PhoneBookDAO dao = new PhoneBookDAOImpl();
			while (run) {
				System.out.println("**************************************");
				System.out.println("*          전화번호 관리 프로그램          *");
				System.out.println("**************************************");
				System.out.println("1. 리스트 2. 등록 3. 삭제 4. 검색 5. 종료");
				System.out.println("-------------------------------------");
				System.out.print(">메뉴번호: ");

				int menuNum = scanner.nextInt();
				switch (menuNum) {
				case 1:
					System.out.println("<1.리스트>");
					listPhoneBook(dao);
					break;
				case 2:
					System.out.println("<2.등록>");
					insertPhoneBook(dao);
					break;
				case 3:

					break;
				case 4:

					break;
				case 5:
					run = false;
					System.out.println("프로그램을 종료합니다.");
					break;
				default:
					System.out.println("올바른 메뉴를 선택해주세요.");
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void listPhoneBook(PhoneBookDAO dao) {
		List<PhoneBookVO> list = dao.getList();
		if (!list.isEmpty()) {
			for (PhoneBookVO vo : list) {
				System.out.printf("%d\t%s\t%s\t%s%n", vo.getPhoneId(), vo.getPhoneName(), vo.getPhoneHp(),
						vo.getPhoneTel());
			}
		} else {
			System.out.println("데이터가 없습니다.");
		}
	}

	private static void insertPhoneBook(PhoneBookDAO dao) {
		Scanner scanner = new Scanner(System.in);

		System.out.print(">이름:");
		String name = scanner.nextLine();

		System.out.print(">휴대전화: ");
		String hp = scanner.nextLine();

		System.out.print(">집전화: ");
		String tel = scanner.nextLine();

		PhoneBookVO vo = new PhoneBookVO(name, hp, tel);

		PhoneBookDAO phonebookdao = new PhoneBookDAOImpl();
		boolean success = dao.insert(vo);

		System.out.println("PHONE_BOOK INSERT " + (success ? "성공" : "실패"));

		scanner.close();
	}
}