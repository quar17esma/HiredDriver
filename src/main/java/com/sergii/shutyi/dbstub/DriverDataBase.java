package com.sergii.shutyi.dbstub;

import com.sergii.shutyi.model.DriveCategory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public enum DriverDataBase {
    IVANOV(DriveCategory.A, DriveCategory.B),
    PETROV(DriveCategory.A, DriveCategory.C,DriveCategory.D),
    SHEVCHENKO(DriveCategory.A),
    SOKOLOV(DriveCategory.A,DriveCategory.E);

    private final List<DriveCategory> categoryList;

    DriverDataBase(DriveCategory... categories) {
        List<DriveCategory> driveCategories = new ArrayList<>();
        Collections.addAll(driveCategories, categories);
        this.categoryList = driveCategories;
    }

    public List<DriveCategory> getCategoryList() {
        return categoryList;
    }

}
