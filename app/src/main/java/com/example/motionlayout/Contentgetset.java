package com.example.motionlayout;

import java.util.ArrayList;
import java.util.List;

public class Contentgetset {
    List<Integer> thumbnails=new ArrayList<>();
    List<String> desc=new ArrayList<>();

    public Contentgetset() {

    }

    public Contentgetset(List<Integer> thumbnails, List<String> desc) {
        this.thumbnails = thumbnails;
        this.desc = desc;
    }

    public List<Integer> getThumbnails() {
        return thumbnails;
    }

    public void setThumbnails(List<Integer> thumbnails) {
        this.thumbnails = thumbnails;
    }

    public List<String> getDesc() {
        return desc;
    }

    public void setDesc(List<String> desc) {
        this.desc = desc;
    }
}
