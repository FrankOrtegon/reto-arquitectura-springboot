package co.com.bancolombia.api;
import co.com.bancolombia.model.user.User;
import co.com.bancolombia.usecase.createperson.CreateUserUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class ApiRest {

    private final CreateUserUseCase userUseCase;


    @PostMapping(path = "/create")
    public User commandName(@RequestBody User user) {
        return userUseCase.createUser(user);
    }
}
