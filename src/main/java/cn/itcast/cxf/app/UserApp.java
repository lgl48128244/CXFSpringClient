package cn.itcast.cxf.app;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.itcast.cxf.user.Pager;
import cn.itcast.cxf.user.User;
import cn.itcast.cxf.user.UserServiceI;
import cn.itcast.cxf.user.UserServiceIService;

public class UserApp {

	public static void main(String[] args) {
		UserServiceI serviceI = new UserServiceIService().getUserServiceIPort();
		User user = serviceI.loadByUsername("admin");
		Pager<User> pager = serviceI.list(null);
		List<User> list = pager.getDatas();
		for (User user2 : list) {
			System.out.println(user2.getUsername());
		}

		System.out.println(user.getUsername());

		ApplicationContext cxt = new ClassPathXmlApplicationContext(new String[] { "classpath:applicationContext.xml" });
		UserServiceI serviceI2 = (UserServiceI) cxt.getBean("userClient");
		Pager<User> pager2 = serviceI2.list(null);
		for (User user2 : list) {
			System.out.println(user2.getAddress());
		}
	}

}
