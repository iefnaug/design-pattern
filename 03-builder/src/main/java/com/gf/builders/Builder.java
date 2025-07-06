package com.gf.builders;

import com.gf.cars.CarType;
import com.gf.components.Engine;
import com.gf.components.GPSNavigator;
import com.gf.components.Transmission;
import com.gf.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
