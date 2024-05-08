package com.javaex.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class HREmpDAOImplOracle implements HREmpDAO {
	private Connection getConnection() throws SQLException {
		Connection conn = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String dburl = "jdbc:oracle:thin:@localhost:1521:xe";

			conn = DriverManager.getConnection(dburl, DatabaseConfig.DB_USER, DatabaseConfig.DB_PASS);
		} catch (ClassNotFoundException e) {
			System.err.println("드라이버를 찾을 수 없습니다.");
		}

		return conn;
	}

	@Override
	public List<HREmpVO> getList() {
		List<HREmpVO> list = new ArrayList<>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			String sql = "SELECT emp.first_name || ' ' || emp.last_name AS name,"
					+ " man.first_name || ' ' || man.last_name AS manager " + "FROM employees emp JOIN employees man "
					+ "ON emp.manager_id = man.employee_id " + "ORDER BY name DESC";
			rs = stmt.executeQuery(sql);
			
				while (rs.next()) {
					String empName = rs.getString(1);
					String manName = rs.getString(2);
					
					HREmpVO vo = new HREmpVO(empName, manName);
					list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
		        if (rs != null) rs.close();
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }
		    try {
		        if (stmt != null) stmt.close();
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }
		    try {
		        if (conn != null) conn.close();
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }
		}
		return list;
	}

	@Override
	public HREmpVO get(Long id) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		HREmpVO vo = null;
		
		try {
			conn = getConnection();
			
			String sql = "SELECT emp.first_name || ' ' || emp.last_name AS name,"
	                + " man.first_name || ' ' || man.last_name AS manager " 
	                + "FROM employees emp JOIN employees man ON emp.manager_id = man.employee_id "
	                + "WHERE emp.employee_id = ?"  
	                + "ORDER BY emp.first_name || ' ' || emp.last_name DESC";
			pstmt = conn.prepareStatement(sql);
			pstmt.setLong(1, id);
			
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				String empName = rs.getString(1);
				String manName = rs.getString(2);
				
				vo = new HREmpVO(empName, manName);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) rs.close();
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (Exception e) {}
		}
		return vo;
	}

	@Override
	public boolean insert(HREmpVO hrempVo) {
		
		return false;
	}

	@Override
	public boolean delete(Long name) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(HREmpVO hrauthorVo) {
		// TODO Auto-generated method stub
		return false;
	}

}
