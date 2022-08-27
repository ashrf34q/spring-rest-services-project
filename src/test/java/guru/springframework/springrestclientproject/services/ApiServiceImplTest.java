package guru.springframework.springrestclientproject.services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import guru.springframework.api.domain.User;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class ApiServiceImplTest {

	@Autowired
	ApiService apiService;
	
	@BeforeEach
	void setUp() throws Exception {
		
	}

	@Test
	void testGetUsers() {
		
		List<User> users = apiService.getUsers(4);
		
		assertEquals(4, users.size());
		
	}

}
