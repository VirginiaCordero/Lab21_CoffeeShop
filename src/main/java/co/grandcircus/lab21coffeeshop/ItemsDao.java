package co.grandcircus.lab21coffeeshop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ItemsDao {
	

		@Autowired
		private JdbcTemplate jdbcTemplate;

		public List<Items> findAll() {
			String sql = "SELECT * FROM Room";

			return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Items.class));
		}

//		public void create(Items items) {
//			String sql = "INSERT INTO Items (name, description, quantity, price) VALUES (?, ?, ?, ?)";
//			jdbcTemplate.update(sql, items.getName(), items.getDescription(), items.getQuantity(), items.getPrice());
//		}
//
//		public void delete(Long id) {
//			String sql = "DELETE FROM Items WHERE id=?";
//			jdbcTemplate.update(sql, id);
//		}



}
