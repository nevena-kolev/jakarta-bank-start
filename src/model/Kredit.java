package model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity @Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) public class Kredit extends Produkt {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private long oid;
    private double basisKreditBetrag;
    private double aktuellerSaldo;
    private float aktuellerZinsSatz;
    private int ausstehendeTilgungen;

    public Kredit() {

    }

    @Override public long getOid() {
        return oid;
    }

    @Override public void setOid(long oid) {
        this.oid = oid;
    }

    public double getBasisKreditBetrag() {
        return basisKreditBetrag;
    }

    public void setBasisKreditBetrag(double basisKreditBetrag) {
        this.basisKreditBetrag = basisKreditBetrag;
    }

    public double getAktuellerSaldo() {
        return aktuellerSaldo;
    }

    public void setAktuellerSaldo(double aktuellerSaldo) {
        this.aktuellerSaldo = aktuellerSaldo;
    }

    public float getAktuellerZinsSatz() {
        return aktuellerZinsSatz;
    }

    public void setAktuellerZinsSatz(float aktuellerZinsSatz) {
        this.aktuellerZinsSatz = aktuellerZinsSatz;
    }

    public int getAusstehendeTilgungen() {
        return ausstehendeTilgungen;
    }

    public void setAusstehendeTilgungen(int ausstehendeTilgungen) {
        this.ausstehendeTilgungen = ausstehendeTilgungen;
    }

    @Override public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Kredit kredit = (Kredit) o;
        return oid == kredit.oid && Double.compare(kredit.basisKreditBetrag, basisKreditBetrag) == 0 && Double.compare(kredit.aktuellerSaldo, aktuellerSaldo) == 0 && Float.compare(kredit.aktuellerZinsSatz, aktuellerZinsSatz) == 0 && ausstehendeTilgungen == kredit.ausstehendeTilgungen;
    }

    @Override public int hashCode() {
        return Objects.hash(super.hashCode(), oid, basisKreditBetrag, aktuellerSaldo, aktuellerZinsSatz, ausstehendeTilgungen);
    }

    @Override public String toString() {
        return "Kredit{" +
                "oid=" + oid +
                ", basisKreditBetrag=" + basisKreditBetrag +
                ", aktuellerSaldo=" + aktuellerSaldo +
                ", aktuellerZinsSatz=" + aktuellerZinsSatz +
                ", ausstehendeTilgungen=" + ausstehendeTilgungen +
                '}';
    }
}
