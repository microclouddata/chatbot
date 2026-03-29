package com.microclouddata.chatbot.assistant;

import dev.langchain4j.service.MemoryId;
import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.spring.AiService;
import reactor.core.publisher.Flux;

import static dev.langchain4j.service.spring.AiServiceWiringMode.EXPLICIT;
//        chatModel = "ollamaChatModel",

@AiService(
        wiringMode = EXPLICIT,
//        streamingChatModel = "openAiStreamingChatModel",
        chatModel = "openAiChatModel",
        chatMemoryProvider = "chatMemoryProviderAgent",
        tools = "appointmentTools",
        contentRetriever = "contentRetrieverChatAgentPincone"
//        contentRetriever = "contentRetrieverChatAgent"
)
public interface ChatAgent {
    @SystemMessage(fromResource = "chat-agent-prompt-template.txt")
    String chat(@MemoryId Long memoryId, @UserMessage String userMessage);
}
