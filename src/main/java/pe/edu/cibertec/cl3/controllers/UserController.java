package pe.edu.cibertec.cl3.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
        @GetMapping("/login")
    public String showFormLogin(){
        return "user/login";
    }
    
}
