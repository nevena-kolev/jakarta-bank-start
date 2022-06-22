package model;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity @Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) public abstract class Kunde {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private long oid;
    private Timestamp beginnDerGeschaeftsBeziehung;
    private String klassifizierung;

    public Kunde() {

    }

    public long getOid() {
        return oid;
    }

    public void setOid(long oid) {
        this.oid = oid;
    }

    public Timestamp getBeginnDerGeschaeftsBeziehung() {
        return beginnDerGeschaeftsBeziehung;
    }

    public void setBeginnDerGeschaeftsBeziehung(Timestamp beginnDerGeschaeftsBeziehung) {
        this.beginnDerGeschaeftsBeziehung = beginnDerGeschaeftsBeziehung;
    }

    public String getKlassifizierung() {
        return klassifizierung;
    }

    public void setKlassifizierung(String klassifizierung) {
        this.klassifizierung = klassifizierung;
    }

    @Override public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kunde kunde = (Kunde) o;
        return oid == kunde.oid && Objects.equals(beginnDerGeschaeftsBeziehung, kunde.beginnDerGeschaeftsBeziehung) && Objects.equals(klassifizierung, kunde.klassifizierung);
    }

    @Override public int hashCode() {
        return Objects.hash(oid, beginnDerGeschaeftsBeziehung, klassifizierung);
    }

    @Override public String toString() {
        return "Kunde{" +
                "oid=" + oid +
                ", beginnDerGeschaeftsBeziehung=" + beginnDerGeschaeftsBeziehung +
                ", klassifizierung='" + klassifizierung + '\'' +
                '}';
    }
}
