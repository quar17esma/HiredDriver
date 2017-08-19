package com.sergii.shutyi;

import com.sergii.shutyi.model.DriveCategory;
import com.sergii.shutyi.model.entity.DriverLicense;
import com.sergii.shutyi.model.entity.Human;
import com.sergii.shutyi.service.DriverHire;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        DriverLicense driverLicense = new DriverLicense(DriveCategory.A, DriveCategory.B);
        Human human = new Human("Ivanov", new Date(), Human.Gender.MALE, Human.BloodGroup.FIRST, "",
                driverLicense);
        DriverHire driverHire = new DriverHire();

        driverHire.hire(human);

    }
}
