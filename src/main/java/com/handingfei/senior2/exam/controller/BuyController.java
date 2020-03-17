package com.handingfei.senior2.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.handingfei.senior2.exam.domain.Buy;
import com.handingfei.senior2.exam.service.BuyService;

@Controller
public class BuyController {

	@Autowired
	private BuyService buyService;
	
	@RequestMapping("buycar")
	public String buycar(Model m,@RequestParam(defaultValue = "1")Integer pageNum,
			
			@RequestParam(defaultValue = "5")Integer pageSize) {
		
		List<Buy> list = buyService.buycar(pageNum,pageSize);
		
		m.addAttribute("buycar", list);
		
		return "buycar";
	}

	@ResponseBody
	@RequestMapping("add")
	public Object add(Buy buy) {
		
		try {
			buyService.add(buy);
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "add";
	}
	
	@ResponseBody
	@RequestMapping("update")
	public Object update(Buy buy) {
		
		try {
			buyService.update(buy);
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "update";
	}
	
	@RequestMapping("chauxn")
	@ResponseBody
	public Object chaxun(int id) {
		
		try {
			buyService.chaxun(id);
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "chaxun";
	}
	
}
