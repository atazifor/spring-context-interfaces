package proxies;

import model.Comment;
import org.springframework.stereotype.Component;

@Component
public class PushCommentNotificationProxy implements CommentNotificationProxy{
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Push notification for comment: " + comment.getText());
    }
}
