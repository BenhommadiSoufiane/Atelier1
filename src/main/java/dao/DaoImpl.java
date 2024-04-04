package dao;

import org.springframework.stereotype.Component;

@Component
public class DaoImpl implements  IDao{
    @Override
    public double getData() {
        System.out.println("Base de donnees ");
        double data=34;
        return data;
    }
}
