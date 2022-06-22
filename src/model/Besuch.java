package model;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity public class Besuch {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long oid;

    private Timestamp datum;
    private String uhrZeit;
    private String beschreibung;
    private int bewertung;

    public Besuch() {

    }

    public long getOid() {
        return oid;
    }

    public void setOid(long oid) {
        this.oid = oid;
    }

    public Timestamp getDatum() {
        return datum;
    }

    public void setDatum(Timestamp datum) {
        this.datum = datum;
    }

    public String getUhrZeit() {
        return uhrZeit;
    }

    public void setUhrZeit(String uhrZeit) {
        this.uhrZeit = uhrZeit;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public int getBewertung() {
        return bewertung;
    }

    public void setBewertung(int bewertung) {
        this.bewertung = bewertung;
    }

    @Override public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Besuch besuch = (Besuch) o;
        return oid == besuch.oid && bewertung == besuch.bewertung && Objects.equals(datum, besuch.datum) && Objects.equals(uhrZeit, besuch.uhrZeit) && Objects.equals(beschreibung, besuch.beschreibung);
    }

    @Override public int hashCode() {
        return Objects.hash(oid, datum, uhrZeit, beschreibung, bewertung);
    }

    @Override public String toString() {
        return "Besuch{" +
                "oid=" + oid +
                ", datum=" + datum +
                ", uhrZeit='" + uhrZeit + '\'' +
                ", beschreibung='" + beschreibung + '\'' +
                ", bewertung=" + bewertung +
                '}';
    }
}
