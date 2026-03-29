FROM openjdk:17

COPY target/chatbot-*.jar /chatbot.jar
CMD ["java","-jar","/chatbot.jar"]
