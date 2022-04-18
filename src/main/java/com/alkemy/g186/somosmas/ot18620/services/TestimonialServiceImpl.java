package com.alkemy.g186.somosmas.ot18620.services;

import com.alkemy.g186.somosmas.ot18620.entity.Testimonial;
import com.alkemy.g186.somosmas.ot18620.repository.ITestimonialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
public class TestimonialServiceImpl implements ITestimonialService{

    @Autowired
    private ITestimonialRepository testimonialRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Testimonial> findAll() {
        return testimonialRepository.findAll();
    }

    @Override
    @Transactional
    public void save(Testimonial testimonial) { testimonialRepository.save(testimonial); }

    @Override
    @Transactional(readOnly = true)
    public Testimonial findById(String id) { return testimonialRepository.findById(id).orElse(null);
    }

}
