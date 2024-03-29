package com.luv2code.springdemo.mvc.controller;

import com.luv2code.springdemo.mvc.model.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/student")
public class StudentController
{
    @Value( "#{hatOptions}" )
    private Map<String, String> hatOptions;

    @RequestMapping("/showForm")
    public String showForm( Model model){

        Student theStudent = new Student();

        model.addAttribute( "student", theStudent );
        model.addAttribute( "theHatOptions", hatOptions );

        return "student-form";
    }

    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("student") Student theStudent ){
        System.out.println("theStudent: " + theStudent.getFirstName()
        + " " + theStudent.getLastName());
        return "student-confirmation";
    }
}
