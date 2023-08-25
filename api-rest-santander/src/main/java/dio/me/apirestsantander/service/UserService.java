package dio.me.apirestsantander.service;

import dio.me.apirestsantander.domain.model.User;

public interface UserService {
    User findById(Long id);
    User create(User userToCreate);
}
