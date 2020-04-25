package guru.springframework.springrestclientexamples.services;

import guru.springframework.api.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;




class ApiServiceImplTest {

    @Autowired
    ApiService  apiService;

    @org.junit.jupiter.api.BeforeEach
    void setUp() throws Exception{
    }

    @org.junit.jupiter.api.Test
    public void testGetUsers() throws Exception{
        List<User>  users = apiService.getUser(3);
        assertEquals(3, users.size());
    }
}