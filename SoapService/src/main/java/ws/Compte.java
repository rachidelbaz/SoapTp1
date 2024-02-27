package ws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlTransient;

import java.util.Date;
@XmlAccessorType(XmlAccessType.FIELD)
public class Compte {
    private int code;
    private double solde;
    @XmlTransient
    private Date creationDate;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public double getSolde() {
        return solde;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public Compte(int code, double solde, Date creationDate) {
        this.code = code;
        this.solde = solde;
        this.creationDate = creationDate;
    }

    public Compte() {
    }

}
