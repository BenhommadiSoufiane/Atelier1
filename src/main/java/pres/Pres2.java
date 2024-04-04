package pres;

import dao.IDao;
import ext.DaoImpl2;
import metier.IMetier;
import metier.MetierImpl;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) throws Exception {
        //DaoImpl2 dao = new DaoImpl2(); //
        Scanner scanner= new Scanner(new File("config.txt"));
        String daoClassName=scanner.nextLine();
        Class cDao=Class.forName(daoClassName);
        IDao dao=(IDao) cDao.getConstructor().newInstance();//new DaoImpl

        //MetierImpl metier = new MetierImpl();
        String metierClassName=scanner.nextLine();
        Class cMetier=Class.forName(metierClassName);
        IMetier metier=(IMetier) cMetier.getConstructor(IDao.class).newInstance(dao);

        // metier.setDao(dao); // Statique
        //Method setDao=  cMetier.getDeclaredMethod("setDao", IDao.class);
       // setDao.invoke(metier,dao);// Injection des dépendences dynamique
        System.out.println("Res="+metier.calcul());
    }
}
