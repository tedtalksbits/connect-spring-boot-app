package com.test.connect;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.test.connect.model.User;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.regex.Pattern;

@SpringBootTest
class ConnectApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	void validation() {
		User user = new User(1, "Hello", "Friend", "", "1234", "four", "user");
				
		assertNotNull(user);
		assertEquals("four", user.getUsername());

	}
	
	@Test
	void passwordTest() {
		String pw = "aaZZa44@";
		boolean pwordCheck = 
				pw.matches("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}");
		
		assertEquals(true, pwordCheck);
	}
}
