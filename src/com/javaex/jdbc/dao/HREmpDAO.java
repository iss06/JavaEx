package com.javaex.jdbc.dao;

import java.util.List;

public interface HREmpDAO {

	public List<HREmpVO> getList();
	public HREmpVO get (Long id);
	
	public boolean insert(HREmpVO hrempVo);
	
	public boolean delete(Long id);
	public boolean update(HREmpVO hrempVo);
}
