package com.ktds.list.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BestController {
	@RequestMapping("/list")
	public ModelAndView viewListPage() {
		ModelAndView mv = new ModelAndView();
		
		List<String> hotPlaceList = new ArrayList();
		
		hotPlaceList.add("홍대 쉘위피쉬");
		hotPlaceList.add("구리 인생횟집");
		
		mv.addObject("hotPlaceList", hotPlaceList);
		mv.setViewName("list");
		return mv;
		
	}
}
