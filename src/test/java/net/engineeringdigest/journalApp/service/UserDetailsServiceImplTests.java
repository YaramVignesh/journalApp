package net.engineeringdigest.journalApp.service;

import net.engineeringdigest.journalApp.entity.User;
import net.engineeringdigest.journalApp.repository.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.*;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.core.userdetails.UserDetails;


import java.util.ArrayList;
import java.util.Optional;

import static org.mockito.Mockito.when;


public class UserDetailsServiceImplTests {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserDetailsServiceImpl userDetailsService;

    @BeforeEach
    void setup() {
        MockitoAnnotations.initMocks(this);
    }


//    @Test
    void loadUserByUsername() {
        when(userRepository.findByUserName(ArgumentMatchers.anyString())).thenReturn(User.builder().userName("kaiser").password("kai").roles(new ArrayList<>()).build());
        UserDetails user = userDetailsService.loadUserByUsername("kaiser");
        Assertions.assertNotNull(user);

    }

 }
