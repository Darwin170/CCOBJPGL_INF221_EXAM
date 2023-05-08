package Tourists;
import Locations.Boracay;
import Locations.Locations;
import Locations.Bohol;
import Locations.Pangasinan;
import Locations.Bataan;
import Locations.Isabela;
import Locations.Iloilo;

public interface Tourist {

    int budget = 1000;

    void visit();

    void visit(Boracay boracay);

    void visit(Bohol bohol);
    
    void visit(Pangasinan cebu);

    void visit(Bataan palawan);

    void visit(Isabela isabela);

    void visit(Iloilo iloilo);

    default void visit(Locations locations) {
        System.out.println("Arrived on a location");
    };

    void checkBudget();
}