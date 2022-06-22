package model;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity public class FirmenKunde extends Kunde {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private long oid;
    private String firmenLangbezeichnung;
    private String firmenKuerzel;
    private Timestamp gruendungsdatum;
    private String gruendungsort;
    private String gesellschaftsform;

    public FirmenKunde() {

    }

    @Override public long getOid() {
        return oid;
    }

    @Override public void setOid(long oid) {
        this.oid = oid;
    }

    public String getFirmenLangbezeichnung() {
        return firmenLangbezeichnung;
    }

    public void setFirmenLangbezeichnung(String firmenLangbezeichnung) {
        this.firmenLangbezeichnung = firmenLangbezeichnung;
    }

    public String getFirmenKuerzel() {
        return firmenKuerzel;
    }

    public void setFirmenKuerzel(String firmenKuerzel) {
        this.firmenKuerzel = firmenKuerzel;
    }

    public Timestamp getGruendungsdatum() {
        return gruendungsdatum;
    }

    public void setGruendungsdatum(Timestamp gruendungsdatum) {
        this.gruendungsdatum = gruendungsdatum;
    }

    public String getGruendungsort() {
        return gruendungsort;
    }

    public void setGruendungsort(String gruendungsort) {
        this.gruendungsort = gruendungsort;
    }

    public String getGesellschaftsform() {
        return gesellschaftsform;
    }

    public void setGesellschaftsform(String gesellschaftsform) {
        this.gesellschaftsform = gesellschaftsform;
    }

    @Override public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        FirmenKunde that = (FirmenKunde) o;
        return oid == that.oid && Objects.equals(firmenLangbezeichnung, that.firmenLangbezeichnung) && Objects.equals(firmenKuerzel, that.firmenKuerzel) && Objects.equals(gruendungsdatum, that.gruendungsdatum) && Objects.equals(gruendungsort, that.gruendungsort) && Objects.equals(gesellschaftsform, that.gesellschaftsform);
    }

    @Override public int hashCode() {
        return Objects.hash(super.hashCode(), oid, firmenLangbezeichnung, firmenKuerzel, gruendungsdatum, gruendungsort, gesellschaftsform);
    }

    @Override public String toString() {
        return "FirmenKunde{" +
                "oid=" + oid +
                ", firmenLangbezeichnung='" + firmenLangbezeichnung + '\'' +
                ", firmenKuerzel='" + firmenKuerzel + '\'' +
                ", gruendungsdatum=" + gruendungsdatum +
                ", gruendungsort='" + gruendungsort + '\'' +
                ", gesellschaftsform='" + gesellschaftsform + '\'' +
                '}';
    }
}
