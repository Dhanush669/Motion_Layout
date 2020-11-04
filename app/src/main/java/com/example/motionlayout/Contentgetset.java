package com.example.motionlayout;

import java.util.ArrayList;
import java.util.List;

public class Contentgetset {
    int thumbnails;
    String desc;

    public Contentgetset() {

    }

    public Contentgetset(int thumbnails, String desc) {
        this.thumbnails = thumbnails;
        this.desc = desc;
    }

    public int getThumbnails() {
        return thumbnails;
    }

    public void setThumbnails(int thumbnails) {
        this.thumbnails = thumbnails;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}