package com.example.team4_mobileprogramming_1;

import android.os.Parcel;
import android.os.Parcelable;

public class Repositories implements Parcelable {

    String  repositoryname,username,useravatar,language,desc,followers,following,oranization,userrepository;

    public Repositories(String repositoryname, String username, String useravatar, String language, String desc, String followers, String following, String oranization, String userrepository) {
        this.repositoryname = repositoryname;
        this.username = username;
        this.useravatar = useravatar;
        this.language = language;
        this.desc = desc;
        this.followers = followers;
        this.following = following;
        this.oranization = oranization;
        this.userrepository = userrepository;
    }

    protected Repositories(Parcel in) {
        repositoryname = in.readString();
        username = in.readString();
        useravatar = in.readString();
        language = in.readString();
        desc = in.readString();
        followers = in.readString();
        following = in.readString();
        oranization = in.readString();
        userrepository = in.readString();
    }

    public static final Creator<Repositories> CREATOR = new Creator<Repositories>() {
        @Override
        public Repositories createFromParcel(Parcel in) {
            return new Repositories(in);
        }

        @Override
        public Repositories[] newArray(int size) {
            return new Repositories[size];
        }
    };

    public String getRepositoryname() {
        return repositoryname;
    }

    public void setRepositoryname(String repositoryname) {
        this.repositoryname = repositoryname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUseravatar() {
        return useravatar;
    }

    public void setUseravatar(String useravatar) {
        this.useravatar = useravatar;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getFollowers() {
        return followers;
    }

    public void setFollowers(String followers) {
        this.followers = followers;
    }

    public String getFollowing() {
        return following;
    }

    public void setFollowing(String following) {
        this.following = following;
    }

    public String getOranization() {
        return oranization;
    }

    public void setOranization(String oranization) {
        this.oranization = oranization;
    }

    public String getUserrepository() {
        return userrepository;
    }

    public void setUserrepository(String userrepository) {
        this.userrepository = userrepository;
    }

    public static Creator<Repositories> getCREATOR() {
        return CREATOR;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(repositoryname);
        parcel.writeString(username);
        parcel.writeString(useravatar);
        parcel.writeString(language);
        parcel.writeString(desc);
        parcel.writeString(followers);
        parcel.writeString(following);
        parcel.writeString(oranization);
        parcel.writeString(userrepository);
    }




}
