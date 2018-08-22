package co.grandcircus.lab21coffeeshop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CoffeeShopController {
	
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private ItemsDao itemsDao;
	
	@RequestMapping("/")
	public ModelAndView index() {
		
		List<Items> items = itemsDao.findAll();
		return new ModelAndView("list", "items", items);
	}
	
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
			@RequestParam("firstname") String firstname,
			@RequestParam("lastname") String lastname,
			@RequestParam("phonenumber") String phonenumber,
			@RequestParam("email") String email,
			@RequestParam("password") String password,
			@RequestParam("termsandconditions") String termsandconditions,
			@RequestParam("offersandpromos") String offersandpromos) {	
		User user = new User(null, firstname, lastname, password, phonenumber, email, termsandconditions, offersandpromos );
		userDao.create(user);
		
//		user.setFirstname(firstname);
//		user.setLastname(lastname);
//		user.setPhonenumber(phonenumber);
//		user.setEmail(email);
//		user.setPassword(password);
//		user.setTermsandconditions(termsandconditions);
//		user.setOffersandpromos(offersandpromos ? "true" : "false");
		
		ModelAndView mav = new ModelAndView("redirect:/");
		mav.addObject("user", user);
		return mav;
	}

		
	}
