package com.alkemy.g186.somosmas.ot18620.controllers;

import com.alkemy.g186.somosmas.ot18620.services.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.io.IOException;

@Controller
public class EmailTestController {

    @Autowired
    EmailService emailService;

    @GetMapping("/sendMail/{email}")
    public void sendEmail(@PathVariable(value = "email", required = true) String email) throws IOException {
        emailService.sendEmail(email);
    }

}
