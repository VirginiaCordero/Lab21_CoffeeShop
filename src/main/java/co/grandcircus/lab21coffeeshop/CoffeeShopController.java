package co.grandcircus.lab21coffeeshop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CoffeeShopController {
	
	@RequestMapping("/")
	public ModelAndView showHomePage() {
			ModelAndView mav = new ModelAndView("index");
			return mav;			
	}
	
	@RequestMapping("/registration")
	public ModelAndView showRegistrationPage() {
			ModelAndView mav = new ModelAndView("registration");
			return mav;			
	}
	
	@RequestMapping("/summary")
	public ModelAndView showSummary(
			@RequestParam("firstname") String firstName,
			@RequestParam("lastname") String lastName) {
		// `story` matches the name of the JSP file
		ModelAndView mav = new ModelAndView("summary");
		mav.addObject("firstname", firstName);
		mav.addObject("lastname", lastName);
		return mav;
	}


}
