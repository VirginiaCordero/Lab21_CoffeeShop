package co.grandcircus.lab21coffeeshop;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Transactional
@Repository
public class ProductDaoHibernate {
		
		@PersistenceContext
		private EntityManager em;

		public List<Product> findAll() {
			// HQL queries use the Java names for classes and properties
			return em.createQuery("FROM Product", Product.class).getResultList();
		}
		
		public Product findById(Long id) {
			return em.find(Product.class, id);
		}

		public void create(Product product) {
			em.persist(product);
		}
		
		public void delete(Long id) {
			Product product = em.getReference(Product.class, id);
			em.remove(product);
		}
		
		public void edit(Product product) {
			em.merge(product);
		}

}
