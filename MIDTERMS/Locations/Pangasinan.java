package Locations;
import Tourists.Tourist;

public class Pangasinan implements Locations {

    public int airFare = 50;

    
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}