package com.example.library_backend.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class LibraryController {

    @PostMapping("/")
    public String indexHome(){
        return "Welcome to library home index(login) page";
    }
    @PostMapping("/userlogin")
    public String userLogin(){
        return "welcome user";
    }
    @PostMapping("/registration")
    public String registration(){
        return "Welcome to registration page";
    }
    @PostMapping("/bookentry")
    public String bookEntry(){
        return "Add your book";
    }


}
