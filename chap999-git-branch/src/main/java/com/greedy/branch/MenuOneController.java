package com.greedy.branch;

import org.springframework.stereotype.Controller;

@Controller
public class MenuOneController {
	
	@GetMappping("/menu1")
	public void menu1(Model model) {
		
		model.addAttribute("mesaage"," menu1 결과");
		
	}

}
