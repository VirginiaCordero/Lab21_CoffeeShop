package co.grandcircus.lab21coffeeshop;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<User> findAll() {
		String sql = "SELECT * FROM Users";

		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(User.class));
	}

	public void create(User user) {
		String sql = "INSERT INTO Users (firstname, lastname, password, phonenumber, e-mail, termsandconditions, offersandpromos) VALUES (?, ?, ?, ?, ?, ?, ?)";
		jdbcTemplate.update(sql, user.getFirstname(), user.getLastname(), user.getPassword(), user.getPhonenumber(), user.getEmail(), user.getTermsandconditions() );
	}	



}
