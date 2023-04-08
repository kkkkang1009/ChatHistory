package ai.chat.ChatHistory.feature.chat.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class GptRequest {
    private String model;
    private String temperature;
    private List<GptMessage> messages;
}
