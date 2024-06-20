package by.pavvel.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/")
public class HomeController {

    @GetMapping
    public ResponseEntity<String> home() {

        String s1 = """
                [
                {"id" : 1,"version" : "version-1 \uD83E\uDD72"}
                ]
                """;

        String s2 = """
                [
                {"id" : 2,"version" : "version-2 \uD83D\uDE0A"}
                ]
                """;

        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.add("Content-Type", "application/json; charset=UTF-8");
        return new ResponseEntity<>(s2, responseHeaders, HttpStatus.OK);
    }
}
