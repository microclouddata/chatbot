package com.microclouddata.chatbot.utils;

import com.microclouddata.chatbot.entity.Appointment;
import com.microclouddata.chatbot.service.AppointmentService;
import dev.langchain4j.agent.tool.P;
import dev.langchain4j.agent.tool.Tool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AppointmentTools {
    @Autowired
    private AppointmentService appointmentService;
//    @Tool(name="book", value = "According to the parameters, the tool method queryDepartment is first executed to query whether an appointment is available.")
    @Tool(name="book", value = "According to the parameters, first execute the tool method queryDepartment to query whether an appointment is available, and directly answer the user whether an appointment is available, and ask the user to confirm all the appointment information. After the user confirms, the appointment is made. If the user does not provide a specific agent's name, find a agent from the vector storage.")
    public String bookAppointment(Appointment appointment){
        //Check whether the database contains the corresponding appointment record
        Appointment appointmentDB = appointmentService.fetchOne(appointment);
        if(appointmentDB == null){
            appointment.setId(null);//To prevent large model illusion, set id
            if(appointmentService.save(appointment)!=null){
                return "Book appointment is successful and the appointment details are returned";
            }else{
                return "Appointment failed";
            }
        }
        return "You already have an appointment at the same department and time.";
    }

    @Tool(name="cancel", value = "According to the parameters, check whether the appointment exists. If it exists, delete the appointment record and return a successful cancellation of the appointment. Otherwise, return a failed cancellation of the appointment.")
    public String cancelAppointment(Appointment appointment){
        Appointment appointmentDB = appointmentService.fetchOne(appointment);
        if(appointmentDB != null){
            //Delete appointment record
            if(appointmentService.deleteAppointmentById(appointmentDB.getId())){
                return "Cancelled appointment successfully";
            }else{
                return "Cancellation appointment failed";
            }
        }
        //Cancellation failed
        return "You have no appointment record. Please check the appointment department and time.";
    }

    @Tool(name = "query", value="Check whether there is an available number based on the department name, date, time and agent, and return it to the user.")
    public boolean queryDepartment(
            @P(value = "department") String name,
            @P(value = "date") String date,
            @P(value = "time，option：morning/afternoon") String time,
            @P(value = "agentName") String agentName
    ) {
        System.out.println("Check whether there is a number source");
        System.out.println("name：" + name);
        System.out.println("date：" + date);
        System.out.println("time：" + time);
        System.out.println("agentName：" + agentName);
//TODO 维护医生的排班信息：
//如果没有指定医生名字，则根据其他条件查询是否有可以预约的医生（有返回true，否则返回false）；
//如果指定了医生名字，则判断医生是否有排班（没有排版返回false）
//如果有排班，则判断医生排班时间段是否已约满（约满返回false，有空闲时间返回true）
        return true;
    }
}
