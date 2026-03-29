
package com.microclouddata.chatbot.controller;

import com.microclouddata.chatbot.assistant.ChatAgent;
import com.microclouddata.chatbot.bean.ChatForm;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

@Tag(name = "chatbot agent")
@RestController
@CrossOrigin(origins={"http://localhost:3000","http://localhost:8081","http://192.168.1.18:8081","http://localhost:5173"})
//@CrossOrigin(origins={"http://chatbot.microcloudsoftware.com.s3-website.us-east-2.amazonaws.com","http://chatbot.microcloudsoftware.com"})
@RequestMapping("/chatbot")
public class ChatAgentController {
    @Autowired
    private ChatAgent chatAgent;
    @Operation(summary = "dialog")
    @PostMapping(value = "/chat", produces = "text/stream;charset=utf-8")
    public String chat(@RequestBody ChatForm chatForm){
        String result = chatAgent.chat(chatForm.getMemoryId(),chatForm.getMessage());
        System.out.println("chat result:"+result);
        return result;

    }
}
