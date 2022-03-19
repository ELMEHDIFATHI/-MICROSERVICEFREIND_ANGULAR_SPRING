package com.example.apifreind.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FreindServices {
    @Autowired
    private FreindRepo repository;

    public List<Freind> getFriends(){
        return repository.findAll();
    }

    public void  addFriend(Freind friend){
        repository.save(friend);
    }

    public void updateFriend(Freind friend){
        repository.save(friend);
    }

    public void deleteFriend(Long id){
        repository.deleteById(id);
    }
}
