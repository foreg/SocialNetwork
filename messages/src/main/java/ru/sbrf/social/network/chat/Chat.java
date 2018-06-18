package ru.sbrf.social.network.chat;

public class Chat {
    private int senderId;
    public Chat(int senderId) {
        this.senderId = senderId;
    }
    public String sendMessage(int receiverId, String text)
    {
        Message msg;
        try {
            msg = new Message(text);
        }
        catch (MessageException ex) {
            return ex.getMessage();
        }

        return "";
    }
}
