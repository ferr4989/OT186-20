package com.alkemy.g186.somosmas.ot18620.controllers;

import com.alkemy.g186.somosmas.ot18620.entity.Testimonial;
import com.alkemy.g186.somosmas.ot18620.services.ITestimonialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TestimonialTestController {

    @Autowired
    private ITestimonialService testimonialService;

    @GetMapping("/testimonial")
    public List<Testimonial> listAll() {
        return testimonialService.findAll();
    }

    @PostMapping("/createTestimonial")
    public void create(@RequestBody Testimonial testimonial) {
        this.testimonialService.save(testimonial);
    }

    @GetMapping("/find/{id}")
    public Testimonial findById(@PathVariable String id) {
        return testimonialService.findById(id);
    }

}
