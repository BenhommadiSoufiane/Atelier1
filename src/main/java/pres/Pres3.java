package pres;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Pres3 {
    public static void main(String[] args) {
        ApplicationContext Springcontext=new ClassPathXmlApplicationContext("config.xml");
        IMetier metier=Springcontext.getBean(IMetier.class);
        System.out.println("Res"+metier.calcul());
    }
}
