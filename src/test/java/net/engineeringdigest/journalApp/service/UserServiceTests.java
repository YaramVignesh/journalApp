package net.engineeringdigest.journalApp.service;

import net.engineeringdigest.journalApp.entity.User;
import net.engineeringdigest.journalApp.repository.UserRepository;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


//@SpringBootTest
public class UserServiceTests {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserService userService;

//    @ParameterizedTest
//    @ArgumentsSource(UserArgumentsProvider.class)
//    public void testSaveNewUser(User user ) {
//        assertTrue(userService.saveNewUser(user));
//    }
}
