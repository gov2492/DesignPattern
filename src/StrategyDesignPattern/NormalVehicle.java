package StrategyDesignPattern;

import StrategyDesignPattern.strategy.DriveStrategy;
import StrategyDesignPattern.strategy.NormalDriveStrategy;

public class NormalVehicle extends Vehicle{
    public NormalVehicle() {
        super(new NormalDriveStrategy());
    }
}
