package com.javaex.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PhoneBookDAOImpl implements PhoneBookDAO {
	private Connection getConnection() throws SQLException {
		Connection conn = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String dburl = "jdbc:oracle:thin:@localhost:1521:xe";

			conn = DriverManager.getConnection(dburl, Database.DB_USER, Database.DB_PASS);
		} catch (ClassNotFoundException e) {
			System.err.println("드라이버를 찾을 수 없습니다.");
		}

		return conn;
	}

	@Override
	public List<PhoneBookVO> getList() {
		List<PhoneBookVO> list = new ArrayList<>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			conn = getConnection();
			stmt = conn.createStatement();
			String sql = "SELECT phone_id, phone_name, phone_hp, phone_tel FROM PHONE_BOOK";
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				Long phoneId = rs.getLong(1);
				String phoneName = rs.getString(2);
				String phoneHp = rs.getString(3);
				String phoneTel = rs.getString(4);

				PhoneBookVO vo = new PhoneBookVO(phoneId, phoneName, phoneHp, phoneTel);
				list.add(vo);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {

			}
		}

		return list;
	}

	@Override
	public PhoneBookVO get(Long id) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		PhoneBookVO vo = null;

		try {
			conn = getConnection();

			String sql = "SELECT phone_id, phone_name, phone_hp, phone_tel FROM PHONE_BOOK " + "WHERE id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setLong(1, id);

			rs = pstmt.executeQuery();

			if (rs.next()) {
				Long phoneId = rs.getLong(1);
				String phoneName = rs.getString(2);
				String phoneHp = rs.getString(3);
				String phoneTel = rs.getString(4);

				vo = new PhoneBookVO(phoneId, phoneName, phoneHp, phoneTel);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
		}
		return vo;
	}

	@Override
	public boolean insert(PhoneBookVO phonebookVo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int insertedCount = 0;

		try {
			conn = getConnection();

			String sql = "INSERT INTO PHONE_BOOK (phone_id, phone_name, phone_hp, phone_tel) "
					+ "VALUES (seq_phone_id.NEXTVAL, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, phonebookVo.getPhoneName());
			pstmt.setString(2, phonebookVo.getPhoneHp());
			pstmt.setString(3, phonebookVo.getPhoneTel());

			insertedCount = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {

			}
		}
		return insertedCount == 1;
	}

	@Override
	public boolean delete(Long id) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int deletedCount = 0;

		try {
			conn = getConnection();

			String sql = "DELETE FROM PHONE_BOOK WHERE phone_id=?";
			pstmt = conn.prepareStatement(sql);

			pstmt.setLong(1, id);

			deletedCount = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
		}
		return deletedCount == 1;
	}

	@Override
	public boolean update(PhoneBookVO phonebookVo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int updatedCount = 0;

		try {
			conn = getConnection();

			String sql = "UPDATE PHONE_BOOK SET phone_name=?, phone_hp=?, phone_tel=? WHERE phone_id=?";
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, phonebookVo.getPhoneName());
			pstmt.setString(2, phonebookVo.getPhoneHp());
			pstmt.setString(3, phonebookVo.getPhoneTel());
			pstmt.setLong(4, phonebookVo.getPhoneId());

			updatedCount = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {

			}
		}
		return updatedCount == 1;
	}

}
