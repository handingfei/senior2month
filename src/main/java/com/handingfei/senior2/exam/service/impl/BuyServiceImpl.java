package com.handingfei.senior2.exam.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.handingfei.senior2.exam.dao.BuyMapper;
import com.handingfei.senior2.exam.domain.Buy;
import com.handingfei.senior2.exam.service.BuyService;

@Service
public class BuyServiceImpl implements BuyService {

	@Autowired
	private BuyMapper buyMapper;

	@Override
	public List<Buy> buycar(Integer pageNum, Integer pageSize) {
		
		return buyMapper.buycar(pageNum,pageSize);
	}

	@Override
	public void add(Buy buy) {
		
		buyMapper.add(buy);
	}

	@Override
	public void update(Buy buy) {

		buyMapper.update(buy);
	}

	@Override
	public void chaxun(int id) {
		// TODO Auto-generated method stub
		buyMapper.chaxun(id);
	}
}
