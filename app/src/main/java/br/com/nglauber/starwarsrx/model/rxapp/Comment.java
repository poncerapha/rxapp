package br.com.nglauber.starwarsrx.model.rxapp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Comment {
    @Expose
    @SerializedName("postId")
    private int postId;

    @Expose
    @SerializedName("id")
    private int id;

    @Expose
    @SerializedName("name")
    private String name;

    @Expose
    @SerializedName("email")
    private String email;

    @Expose
    @SerializedName("body")
    private String body;

    public Comment(int postId, int id, String name, String email, String body){
        this.postId = postId;
        this.id = id;
        this.name = name;
        this.email = email;
        this.body = body;
    }

    public int getPostId(){return postId;}

    public int getId(){return id;}

    public String getName(){return name;}

    public String getEmail(){return email;}

    public String getBody(){return body;}
}
