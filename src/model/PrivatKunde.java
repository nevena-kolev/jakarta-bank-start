package model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.sql.Timestamp;
import java.util.Objects;

@Entity public class PrivatKunde extends Kunde{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private long oid;
    private String vorName;
    private String familienName;
    private Timestamp geburtsDatum;
    private String geburtsOrt;

    public PrivatKunde() {

    }

    @Override public long getOid() {
        return oid;
    }

    @Override public void setOid(long oid) {
        this.oid = oid;
    }

    public String getVorName() {
        return vorName;
    }

    public void setVorName(String vorName) {
        this.vorName = vorName;
    }

    public String getFamilienName() {
        return familienName;
    }

    public void setFamilienName(String familienName) {
        this.familienName = familienName;
    }

    public Timestamp getGeburtsDatum() {
        return geburtsDatum;
    }

    public void setGeburtsDatum(Timestamp geburtsDatum) {
        this.geburtsDatum = geburtsDatum;
    }

    public String getGeburtsOrt() {
        return geburtsOrt;
    }

    public void setGeburtsOrt(String geburtsOrt) {
        this.geburtsOrt = geburtsOrt;
    }

    @Override public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PrivatKunde that = (PrivatKunde) o;
        return oid == that.oid && Objects.equals(vorName, that.vorName) && Objects.equals(familienName, that.familienName) && Objects.equals(geburtsDatum, that.geburtsDatum) && Objects.equals(geburtsOrt, that.geburtsOrt);
    }

    @Override public int hashCode() {
        return Objects.hash(super.hashCode(), oid, vorName, familienName, geburtsDatum, geburtsOrt);
    }

    @Override public String toString() {
        return "Produkt{" +
                "oid=" + oid +
                ", vorName='" + vorName + '\'' +
                ", familienName='" + familienName + '\'' +
                ", geburtsDatum=" + geburtsDatum +
                ", geburtsOrt='" + geburtsOrt + '\'' +
                '}';
    }
}
