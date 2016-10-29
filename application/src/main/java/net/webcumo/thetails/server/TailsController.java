package net.webcumo.thetails.server;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class TailsController {

    @RequestMapping("/tails/{author}/id")
    public ResponseEntity<String> getTail(@PathVariable String author) {

        return new ResponseEntity<>(author + " not found", HttpStatus.NOT_FOUND);
    }
}
