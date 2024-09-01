package main;

import config.ProjectConfig;
import model.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import proxies.EmailCommentNotificationProxy;
import repositories.DBCommentRepository;
import services.CommentService;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ProjectConfig.class);

        CommentService commentService = applicationContext.getBean(CommentService.class);

        Comment comment = new Comment();
        comment.setAuthor("Taz");
        comment.setText("Visual Basic");
        commentService.publishComment(comment);
    }
}
