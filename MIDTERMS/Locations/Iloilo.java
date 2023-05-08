package Locations;

import Tourists.Tourist;

public class Iloilo implements Locations {

    public int airFare = 250;

    
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}