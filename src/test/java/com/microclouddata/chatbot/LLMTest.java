//package com.microclouddata.chatbot;
//
//import dev.langchain4j.model.openai.OpenAiChatModel;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//@SpringBootTest
//public class LLMTest {
//    /**
//     * langchain4j openai apikey:demo
//     */
//    @Test
//    public void test() {
//        OpenAiChatModel model = OpenAiChatModel.builder()
//                .baseUrl("http://langchain4j.dev/demo/openai/v1")
//                .apiKey("demo")
//                .modelName("gpt-4o-mini")
//                .build();
//        String answer = model.chat("你好");
//        System.out.println(answer);
//    }
//    @Autowired
//    private OpenAiChatModel openAiChatModel;
//
//    /**
//     * langchain4j loading apiKey and model from application.properties
//     */
//    @Test
//    public void testSpringBoot(){
//        String answer = openAiChatModel.chat("我是谁?");
//        System.out.println(answer);
//    }
////
////    /**
////     * ollama接入
////     */
////    @Autowired
////    private OllamaChatModel ollamaChatModel;
////    @Test
////    public void testOllama() {
////    //向模型提问
////        String answer = ollamaChatModel.chat("你是谁？");
////    //输出结果
////        System.out.println(answer);
////    }
//}
