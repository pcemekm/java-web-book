package pl.przemekm.webBook.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertFalse;

@SpringBootTest
public class HttpRepositoryTest {

    @Autowired
    HttpRepository httpRepository;

    @Test
    void findAll(){
        assertFalse(httpRepository.findAll().isEmpty());
    }
}
