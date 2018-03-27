package org.muen.boot.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.muen.boot.demo.Service.MenuService;
import org.muen.boot.demo.domain.Menu;
import org.muen.boot.demo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tk.mybatis.spring.annotation.MapperScan;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("org.muen.boot.demo.mapper")
public class DemoApplicationTests {

	@Autowired
	MenuService menuService;

	@Test
	public void contextLoads() {
		User u = new User();
		u.setRoleid(1);
		List<Menu> list =  menuService.queryMenuByUser(u);
		for (Menu m:list) {
			System.out.println(m.getName());
		}
	}

}
