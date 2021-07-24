package co.com.bancolombia.mongo;

import co.com.bancolombia.model.user.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface MongoDBRepository extends MongoRepository<User, String> , QueryByExampleExecutor<User> {
}
