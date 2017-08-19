package com.sergii.shutyi.service;

import com.sergii.shutyi.dbstub.DriverDAO;
import com.sergii.shutyi.dbstub.DriverDataBase;
import com.sergii.shutyi.model.DriveCategory;
import com.sergii.shutyi.model.entity.Human;
import com.sergii.shutyi.model.role.driver.Driver;
import com.sergii.shutyi.model.role.driver.IDriver;

import java.util.ArrayList;
import java.util.List;

public class DriverHire implements HireHumanToDriver {
    private List<DriveCategory> needCategories = new ArrayList<>();;
    private List<IDriver> drivers = new ArrayList<>();
    private String companyName = "Taxi";

    {
        needCategories.add(DriveCategory.A);
        needCategories.add(DriveCategory.B);
    }

    public boolean hire(Human human) {
        boolean isHumanPassedCheck = checkDriverLicense(human.getName(), needCategories);
        if (isHumanPassedCheck) {
                human.setWorkPlace(companyName);
                drivers.add(new Driver(human, human.getDriverLicense()));
        }
        return false;
    }


    private boolean checkDriverLicense(String name, List<DriveCategory> expectedCategories) {
        return isDriverInDB(name) && actualDriverCategories(name).equals(expectedCategories);
    }

    private List<DriveCategory> actualDriverCategories(String name) {
        List<DriveCategory> actualDriverCategories = new ArrayList<>();

        DriverDAO driverDAO = new DriverDAO();
        for (DriverDataBase driverDataBase : driverDAO.getAllDrivers()) {
            if (driverDataBase.name().equalsIgnoreCase(name)) {
                actualDriverCategories = driverDataBase.getCategoryList();
            }
        }

        return actualDriverCategories;
    }

    private boolean isDriverInDB(String name) {
        DriverDAO driverDAO = new DriverDAO();
        for (DriverDataBase value : driverDAO.getAllDrivers()) {
            if (value.name().equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }

    public List<IDriver> getDrivers() {
        return drivers;
    }

    public void setDrivers(List<IDriver> drivers) {
        this.drivers = drivers;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
