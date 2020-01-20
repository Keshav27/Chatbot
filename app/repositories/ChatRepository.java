package repositories;

import PlayMorphia.PlayMorphia;
import models.ChatMessage;
import org.bson.types.ObjectId;

import javax.inject.Inject;
import java.util.List;

public class ChatRepository {

    @Inject
    PlayMorphia morphia;

    public void save(ChatMessage cm) {
        morphia.datastore().save(cm);
    }

    public List<ChatMessage> findByUserId(ObjectId userId){

        List<ChatMessage> chatMessages = morphia.
                datastore().
                createQuery(ChatMessage.class).
                field("_userId").
                equal(userId).asList();
        return chatMessages;
    }
}