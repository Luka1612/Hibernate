package hibernate;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "ime")
    private String ime;
    @Column(name = "brojgodina")
    private int brojgodina;
    @Column(name = "adresa")
    private String adresa;
    @Column(name = "dohotak")
    private int dohotak;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getBrojgodina() {
        return brojgodina;
    }

    public void setBrojgodina(int brojgodina) {
        this.brojgodina = brojgodina;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public int getDohotak() {
        return dohotak;
    }

    public void setDohotak(int dohotak) {
        this.dohotak = dohotak;
    }

    public Person(String ime, int brojgodina, String adresa, int dohotak) {

        this.ime = ime;
        this.brojgodina = brojgodina;
        this.adresa = adresa;
        this.dohotak = dohotak;
        

    }

    public Person() {
    }

    @Override
    public String toString() {
        return ime + ";" + brojgodina + ";" + adresa + ";" + dohotak;
    }

    

}
