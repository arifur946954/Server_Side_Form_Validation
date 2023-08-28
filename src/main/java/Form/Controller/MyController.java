package Form.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import Form.Entity.LoginData;
import jakarta.validation.Valid;

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
	public String processForm(@Valid @ModelAttribute("loginData") LoginData loginData,BindingResult result) {
		if (result.hasErrors()) {
			System.out.println(result);
		     return "form";
		}
		System.out.println(loginData);
		
		return "success";
	}

}
