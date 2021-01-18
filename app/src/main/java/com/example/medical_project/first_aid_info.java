package com.example.medical_project;

public class first_aid_info {
    private  String  title;
    private  String  discription;
    private  int   image;

    public first_aid_info(String title, String discription, int image) {
        this.title = title;
        this.discription = discription;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
