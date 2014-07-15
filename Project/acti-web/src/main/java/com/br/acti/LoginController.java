package com.br.acti;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/login")
public class LoginController {

	@RequestMapping(value = "/form", method = RequestMethod.GET)
    public String index(Model model ) {
		
		model.addAttribute("acti", "valor do par�metro");
        return "form";
    }
 

	
}