package com.handingfei.senior2.exam.service;

import java.util.List;

import com.handingfei.senior2.exam.domain.Buy;

public interface BuyService {

	List<Buy> buycar(Integer pageNum, Integer pageSize);

	void add(Buy buy);

	void update(Buy buy);

	void chaxun(int id);

}
