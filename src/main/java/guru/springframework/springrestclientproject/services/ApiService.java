package guru.springframework.springrestclientproject.services;

import java.util.List;

import guru.springframework.api.domain.User;

public interface ApiService {

	List<User> getUsers(Integer limit);
}
