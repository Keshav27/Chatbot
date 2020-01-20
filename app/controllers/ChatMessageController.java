package controllers;

import com.google.inject.Inject;
import models.ChatMessage;
import models.MessageForm;
import play.Logger;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import repositories.ChatRepository;
import services.ChatMessageService;
import views.html.chatbot;
import views.html.chatview;

import java.util.List;

public class ChatMessageController extends Controller {

    @Inject
    ChatMessageService chatMessageService;

    @Inject
    FormFactory formFactory;

    public Result showConversation(String userName) {
        Form<MessageForm> messageFormForm = formFactory.form(MessageForm.class);
        return ok(chatbot.render(userName, messageFormForm));
    }

    public Result saveMessage(String username) {
        Logger.debug("Got message : {}", username);
        Form<MessageForm> messageFormForm = formFactory.form(MessageForm.class).bindFromRequest();
        chatMessageService.saveUserMessage(username,messageFormForm.get().getMessage());
        chatMessageService.saveResponseForMessage(username, messageFormForm.get().getMessage());
        return ok("done");
    }

    public Result getConversation(String username) {
        Logger.debug("Getting messages for user : {}", username);
        List<ChatMessage> chatMessageList = chatMessageService.getAllByUser(username);
        return ok(chatview.render(chatMessageList));
    }
}
