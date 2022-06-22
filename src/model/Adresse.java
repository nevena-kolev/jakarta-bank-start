package model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity public class Adresse {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private long oid;
    private boolean istZustellAdresse;
    private String strasse;
    private String hausNummer;
    private int postLeitZahl;
    private String ort;

    public Adresse() {

    }

    public long getOid() {
        return oid;
    }

    public void setOid(long oid) {
        this.oid = oid;
    }

    public boolean isIstZustellAdresse() {
        return istZustellAdresse;
    }

    public void setIstZustellAdresse(boolean istZustellAdresse) {
        this.istZustellAdresse = istZustellAdresse;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public String getHausNummer() {
        return hausNummer;
    }

    public void setHausNummer(String hausNummer) {
        this.hausNummer = hausNummer;
    }

    public int getPostLeitZahl() {
        return postLeitZahl;
    }

    public void setPostLeitZahl(int postLeitZahl) {
        this.postLeitZahl = postLeitZahl;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    @Override public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Adresse adresse = (Adresse) o;
        return oid == adresse.oid && istZustellAdresse == adresse.istZustellAdresse && postLeitZahl == adresse.postLeitZahl && Objects.equals(strasse, adresse.strasse) && Objects.equals(hausNummer, adresse.hausNummer) && Objects.equals(ort, adresse.ort);
    }

    @Override public int hashCode() {
        return Objects.hash(oid, istZustellAdresse, strasse, hausNummer, postLeitZahl, ort);
    }

    @Override public String toString() {
        return "Adresse{" +
                "oid=" + oid +
                ", istZustellAdresse=" + istZustellAdresse +
                ", strasse='" + strasse + '\'' +
                ", hausNummer='" + hausNummer + '\'' +
                ", postLeitZahl=" + postLeitZahl +
                ", ort='" + ort + '\'' +
                '}';
    }
}
