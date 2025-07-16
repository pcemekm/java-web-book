package pl.przemekm.webBook.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.przemekm.webBook.entity.Http;
import pl.przemekm.webBook.repository.HttpRepository;

import java.util.List;
@Service
public class HttpService {

    @Autowired
    HttpRepository httpRepository;

    public List<Http> getHttps(){
        return httpRepository.findAll();
    }
}
