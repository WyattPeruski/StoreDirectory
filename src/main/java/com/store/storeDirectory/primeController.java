package com.store.storeDirectory;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.store.storeDirectory.Dao.PrimeShopDao;
import com.store.storeDirectory.Entity.Inventory;

@Controller
public class primeController {
@Autowired
public PrimeShopDao dao2;

@Autowired
HttpSession session;
	
	@RequestMapping("/primeDirectory")
	public String prime(Model model) {
		
		List<Inventory> list = dao2.findAll();
		model.addAttribute("list", list);
		
		return "primeDirectory";
	}
}
