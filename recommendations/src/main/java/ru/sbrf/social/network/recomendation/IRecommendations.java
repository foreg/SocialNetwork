package ru.sbrf.social.network.recomendation;

public interface IRecommendations {
    int getRecommendedNewsId(int userId);
    int getRecommendedFriendId(int userId);
    int getRecommendedAudioId(int userId);
    int getRecommendedPhotoId(int userId);
}
