package com.sergii.shutyi.model.entity;

import com.sergii.shutyi.model.DriveCategory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class DriverLicense {
    private List<DriveCategory> categories;

    public DriverLicense() {
    }

    public DriverLicense(DriveCategory... categories) {
        this.categories = new ArrayList<>();
        Collections.addAll(this.categories, categories);
    }

    public DriverLicense(DriveCategory category) {
        this.categories.add(category);
    }

    public List<DriveCategory> getCategories() {
        return categories;
    }

    public void setCategories(List<DriveCategory> categories) {
        this.categories = categories;
    }


    @Override
    public String toString() {
        return "DriverLicense{" +
                "categories=" + categories +
                '}';
    }
}
