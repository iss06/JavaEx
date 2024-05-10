package com.javaex.jdbc.dao;

import java.util.List;

public interface PhoneBookDAO {

	public List<PhoneBookVO> getList();

	public PhoneBookVO get(Long id);

	public boolean insert(PhoneBookVO phonebookVo);

	public boolean delete(Long id);

	public boolean update(PhoneBookVO phonebookVo);
}
