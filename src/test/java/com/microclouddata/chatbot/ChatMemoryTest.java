//package com.microclouddata.chatbot;
//
//import com.microclouddata.chatbot.assistant.Assistant;
//import com.microclouddata.chatbot.assistant.MemoryChatAssistant;
//import com.microclouddata.chatbot.assistant.SeparateChatAssistant;
//import dev.langchain4j.memory.chat.MessageWindowChatMemory;
//import dev.langchain4j.model.ollama.OllamaChatModel;
//import dev.langchain4j.model.openai.OpenAiChatModel;
//import dev.langchain4j.service.AiServices;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//@SpringBootTest
//public class ChatMemoryTest {
//    @Autowired
//    private Assistant assistant;
//    @Test
//    public void testChatMemory(){
//        String answer1 = assistant.chat("My name is Bin Chen");
//        System.out.println(answer1);
//        String answer2 = assistant.chat("Who am i?");
//        System.out.println(answer2);
//    }
//    @Autowired
//    private OpenAiChatModel openAiChatModel;
//    @Autowired
//    private OllamaChatModel ollamaChatModel;
//    @Test
//    public void testChatMemory3() {
////创建chatMemory
//        MessageWindowChatMemory chatMemory = MessageWindowChatMemory.withMaxMessages(10);
////创建AIService
//        Assistant assistant = AiServices
//                .builder(Assistant.class)
//                .chatModel(openAiChatModel)
//                .chatMemory(chatMemory)
//                .build();
////调用service的接口
//        String answer1 = assistant.chat("My name is Bin Chen");
//        System.out.println(answer1);
//        String answer2 = assistant.chat("Who am i?");
//        System.out.println(answer2);
//    }
//
//    @Autowired
//    private MemoryChatAssistant memoryChatAssistant;
//    @Test
//    public void testChatMemory4() {
////调用service的接口
//        String answer1 = memoryChatAssistant.chat("My name is Bin Chen");
//        System.out.println(answer1);
//        String answer2 = memoryChatAssistant.chat("Who am i?");
//        System.out.println(answer2);
//    }
//
//    @Autowired
//    private SeparateChatAssistant separateChatAssistant;
//    @Test
//    public void testChatMemory5() {
//        //调用service的接口
//        String answer1 = separateChatAssistant.chat(1,"My name is Bin Chen");
//        System.out.println(answer1);
//        String answer2 = separateChatAssistant.chat(1,"Who am i?");
//        System.out.println(answer2);
//        //调用service的接口
//        String answer3 = separateChatAssistant.chat(2,"Who am i?");
//        System.out.println(answer3);
//    }
//}
