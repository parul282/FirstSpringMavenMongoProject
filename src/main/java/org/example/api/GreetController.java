package org.example.api;

import org.example.model.UserDetail;
import org.example.service.GreetService;
import org.example.service.GreetServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreetController {

    private final GreetService service;

    public GreetController(GreetService service) {
        this.service = service;
    }

    @GetMapping("/get/greeting")
    public ResponseEntity<String> greet(@RequestParam(name="name") String username){

//        final GreetServiceImpl service = new GreetServiceImpl();

        return ResponseEntity.ok("Hello " +username +"   "+ service.saveUserInformation(username));
    }
    @GetMapping("/get/time")
    public ResponseEntity<String> greetWithTime(@RequestParam(name="time") String time){
        return ResponseEntity.ok("Good morning it's " +time);
    }
    @PostMapping("/post/details")
    public ResponseEntity<String> saveUserDetails(@RequestBody() UserDetail userDetail){
        
        return ResponseEntity.ok("User details saved " + userDetail);
    }
}
