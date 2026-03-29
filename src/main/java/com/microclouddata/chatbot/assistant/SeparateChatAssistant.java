//package com.microclouddata.chatbot.assistant;
//
//import dev.langchain4j.service.MemoryId;
//import dev.langchain4j.service.SystemMessage;
//import dev.langchain4j.service.UserMessage;
//import dev.langchain4j.service.V;
//import dev.langchain4j.service.spring.AiService;
//
//import static dev.langchain4j.service.spring.AiServiceWiringMode.EXPLICIT;
//
//@AiService(
//        wiringMode = EXPLICIT,
//        chatModel = "openAiChatModel",
//        chatMemoryProvider = "chatMemoryProvider",
//        tools = "calculatorTools")
//public interface SeparateChatAssistant {
//    @SystemMessage(fromResource = "my-prompt-template.txt")
//    String chat(@MemoryId int memoryId, @UserMessage String userMessage);
//
//    @UserMessage("you are my friend, please answer in American colloquial language.{{message}}")
//    String chat2(@MemoryId int memoryId, @V("message") String userMessage);
//
//    @SystemMessage(fromResource = "my-prompt-template3.txt")
//    String chat3(
//            @MemoryId int memoryId,
//            @UserMessage String userMessage,
//            @V("username") String username,
//            @V("age") int age
//    );
//}
