package models;

import org.bson.types.ObjectId;
import xyz.morphia.annotations.Entity;
import xyz.morphia.annotations.Id;

@Entity(value= "chat_messages")

public class ChatMessage {
    public String message;
    String senderName;
    public Long sentTime;
    public ObjectId _userId;
    @Id
    public ObjectId _id;

    public ChatMessage(String message, String senderName, Long sentTime, ObjectId _userId) {
        this.message = message;
        this.senderName = senderName;
        this.sentTime = sentTime;
        this._userId = _userId;
    }

    public ChatMessage() {
    }

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public Long getSentTime() {
        return sentTime;
    }

    public void setSentTime(Long sentTime) {
        this.sentTime = sentTime;
    }

    public ObjectId get_userId() {
        return _userId;
    }

    public void set_userId(ObjectId _userId) {
        this._userId = _userId;
    }
}
