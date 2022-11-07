package com.example.tinyBackend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MyController {
   @RequestMapping("/login")   // either type '/' or index
   public String showlogin()
   {
	   System.out.println("IN  MyController->showlogin()");
       return "loginpage";
   }
   
   
   @RequestMapping("/bootstrap")   // either type '/' or index
   public String showbootstrap()
   {
	   System.out.println("IN  MyController->bootstrap()");
       return "bootstrap";
   }
   
   @RequestMapping("/bootstraptable")   // either type '/' or index
   public String showbootstraptable()
   {
	   System.out.println("IN  MyController->bootstraptable()");
       return "bootstraptable";
   }
   
	@PostMapping("/postlogin")
	public String afterlogin() {
		System.out.println("IN  HomeController->afterlogin()");
		return "postloginpage";
	}
 
}
