package com.microclouddata.chatbot.utils;

import dev.langchain4j.agent.tool.P;
import dev.langchain4j.agent.tool.Tool;
import dev.langchain4j.agent.tool.ToolMemoryId;
import org.springframework.stereotype.Component;

@Component
public class CalculatorTools {
    @Tool(name="addition",value = "Returns the sum of the two parameters.")
    double sum(@ToolMemoryId int memoryId, @P(value = "1",required = true) double a, @P(value = "2",required = true) double b) {
        System.out.println("Calling the addition operation "+memoryId);
        return a + b;
    }
    @Tool(name="square",value = "Returns the square root of the given argument.")
    double squareRoot(@ToolMemoryId int memoryId,double x) {
        System.out.println("Calling the square root operation "+memoryId);
        return Math.sqrt(x);
    }
}
