package model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity @Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) public class Sparbuch extends Produkt {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private long oid;
    private float zinsSatz;
    private double aktuellerSparSaldo;
    private int sperrdauerInMonaten;

    public Sparbuch() {

    }

    @Override public long getOid() {
        return oid;
    }

    @Override public void setOid(long oid) {
        this.oid = oid;
    }

    public float getZinsSatz() {
        return zinsSatz;
    }

    public void setZinsSatz(float zinsSatz) {
        this.zinsSatz = zinsSatz;
    }

    public double getAktuellerSparSaldo() {
        return aktuellerSparSaldo;
    }

    public void setAktuellerSparSaldo(double aktuellerSparSaldo) {
        this.aktuellerSparSaldo = aktuellerSparSaldo;
    }

    public int getSperrdauerInMonaten() {
        return sperrdauerInMonaten;
    }

    public void setSperrdauerInMonaten(int sperrdauerInMonaten) {
        this.sperrdauerInMonaten = sperrdauerInMonaten;
    }

    @Override public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Sparbuch sparbuch = (Sparbuch) o;
        return oid == sparbuch.oid && Float.compare(sparbuch.zinsSatz, zinsSatz) == 0 && Double.compare(sparbuch.aktuellerSparSaldo, aktuellerSparSaldo) == 0 && sperrdauerInMonaten == sparbuch.sperrdauerInMonaten;
    }

    @Override public int hashCode() {
        return Objects.hash(super.hashCode(), oid, zinsSatz, aktuellerSparSaldo, sperrdauerInMonaten);
    }

    @Override public String toString() {
        return "Sparbuch{" +
                "oid=" + oid +
                ", zinsSatz=" + zinsSatz +
                ", aktuellerSparSaldo=" + aktuellerSparSaldo +
                ", sperrdauerInMonaten=" + sperrdauerInMonaten +
                '}';
    }
}
