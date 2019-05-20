package com.furqoncreative.mevent.model;

import androidx.annotation.DrawableRes;

public class ImageSliderModel {
    @DrawableRes
    private int image_res;
    private String image_drawable;
    private String name;

    public ImageSliderModel(String name, String image_drawable) {
        this.image_drawable = image_drawable;
        this.name = name;
    }

    public ImageSliderModel(String name, int image_res) {
        this.image_res = image_res;
        this.name = name;
    }

    public int getImage_res() {
        return image_res;
    }

    public void setImage_res(int image_res) {
        this.image_res = image_res;
    }

    public String getImage_drawable() {
        return image_drawable;
    }
    public void setImage_drawable(String image_drawable) {
        this.image_drawable = image_drawable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
