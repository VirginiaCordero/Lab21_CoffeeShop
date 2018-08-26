package co.grandcircus.lab21coffeeshop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class CoffeeShopController {

	@Autowired
	private UserDao userDao;

	@Autowired
	private ProductDaoHibernate productDao;		

	@RequestMapping("/")
	public ModelAndView index() {
		List<Product> items = productDao.findAll();
		return new ModelAndView("index", "items", items);
//		List<Product> listOfProducts = productDao.findAll();
//		return new ModelAndView("index", "productsFromController", listOfProducts);
	}

	// @RequestMapping("/")
	// public ModelAndView showHomePage() {
	// ModelAndView mav = new ModelAndView("index");
	// return mav;
	// }

	@RequestMapping("/registration")
	public ModelAndView showRegistrationPage() {
		ModelAndView mav = new ModelAndView("registration");
		return mav;
	}

	@RequestMapping("/summary")
	public ModelAndView showSummary(@RequestParam("firstname") String firstname,
			@RequestParam("lastname") String lastname, @RequestParam("phonenumber") String phonenumber,
			@RequestParam("email") String email, @RequestParam("password") String password,
			@RequestParam("termsandconditions") String termsandconditions,
			@RequestParam("offersandpromos") String offersandpromos) {
		User user = new User(firstname, lastname, password, phonenumber, email, termsandconditions, offersandpromos);
		userDao.create(user);

		// user.setFirstname(firstname);
		// user.setLastname(lastname);
		// user.setPhonenumber(phonenumber);
		// user.setEmail(email);
		// user.setPassword(password);
		// user.setTermsandconditions(termsandconditions);
		// user.setOffersandpromos(offersandpromos ? "true" : "false");

		ModelAndView mav = new ModelAndView("summary");
		mav.addObject("user", user);
		return mav;
	}

	@RequestMapping("ItemAdmin")
	public ModelAndView showItemAdmin() {
	List<Product> items = productDao.findAll();
	return new ModelAndView("ItemAdmin", "items", items);
	}
	
	@RequestMapping("/AddItem")
	public ModelAndView showAddItem() {
		return new ModelAndView("AddItem", "title", "Add an Item"); //Model and view: Jsp, EL tag name, value
	}
	
	@RequestMapping(value="/AddItem", method=RequestMethod.POST)
	public ModelAndView submitCreateForm(Product product) {
		productDao.create(product);
		return new ModelAndView("redirect:/");
	}
	
	@RequestMapping("/delete")
	public ModelAndView delete(@RequestParam("id") Long id) {
		productDao.delete(id);
		return new ModelAndView("redirect:/ItemAdmin");
	}
	//This methods runs after the user submits the edit form
	@RequestMapping(value="/EditItem", method=RequestMethod.POST)
	public ModelAndView submitEditForm(Product product) {
		productDao.edit(product);
		return new ModelAndView("redirect:/ItemAdmin");
	}
	// This method sends the user to the edit form
	@RequestMapping("/EditItem")
	public ModelAndView edit(@RequestParam("id") Long id) {
		return new ModelAndView("EditItem", "id", id);
	}
	
//	// path variable required to identify which food we're editing
//		@RequestMapping("/food/{id}/update")
//		public ModelAndView showEditForm(@PathVariable("id") Long id) {
//			ModelAndView mav = new ModelAndView("food-form");
//			mav.addObject("food", foodDao.findById(id));
//			mav.addObject("title", "Edit Food");
//			return mav;
//		}
//		
//		// same URL but different method
//		@RequestMapping(value="/food/{id}/update", method=RequestMethod.POST)
//		public ModelAndView submitEditForm(Food food, @PathVariable("id") Long id) {
//			food.setId(id);
//			foodDao.update(food);
//			return new ModelAndView("redirect:/food");
//		}

	
}
