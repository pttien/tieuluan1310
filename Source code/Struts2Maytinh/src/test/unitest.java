package test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tieuluan.struts2.bussines.ProductService;
import com.tieuluan.struts2.model.Product;

public class unitest {
	@Autowired
	private ProductService productService;
	
	List<Product> lst;
	
	public static void main(String[] args)
	{
//		lst=pro
		unitest test=new unitest();
		test.check();
		System.out.print("dhhhhhhhhhhhhhhh");
	
	}
	public void check()
	{
		lst=productService.getProductList();
	}
	public List<Product> getLst() {
		return lst;
	}
	public void setLst(List<Product> lst) {
		this.lst = lst;
	}

	
	
	
}
