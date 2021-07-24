package co.com.bancolombia.usecase.createperson;

import co.com.bancolombia.model.user.User;
import co.com.bancolombia.model.user.gateways.UserRepository;
import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
public class CreateUserUseCase {

    private final UserRepository userRepository;

    public User createUser(User user){
        return userRepository.createUser(user);
    }
}
