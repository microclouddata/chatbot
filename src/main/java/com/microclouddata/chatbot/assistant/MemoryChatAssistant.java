//package com.microclouddata.chatbot.assistant;
//
//import dev.langchain4j.service.UserMessage;
//import dev.langchain4j.service.V;
//import dev.langchain4j.service.spring.AiService;
//
//import static dev.langchain4j.service.spring.AiServiceWiringMode.EXPLICIT;
//
//@AiService(wiringMode = EXPLICIT,chatModel = "openAiChatModel",chatMemory = "chatMemory")
//public interface MemoryChatAssistant {
//    @UserMessage("you are my friend, please answer in American colloquial language.\n" +
//            ",And add some emojis.{{message}}")
//    String chat(@V("message") String userMessage);
//}
