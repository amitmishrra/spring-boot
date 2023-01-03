package com.spring.Application;

import com.spring.Application.Data.LibraryData;
import com.spring.Application.Repository.BooksRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApplicationClass {
	@Autowired
	BooksRepo repo;
	public static void main(String[] args) {
		SpringApplication.run(ApplicationClass.class, args);
	}
//@Override
//	public void run(String [] args){
//	LibraryData lib =  repo.findAll().get(0);
//	System.out.println("response :  "+lib.getAuthor());
//}

}
