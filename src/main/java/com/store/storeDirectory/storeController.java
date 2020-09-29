package com.store.storeDirectory;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.store.storeDirectory.Dao.PrimeDao;
import com.store.storeDirectory.Entity.Results;

@Controller
public class storeController {

	@Autowired
	private PrimeDao dao1;
	
	@Autowired
	HttpSession session;
	
	@RequestMapping("/")
	public String Home() {
		
		
		return "Home";
	}
	
	@RequestMapping("/Login")
	public String Login() {
		
		
		return "Login";
	}

	@PostMapping("/Login")
	public String Submit(Model model, @RequestParam("username") String username,
			@RequestParam("password")String password,
			RedirectAttributes redir, String message) {
		
		Results name = dao1.findByUsername(username);
		if(name == null || !password.equals(name.getPassword())) {
			
			model.addAttribute("message","Incorrect password!");
			
			return "Login";
			
			
		}
		
		
		session.setAttribute("name", name);
		return "redirect:/";
		
	}
	@RequestMapping("/logout")
	public String logout(RedirectAttributes redir) {
		
		session.invalidate();
		
		redir.addFlashAttribute("message", "Logged out.");
		return "redirect:/";
	}
	
	@RequestMapping("/signup")
	public String signup() {
		
		
		
		
		return "signup";
	}
	@PostMapping("/signup")
	public String submitsignup(Results result, Model model, RedirectAttributes redir) {
		dao1.save(result);
		session.setAttribute("name", result);
		
		
		
		return "redirect:/";
	}

}