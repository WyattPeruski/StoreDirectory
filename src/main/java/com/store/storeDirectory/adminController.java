package com.store.storeDirectory;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.store.storeDirectory.Dao.PrimeDao;
import com.store.storeDirectory.Entity.Results;

@Controller
public class adminController {
	@Autowired
	private PrimeDao dao1;
	@Autowired
	private HttpSession session;
	
		
	@RequestMapping("/adminPrivledges")
	public String admin(Model model, RedirectAttributes redir) {
		Results results = (Results) session.getAttribute("name");
		if (results == null) {
			redir.addFlashAttribute("message", "Wait! Please log in.");
			return "redirect:/Login";
		}
		if(results.getAdmin() != 1) {
			redir.addFlashAttribute("message", "Sorry you are not an admin!!!");
			
			return "redirect:/";
			
		}
		else {
		
		return "adminPrivledges";
		}
	}
}
