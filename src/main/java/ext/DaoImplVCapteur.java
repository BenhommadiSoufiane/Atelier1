package ext;

import dao.IDao;
import org.springframework.stereotype.Component;

@Component
public class DaoImplVCapteur implements IDao {
    @Override
    public double getData() {
        System.out.println("Version Capteurs");
        double data=77;
        return data;
    }
}
