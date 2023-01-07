package com.example.login.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private String menuName;
    private String details;
    private String ImageUrl;//// FIXME: ImageUrl explain

    public Menu(String menuName, String details) {
        this.menuName = menuName;
        this.details = details;
    }

    public String getMenuName() {
        return menuName;
    }

  //  public void setMenuName(String menuName) { this.menuName = menuName;}

    public String getDetails() {
        return details;
    }

   // public void setDetails(String details) { this.details = details; }

    public String getImageUrl() {
        return ImageUrl;
    }

    public void setImageUrl(String url) {
        this.ImageUrl = url;
    }
    /*@SerializedName("id")
    private int id;

    @SerializedName("title")
    private String title;

    @SerializedName("details")
    private String details;

    @SerializedName("image_url")
    private String imageUrl;

    @SerializedName("ingredients")
    List<String> ingredients = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }*/
}
