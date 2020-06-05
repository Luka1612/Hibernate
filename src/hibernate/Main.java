package hibernate;

import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {

    public static void main(String[] args) {

        String[] options = {"Unos novog zaposlenog", "Prikaz svih zaposlenih", "Traženje zaposlenog po ID-u", "Izmjena zaposlenog po ID-u", "Brisanje zaposlenog po ID-u",};

        int x = JOptionPane.showOptionDialog(null, "Izaberite opciju: ",
                "Baza podataka o zaposlenima",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

        if (x == 0) {
            Unos unos2 = new Unos();
            unos2.setSize(500, 400);
            unos2.setLocation(100, 200);
            unos2.setVisible(true);

        }
        if (x == 1) {
            Prikaz prikaz2 = new Prikaz();
            prikaz2.setSize(600, 400);
            prikaz2.setLocation(100, 200);
            prikaz2.setVisible(true);

        }
        if (x == 2) {
            IdTrazenje trazenje2 = new IdTrazenje();
            trazenje2.setSize(500, 400);
            trazenje2.setLocation(100, 200);
            trazenje2.setVisible(true);

        }
        if (x == 3) {
            Izmjena izmjena2 = new Izmjena();
            izmjena2.setSize(500, 400);
            izmjena2.setLocation(100, 200);
            izmjena2.setVisible(true);

        }
        if (x == 4) {
            Delete delete2 = new Delete();
            delete2.setSize(500, 400);
            delete2.setLocation(100, 200);
            delete2.setVisible(true);

        }

    }

}
