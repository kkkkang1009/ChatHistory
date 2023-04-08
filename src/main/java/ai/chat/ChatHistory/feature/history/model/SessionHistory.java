package ai.chat.ChatHistory.feature.history.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

//@Data
@Getter
@Setter
public class SessionHistory {
    private String sessionId;
    private String userId;
    private Date chatDate;
}
