package pres;

import dao.DaoImpl;
import ext.DaoImpl2;
import metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        DaoImpl2 dao = new DaoImpl2(); // Instanciation statique
        MetierImpl metier = new MetierImpl(dao); // Injection via le constructeur
        metier.setDao(dao); // injéction des dépendances
        System.out.println("Res"+metier.calcul());
    }
}
