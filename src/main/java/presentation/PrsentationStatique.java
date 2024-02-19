package presentation;

import dao.DaoImpl;
import dao.IDao;
import metier.IMetier;
import metier.MetierImpl;

public class PrsentationStatique {
    public static void main(String[] args) {
        IDao dao = new DaoImpl();
        IMetier metier = new MetierImpl(dao);
        System.out.println("res :"+ metier.calcul());
    }
}
