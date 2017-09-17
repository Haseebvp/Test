package com.localqueen.localqueenassignment.models;

import java.util.List;

/**
 * Created by haseeb on 17/9/17.
 */

public class HomeData {
    String action, profilepic,username, location, userDescription, storeDescription;
    int likes, premiumExtraCount, moreImageExtraCount;
    Boolean follow, like, commentOpen;
    List<String> premiumImages,moreImages;
    List<CommentModel> comments;

    public Boolean getCommentOpen() {
        return commentOpen;
    }

    public void setCommentOpen(Boolean commentOpen) {
        this.commentOpen = commentOpen;
    }

    public List<CommentModel> getComments() {
        return comments;
    }

    public void setComments(List<CommentModel> comments) {
        this.comments = comments;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getProfilepic() {
        return profilepic;
    }

    public void setProfilepic(String profilepic) {
        this.profilepic = profilepic;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getUserDescription() {
        return userDescription;
    }

    public void setUserDescription(String userDescription) {
        this.userDescription = userDescription;
    }

    public String getStoreDescription() {
        return storeDescription;
    }

    public void setStoreDescription(String storeDescription) {
        this.storeDescription = storeDescription;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getPremiumExtraCount() {
        return premiumExtraCount;
    }

    public void setPremiumExtraCount(int premiumExtraCount) {
        this.premiumExtraCount = premiumExtraCount;
    }

    public int getMoreImageExtraCount() {
        return moreImageExtraCount;
    }

    public void setMoreImageExtraCount(int moreImageExtraCount) {
        this.moreImageExtraCount = moreImageExtraCount;
    }

    public Boolean getFollow() {
        return follow;
    }

    public void setFollow(Boolean follow) {
        this.follow = follow;
    }

    public Boolean getLike() {
        return like;
    }

    public void setLike(Boolean like) {
        this.like = like;
    }

    public List<String> getPremiumImages() {
        return premiumImages;
    }

    public void setPremiumImages(List<String> premiumImages) {
        this.premiumImages = premiumImages;
    }

    public List<String> getMoreImages() {
        return moreImages;
    }

    public void setMoreImages(List<String> moreImages) {
        this.moreImages = moreImages;
    }
}
