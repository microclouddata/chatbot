package com.microclouddata.chatbot.service;

import com.microclouddata.chatbot.entity.Appointment;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
public class AppointmentServiceTest {
    @Autowired
    private AppointmentService appointmentService;
    @Test
    void testSaveAppointment(){
        Appointment appointment = new Appointment();
        appointment.setUsername("Tom");
        appointment.setIdCard("123456789012345678");
        appointment.setDepartment("Internal Medicine");
        appointment.setDate("2025-04-14");
        appointment.setTime("morning");
        appointmentService.save(appointment);
    }

    @Test
    void testFindOneAppointment(){
        Appointment appointment = new Appointment();
        appointment.setUsername("Tom");
        appointment.setIdCard("123456789012345678");
        appointment.setDepartment("Internal Medicine");
        appointment.setDate("2025-04-14");
        appointment.setTime("morning1");
        Appointment appointmentDB = appointmentService.fetchOne(appointment);
        System.out.println(appointmentDB);
    }

    @Test
    void testRemoveById() {
        appointmentService.deleteAppointmentById(1L);
    }
}
