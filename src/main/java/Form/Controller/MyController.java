package Form.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import Form.Entity.LoginData;

@Controller
public class MyController {
	@GetMapping("/form")
	public String openForm(Model model) {
		model.addAttribute("loginData", new LoginData());
		return "form";
		
	}
	
	//handeller for post data
	@PostMapping("/process")
	//@ModelAttribute("loginData"): This annotation is used to bind the submitted form data to a Java object. 
	public String processForm(@ModelAttribute("loginData") LoginData loginData) {
		System.out.println(loginData);
		
		return "success";
	}

}
