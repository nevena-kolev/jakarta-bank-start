package model;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity @Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) public abstract class Produkt {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private long oid;
    private Timestamp eroeffnungsDatum;
    private String interneBezeichnung;
    private Timestamp ablaufDatum;

    public Produkt() {

    }

    public long getOid() {
        return oid;
    }

    public void setOid(long oid) {
        this.oid = oid;
    }

    public Timestamp getEroeffnungsDatum() {
        return eroeffnungsDatum;
    }

    public void setEroeffnungsDatum(Timestamp eroeffnungsDatum) {
        this.eroeffnungsDatum = eroeffnungsDatum;
    }

    public String getInterneBezeichnung() {
        return interneBezeichnung;
    }

    public void setInterneBezeichnung(String interneBezeichnung) {
        this.interneBezeichnung = interneBezeichnung;
    }

    public Timestamp getAblaufDatum() {
        return ablaufDatum;
    }

    public void setAblaufDatum(Timestamp ablaufDatum) {
        this.ablaufDatum = ablaufDatum;
    }

    @Override public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produkt produkt = (Produkt) o;
        return oid == produkt.oid && Objects.equals(eroeffnungsDatum, produkt.eroeffnungsDatum) && Objects.equals(interneBezeichnung, produkt.interneBezeichnung) && Objects.equals(ablaufDatum, produkt.ablaufDatum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(oid, eroeffnungsDatum, interneBezeichnung, ablaufDatum);
    }

    @Override public String toString() {
        return "Produkt{" +
                "oid=" + oid +
                ", eroeffnungsDatum=" + eroeffnungsDatum +
                ", interneBezeichnung='" + interneBezeichnung + '\'' +
                ", ablaufDatum=" + ablaufDatum +
                '}';
    }
}
