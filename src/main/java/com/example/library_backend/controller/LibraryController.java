package com.example.library_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
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
    @GetMapping("/viewall")
    public String viewAll(){
        return "Welcome to view all books";
    }
    @PostMapping("/search")
    public String search(){
        return "Please search your book";
    }
    @PostMapping("/delete")
    public String delete(){
        return "Please delete your book";
    }
    @PostMapping("/edit")
    public String edit(){
        return "Welcome to edit book";
    }
    @PostMapping("/issue")
    public String issueBook(){
        return "Issuing your book";
    }





}
