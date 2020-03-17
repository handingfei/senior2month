package com.handingfei.senior2.exam.dao;

import java.util.List;

import com.handingfei.senior2.exam.domain.Buy;

public interface BuyMapper {

	List<Buy> buycar(Integer pageNum, Integer pageSize);

	void add(Buy buy);

	void update(Buy buy);

	void chaxun(int id);

	
}
