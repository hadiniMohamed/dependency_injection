package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service("metier")
public class MetierImpl implements IMetier {

    //Couplage faible
    private IDao dao;

    public MetierImpl(@Qualifier("dao2") IDao dao) {
        this.dao = dao;
    }

//    public MetierImpl() {
//    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        return dao.getData()*10;
    }
}
