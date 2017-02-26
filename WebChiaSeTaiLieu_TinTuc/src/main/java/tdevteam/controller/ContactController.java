package tdevteam.controller;

import org.springframework.stereotype.Controller;  
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;  
import org.springframework.web.bind.annotation.ModelAttribute;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;  
import org.springframework.web.bind.annotation.SessionAttributes;  
import org.springframework.web.servlet.ModelAndView;  

import tdevteam.form.Contact;  
@Controller  
@SessionAttributes
public class ContactController {  
    /*@RequestMapping(value = "/addContact", method = RequestMethod.POST)  
    public String addContact(@ModelAttribute("contact") Contact contact, BindingResult result) {  
        //write the code here to add contact  
        return "homePage";  
    }  */
      
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String homePage(Model model){
		return "homePage";
	}
	
    @RequestMapping("/contact")  
    public ModelAndView showContacts() {  
        return new ModelAndView("contact", "command", new Contact());  
    }  
} 