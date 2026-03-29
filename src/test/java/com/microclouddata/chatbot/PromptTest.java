//package com.microclouddata.chatbot;
//
//import com.microclouddata.chatbot.assistant.MemoryChatAssistant;
//import com.microclouddata.chatbot.assistant.SeparateChatAssistant;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//@SpringBootTest
//public class PromptTest {
//    @Autowired
//    private SeparateChatAssistant separateChatAssistant;
//    @Test
//    public void testSystemMessage(){
//        String answer = separateChatAssistant.chat(5,"Who am i");
//        System.out.println(answer);
//    }
//
//    @Autowired
//    private MemoryChatAssistant memoryChatAssistant;
//    @Test
//    public void testUserMessage() {
//        String answer1 = memoryChatAssistant.chat("My name is Bin Chen.");
//        System.out.println(answer1);
//        String answer2 = memoryChatAssistant.chat("I am 37 years old.");
//        System.out.println(answer2);
//        String answer3 = memoryChatAssistant.chat("Do you know who I am?");
//        System.out.println(answer3);
//    }
//
//    @Test
//    public void testV() {
//        String answer1 = separateChatAssistant.chat2(10, "My name is Bin Chen.");
//        System.out.println(answer1);
//        String answer2 = separateChatAssistant.chat2(10, "Who am I?");
//        System.out.println(answer2);
//    }
//
//    @Test
//    public void testUserInfo() {
//        //get username and age from database
//        String username = "Bin";
//        int age = 18;
//
//        String answer = separateChatAssistant.chat3(11, "Who am i? how old are i?", "Bin", 18);
//        System.out.println(answer);
//    }
//}
