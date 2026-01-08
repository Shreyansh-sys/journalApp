package net.engineeringdigest.journalApp.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest(properties = "spring.autoconfigure.exclude=org.springframework.boot.autoconfigure.mongo.embedded.EmbeddedMongoAutoConfiguration")
@SpringBootTest
public class UserRepositoryImplTests {

    @Autowired
    private UserRepositoryImpl userRepository;

    @Test
    public void test1(){
        Assertions.assertNotNull(userRepository.getUserforSA());
    }
}
