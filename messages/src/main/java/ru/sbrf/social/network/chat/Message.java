package ru.sbrf.social.network.chat;

public class Message implements Decodable, Encodable, Readable{
    private int MAX_LENGTH = 255;
    private String text;
    public Message(String text) throws MessageException{
        if (text.length() >= MAX_LENGTH)
            throw new MessageException(text.length());
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public String decode() {
        return new StringBuilder(text).reverse().toString();
    }

    public String encode() {
        return new StringBuilder(text).reverse().toString();
    }
}

class MessageException extends Exception
{

    public MessageException(int n) {
        super("Message length should be less than " + n + " symbols");
    }
}