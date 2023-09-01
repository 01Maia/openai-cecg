package br.com.open.ai.cecg.OpenAI.Component;

import com.theokanning.openai.service.OpenAiService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ChatStream {
    private final OpenAiService openAiService;

    @Value("$(openai.model: gpt-3.5-turbo")
    private String model;

    @Value("$(openai.max-tokens:500")
    private Integer maxToken;

    public ChatStreamComponent(OpenAIService openAIService) {
        this.openAiService = openAIService;
    }
}
