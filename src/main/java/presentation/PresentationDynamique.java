package presentation;

import dao.IDao;
import metier.IMetier;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PresentationDynamique {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        // Instantiation dynamique de la classe DaoImpl
        Class cDao = Class.forName("dao.DaoImpl");
        IDao dao = (IDao) cDao.newInstance();

        // Instantiation dynamique de la classe MetierImpl
        Class cMetier = Class.forName("metier.MetierImpl");
        IMetier metier = (IMetier) cMetier.newInstance();

        // Appel de la méthode setDao pour injecter le dao dans le metier
        Method method =cMetier.getMethod("setDao", IDao.class);
        method.invoke(metier,dao);

        System.out.println("resualt"+metier.calcul());


    }
}
