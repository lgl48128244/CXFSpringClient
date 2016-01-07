package cn.jbit.cxf.app;

import cn.jbit.cxf.IProductService;
import cn.jbit.cxf.IProductServiceService;
import cn.jbit.cxf.Product;

public class App {

	public static void main(String[] args) {
		IProductService productService = new IProductServiceService().getIProductServicePort();
		Product addProduct = productService.getPorductById(100);
		String nameString = addProduct.getName();
		String areaString = addProduct.getArea();
		Double priceString = addProduct.getPrice();
		System.out.println(nameString + "\t" + priceString + "\t" + areaString + "\t" + priceString);

	}
}
