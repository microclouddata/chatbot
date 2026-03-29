package com.microclouddata.chatbot.repository;

import com.microclouddata.chatbot.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment,Long> {

}
