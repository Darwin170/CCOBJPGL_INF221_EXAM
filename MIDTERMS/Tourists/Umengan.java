package Tourists;

import Locations.*;

public class Umengan implements Tourist {

    static int budget = 1000;
    

    public void visit() {
        System.out.print("Enjoying my stay");
    }

    public void visit(Boracay boracay) {
        System.out.println("may budget akong " + getBudget());

        if ( budget > boracay.airFare  ){
            System.out.println("arat boracay balikan lang" );
            budget -= boracay.airFare;
            
        }else{
            System.out.println("Awit zero balance na ");
        }

      checkBudget();
        
    }

    public void visit(Bohol bohol) {

        if(budget >bohol.airFare){
            System.out.println("tara bohol mag kape");
            budget -= bohol.airFare;
        }else{
            System.out.println("next time nalang ulit");
        }

        checkBudget();
    }
    public void visit(Pangasinan pangasinan) {
        if(budget >pangasinan.airFare){
            System.out.println("tara pangasinan mamalengke lang");
            budget -= pangasinan.airFare;
        }else{
            System.out.println("ubos naman ang pera");
        }

        checkBudget();
    }

    public void visit(Bataan bataan) {
        if(budget >bataan.airFare){
            System.out.println("tara bataan ikot lang ");
            budget -= bataan.airFare;
        }else{
            System.out.println("matic ubos naman ang pera");
        }

        checkBudget();
    }

    public void visit(Isabela isabela) {
        if(budget >isabela.airFare){
            System.out.println("LETS GO ISABELA!!!!!!!!!");
            budget -= isabela.airFare;
        }else{
            System.out.println("next sahod nalang");
        }

        checkBudget();
    }

    public void visit(Iloilo iloilo) {
        if(budget >iloilo.airFare){
            System.out.println("Iloilo gala lang");
            budget -= iloilo.airFare;
        }else{
            System.out.println("ubos ang pera");
        }

        checkBudget();
    }

    public void checkBudget() {
        System.out.println("my budget is " + budget);
    }

    public static int getBudget() {
        return budget;
    }


}