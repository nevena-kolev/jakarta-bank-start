package model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity public class Bausparvertrag extends Produkt {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private long oid;
    private double monatlicheRate;
    private double praemie;
    private int gesamtlaufZeitInMonaten;
    private float garantierterZinsSatz;

    public Bausparvertrag() {

    }

    @Override public long getOid() {
        return oid;
    }

    @Override public void setOid(long oid) {
        this.oid = oid;
    }

    public double getMonatlicheRate() {
        return monatlicheRate;
    }

    public void setMonatlicheRate(double monatlicheRate) {
        this.monatlicheRate = monatlicheRate;
    }

    public double getPraemie() {
        return praemie;
    }

    public void setPraemie(double praemie) {
        this.praemie = praemie;
    }

    public int getGesamtlaufZeitInMonaten() {
        return gesamtlaufZeitInMonaten;
    }

    public void setGesamtlaufZeitInMonaten(int gesamtlaufZeitInMonaten) {
        this.gesamtlaufZeitInMonaten = gesamtlaufZeitInMonaten;
    }

    public float getGarantierterZinsSatz() {
        return garantierterZinsSatz;
    }

    public void setGarantierterZinsSatz(float garantierterZinsSatz) {
        this.garantierterZinsSatz = garantierterZinsSatz;
    }

    @Override public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bausparvertrag that = (Bausparvertrag) o;
        return oid == that.oid && Double.compare(that.monatlicheRate, monatlicheRate) == 0 && Double.compare(that.praemie, praemie) == 0 && gesamtlaufZeitInMonaten == that.gesamtlaufZeitInMonaten && Float.compare(that.garantierterZinsSatz, garantierterZinsSatz) == 0;
    }

    @Override public int hashCode() {
        return Objects.hash(super.hashCode(), oid, monatlicheRate, praemie, gesamtlaufZeitInMonaten, garantierterZinsSatz);
    }

    @Override public String toString() {
        return "Bausparvertrag{" +
                "oid=" + oid +
                ", monatlicheRate=" + monatlicheRate +
                ", praemie=" + praemie +
                ", gesamtlaufZeitInMonaten=" + gesamtlaufZeitInMonaten +
                ", garantierterZinsSatz=" + garantierterZinsSatz +
                '}';
    }
}
