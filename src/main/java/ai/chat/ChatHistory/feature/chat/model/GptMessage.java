package ai.chat.ChatHistory.feature.chat.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GptMessage {
    private String role;
    private String content;
}
