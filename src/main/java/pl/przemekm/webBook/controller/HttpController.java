package pl.przemekm.webBook.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.przemekm.webBook.entity.Http;
import pl.przemekm.webBook.service.HttpService;

import java.util.List;

@RestController
@RequestMapping("/api")
@Slf4j
public class HttpController {

    @Autowired
    HttpService httpService;

    @GetMapping("/http")
    public ResponseEntity<List<Http>> getHttp(){
        return ResponseEntity.ok(httpService.getHttps());
    }
}
