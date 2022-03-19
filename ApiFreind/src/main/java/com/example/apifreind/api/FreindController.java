package com.example.apifreind.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class FreindController {

    @Autowired
    private FreindServices service;

    @GetMapping("/friends")
    public List<Freind> getFriends(){
        return service.getFriends();
    }

    @PostMapping("/friends/addnew")
    public void addFriend(@RequestBody Freind friend){
        service.addFriend(friend);
    }

    @PutMapping("/friends/{id}/edit")
    public void updateFriend(@PathVariable("id") Integer id, @RequestBody Freind friend){
        service.updateFriend(friend);
    }

    @DeleteMapping("/friends/{id}/delete")
    public void deleteFriend(@PathVariable("id") Long id){
        service.deleteFriend(id);
    }
}
