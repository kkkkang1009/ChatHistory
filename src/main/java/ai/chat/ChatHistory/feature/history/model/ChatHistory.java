package ai.chat.ChatHistory.feature.history.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

//@Data
@Getter
@Setter
public class ChatHistory {
    private String historyId;
    private String sessionId;
    private String role;
    private String content;
    private Date chatDate;
}
