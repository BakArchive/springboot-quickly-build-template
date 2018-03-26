package org.muen.boot.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tk.mybatis.spring.annotation.MapperScan;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("org.muen.boot.demo.mapper")
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
	}

}
