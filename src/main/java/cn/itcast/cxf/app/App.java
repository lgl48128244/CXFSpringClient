package cn.itcast.cxf.app;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.context.ApplicationContext;

import cn.itcast.cxf.Product;
import cn.itcast.cxf.ProductService;
import cn.utils.ApplicationContextUtil;

public class App {

	public static void main(String[] args) {
		proxyClientMethod1();
		proxyClientMethod2();
	}

	/**
	 * 推荐使用这种（依赖少）
	 */
	public static void proxyClientMethod1() {
		JaxWsProxyFactoryBean bean = new JaxWsProxyFactoryBean();
		bean.setAddress("http://localhost:8080/CXFSpringServer/services/productServiceI?wsdl");
		bean.setServiceClass(ProductService.class);
		ProductService service = bean.create(ProductService.class);
		Product product = service.getProduct(100);
		System.out.println(product.getArea());
	}

	/**
	 * 根据spring方式获取
	 */
	public static void proxyClientMethod2() {
		/*	ApplicationContext cxt = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
			ProductService service = (ProductService) cxt.getBean("productClient");
			Product product = service.getProduct(100);
			System.out.println(product.getArea());*/

		ApplicationContext cxt = ApplicationContextUtil.getApplicationContext();
		ProductService service = (ProductService) cxt.getBean("productClient");
		Product product = service.getProduct(100);
		System.out.println(product.getArea());
	}
}
