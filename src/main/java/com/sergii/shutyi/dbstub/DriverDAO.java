package com.sergii.shutyi.dbstub;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DriverDAO {
    public List<DriverDataBase> getAllDrivers(){
        List<DriverDataBase> allDrivers = new ArrayList<>();
        Collections.addAll(allDrivers,
                DriverDataBase.values());
        return allDrivers;
    }
}
