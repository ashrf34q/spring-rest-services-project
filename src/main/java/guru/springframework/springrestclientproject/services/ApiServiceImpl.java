package guru.springframework.springrestclientproject.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import guru.springframework.api.domain.User;

@Service
public class ApiServiceImpl implements ApiService {

	private RestTemplate restTemplate;
	
	public ApiServiceImpl(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}



	@SuppressWarnings("unchecked")
	@Override
	public List<User> getUsers(Integer limit) {
		
		List<User> users = restTemplate.getForObject("https://jsonplaceholder.typicode.com/users?_limit=" + limit, List.class);
		
		return users;
	}

}
