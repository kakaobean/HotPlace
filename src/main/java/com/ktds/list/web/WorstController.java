package com.ktds.list.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WorstController {

	@RequestMapping("/list2")
	public String viewWorstPage() {
		return "list2";
	}
	
}
