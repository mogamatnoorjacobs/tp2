package com.kabaso.services.Impl;

import com.kabaso.domain.ElectricityData;
import com.kabaso.services.ElectricityService;

/**
 * Created by hashcode on 2016/03/07.
 */
public class CoalServiceImpl  implements ElectricityService {
    public ElectricityData getElectricity() {
        ElectricityData electricityData = new ElectricityData();
        electricityData.setFreq(55);
        electricityData.setSource("Coal");
        electricityData.setVoltage(240);
        return electricityData;
    }
}
