package com.spring.Application.Controller;

import com.spring.Application.Data.LibraryData;
import com.spring.Application.Data.POJO;
import com.spring.Application.Repository.BooksRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ControllerClass {
    @Autowired
    BooksRepo repo;

    @PostMapping("/postBooksData")
    public String postBooksData(@RequestBody LibraryData library){
        String response;
        if(repo.existsById(library.getBook_name())){
           response = library.getBook_name() + " is already in the database";
        }else{
            repo.save(library);
            response = "Book saved!";
        }
        return response;
    }

    @GetMapping("/getBooksData")
    public List getBooksData(){
        List response =  repo.findAll();
        return response;
    }

    @DeleteMapping("/deleteAllData")
    public String deleteAllData(){
        String response;
       if(getBooksData().size()==0){
           response = "Nothing to delete.";
       }else{
           repo.deleteAll();
           response = "Everything deleted successfully";
       }
        return response;
    }
    @DeleteMapping("/deleteById")
    public String deleteById(@RequestParam(value = "id") String id){
        String response;

        if(repo.existsById(id)){
            repo.deleteById(id);
            response = id + " deleted successfully!!";
        }else{
            response = "Book not found!!";
        }
        return response;
    }

}
