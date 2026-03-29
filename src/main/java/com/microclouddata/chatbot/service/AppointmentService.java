package com.microclouddata.chatbot.service;

import com.microclouddata.chatbot.entity.Appointment;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface AppointmentService {
    Appointment save(Appointment appointment);
    List<Appointment> fetchAppointments();
    Appointment update(Appointment appointment,Long id);
    Boolean deleteAppointmentById(Long id);
    Appointment fetchOne(Appointment appointment);
}
