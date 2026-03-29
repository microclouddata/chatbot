package com.microclouddata.chatbot.service.impl;

import com.microclouddata.chatbot.entity.Appointment;
import com.microclouddata.chatbot.repository.AppointmentRepository;
import com.microclouddata.chatbot.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AppointmentServiceImpl implements AppointmentService {
    @Autowired
    private AppointmentRepository appointmentRepository;

    @Override
    public Appointment save(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    @Override
    public List<Appointment> fetchAppointments() {
        return appointmentRepository.findAll();
    }

    @Override
    public Appointment update(Appointment appointment, Long id) {
        if(appointmentRepository.existsById(id)){
            return appointmentRepository.save(appointment);
        }
        return null;
    }

    @Override
    public Boolean deleteAppointmentById(Long id) {
        appointmentRepository.deleteById(id);
        return !appointmentRepository.existsById(id);
    }

    @Override
    public Appointment fetchOne(Appointment appointment) {
        //Create an ExampleMatch for customization(e.g, case-insensitive)
        ExampleMatcher matcher = ExampleMatcher.matching()
                .withIgnoreCase("username")
                .withStringMatcher(ExampleMatcher.StringMatcher.CONTAINING);
        Example<Appointment> example = Example.of(appointment);

        return appointmentRepository.findOne(example).orElse(null);
    }
}
