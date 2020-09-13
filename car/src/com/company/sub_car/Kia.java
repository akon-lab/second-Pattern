package com.company.sub_car;

import com.company.Car;
import com.company.Car_Builder;
import com.company.type_enum.KiaEnum;

public class Kia extends Car implements Car_Builder {

    KiaEnum type;

    @Override
    public void build() {
        getType();
    }

    @Override
    public void getType() {

    }
}
