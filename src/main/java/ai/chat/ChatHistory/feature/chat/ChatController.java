package ai.chat.ChatHistory.feature.chat;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequiredArgsConstructor
public class ChatController {
    private static ChatService chatService;

    @PostMapping("/chat")
    public ResponseEntity<String> sendChatGpt(@RequestBody Map<String, ?> request){

        return new ResponseEntity<>("OK", HttpStatus.OK);
    }
}
