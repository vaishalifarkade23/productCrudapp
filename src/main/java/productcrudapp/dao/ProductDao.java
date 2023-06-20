package productcrudapp.dao;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import productcrudapp.model.Product;

@Component
public class ProductDao<HibernateTemplete> 
{
	@Autowired
	private HibernateTemplete hibernateTemplete;
	
	
	public void createProduct(Product product)
	{
		
	}
	
}
