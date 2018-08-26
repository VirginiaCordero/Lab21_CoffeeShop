package co.grandcircus.lab21coffeeshop;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Items")
public class Product {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)	
	private Long id;
	private String name;
	@Column(length=40)
	private String description;
	private Integer quantity;
	private Float price;
	
	public Product() {
	}
	
	public Product(Long id, String name, String description, Integer quantity, Float price ) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", description=" + description + ", quantity=" + quantity
				+ ", price=" + price + "]";
	}
	
	
}
