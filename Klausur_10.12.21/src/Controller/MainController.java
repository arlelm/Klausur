package Controller;
import Model.*;
import View.*;
import java.util.ArrayList;

public class MainController {
    
    ArrayList<Raeume> Raeumes = new ArrayList<Raeume>();
    ArrayList<Buchung> Buchungs = new ArrayList<Buchung>();

    Output o = new Output(); 
    
    public void alleBuchungen(){
        for(Buchung buchung : Buchungs){
            o.printData(Buchungs);
        }
    }
    


    public MainController(){
     
        Raeume r1 = new Raeume("Breaking Bad", 4, 1, "Schlüssel steckt im Zündschloss", 90, 12);
        Raeumes.add(r1);

        Raeume r2 = new Raeume("Walking dead", 6, 3,"Schlüsselkarte in der Brust der Leiche Nr. 2", 120, 14);
        Raeumes.add(r2);

        Raeume r3 = new Raeume("Squid Game", 4, 2,"Schlüssel ist in der Schwarzen Maske",90, 18);
        Raeumes.add(r3);

        Raeume r4 = new Raeume("American", 6, 2, "Im linken Schuh der Leiche af dem Sofa", 140, 18);
        Raeumes.add(r4);

        Buchung b1 = new Buchung("20.04.2022, 13 Uhr", 4, "Alexander McLoughlin", "Raum 2", 15);
        Buchungs.add(b1);

        Buchung b2 = new Buchung("14.07.2022", 3, "Ian McLoughlin", "Raum 1", 16);
        Buchungs.add(b2);

    
       


    }
  
    

}
