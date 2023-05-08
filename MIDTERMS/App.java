     import Locations.*;
        import Tourists.*;
        
        public class App {
            public static void main(String[] args) throws Exception {
        
                Locations Bohol = new Bohol();
                Locations Boracay = new Boracay();
                Locations Cebu = new Pangasinan();
                Locations Palawan = new Bataan();
                Locations Siargao = new Isabela();
                Locations Vigan = new Iloilo();
        
                Tourist Me = new Umengan();
        
                Boracay.accept(Me);
                Bohol.accept(Me);
                Cebu.accept(Me);
                Palawan.accept(Me);
                Siargao.accept(Me);
                Vigan.accept(Me);
        
        
        
            }
        }