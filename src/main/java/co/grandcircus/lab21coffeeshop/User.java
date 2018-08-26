package co.grandcircus.lab21coffeeshop;
import java.io.Serializable;


public class User implements Serializable {
	
	private static final long serialVersionUID = 1L;	
	
//	private Long id;
	private String firstname;
	private String lastname;
	private String phonenumber;
	private String email;
	private String password;
	private String termsandconditions;
	private String offersandpromos;
	
	public User() {}
	
	public User(String firstname, String lastname, String phonenumber, String email, String password, String
			termsandconditions, String offersandpromos) {
		
		this.firstname = firstname;
		this.lastname = lastname;
		this.phonenumber = phonenumber;
		this.email= email;
		this.password = password;
		this.termsandconditions = termsandconditions;
		this.offersandpromos = offersandpromos;
	}
	
//	public Long getId() {
//		return id;
//	}
//	public void setId(Long id) {
//		this.id = id;
//	}

	public String getFirstname() {
		return firstname;
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTermsandconditions() {
		return termsandconditions;
	}

	public void setTermsandconditions(String termsandconditions) {
		this.termsandconditions = termsandconditions;
	}

	public String getOffersandpromos() {
		return offersandpromos;
	}

	public void setOffersandpromos(String offersandpromos) {
		this.offersandpromos = offersandpromos;
	}
	
	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	
	@Override
	public String toString() {
		return "User [firstname=" + firstname + ", lastname=" + lastname + ", phonenumber=" + phonenumber
				+ ", password=" + password + ", email=" + email + ", termsandconditions=" + termsandconditions
				+ ", offersandpromos=" + offersandpromos + "]";
	}
}