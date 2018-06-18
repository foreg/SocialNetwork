package ru.sbrf.social.network.gifts;

public interface IGift {
    void send(int userId);
    void receive(int giftId);
    void reject(int giftId);
}
