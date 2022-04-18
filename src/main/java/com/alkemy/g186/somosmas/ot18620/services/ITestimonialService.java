package com.alkemy.g186.somosmas.ot18620.services;

import com.alkemy.g186.somosmas.ot18620.entity.Testimonial;

import java.util.List;

public interface ITestimonialService {

    List<Testimonial> findAll();

    void save(Testimonial testimonial);

    Testimonial findById(String id);

}
