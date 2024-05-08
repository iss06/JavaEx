package com.javaex.jdbc.dao;

import java.util.Iterator;
import java.util.List;

public class HREmpListApp {

	public static void main(String[] args) {
		listEmp();
		System.out.println();

	}
	
	private static void listEmp() {
		HREmpDAO dao = new HREmpDAOImplOracle();
		System.out.println("============== NAME ==============");
		
		List<HREmpVO> list = dao.getList();
		if (list != null && !list.isEmpty()) {
			Iterator<HREmpVO> it = list.iterator();
			
			while (it.hasNext()) {
				HREmpVO vo = it.next();
				System.out.printf("%s\t%s%n", vo.getEmpName(), vo.getManName());
			}
		} else {
			System.out.println("데이터가 없습니다.");
		}
	}

}
