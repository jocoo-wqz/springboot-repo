package com.springcloud;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import com.springcloud.pojo.User;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MainApplication.class)
public class MainApplicationTest {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Test
	public void heetGet() {
		User user = this.restTemplate.getForObject("http://localhost/hello", User.class);
		System.out.println(user);
	}
}
