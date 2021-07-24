package co.com.bancolombia.model.user.gateways;

import co.com.bancolombia.model.user.User;

public interface UserRepository {
    User createUser(User user);
}
