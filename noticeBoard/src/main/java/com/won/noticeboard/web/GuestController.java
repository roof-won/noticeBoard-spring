package com.won.noticeboard.web;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.won.noticeboard.domain.BoardDTO;
import com.won.noticeboard.service.GuestService;

@Controller
public class GuestController {
	
	@Inject
	private GuestService guestService;
	
	@RequestMapping(value = "/", method=RequestMethod.GET)
	public String index(Model model){
		System.out.println("Ddd");
		return "index";
	}
	
	@RequestMapping(value = "/guest/writeform", method=RequestMethod.GET)
	public String writeform(Model model){
		return "guest/writeform";
	}
	
	@RequestMapping(value = "/guest/write", method=RequestMethod.POST)
	public String write(BoardDTO dto, Model model){
		guestService.insertGuest(dto);
		return "redirect:/list";
	}

	@RequestMapping(value = "/guest/list", method=RequestMethod.POST)
	public String write(Model model){
		model.addAttribute("glist",guestService.listGuest());
		return "guest/list";
	}
}
