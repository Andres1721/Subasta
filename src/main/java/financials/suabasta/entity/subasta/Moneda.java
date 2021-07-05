/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package financials.suabasta.entity.subasta;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author ai00214
 */
@Entity
@Table(name = "tbl_moneda")
@NamedQueries({
    @NamedQuery(name = "Moneda.findAll", query = "SELECT m FROM Moneda m")})
public class Moneda implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "codigo_mod")
    private Integer codigoMod;
    @Size(max = 25)
    @Column(name = "moneda_mod")
    private String monedaMod;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigoMod", fetch = FetchType.LAZY)
    private Collection<Subasta> subastaCollection;

    public Moneda() {
    }

    public Moneda(Integer codigoMod) {
        this.codigoMod = codigoMod;
    }

    public Integer getCodigoMod() {
        return codigoMod;
    }

    public void setCodigoMod(Integer codigoMod) {
        this.codigoMod = codigoMod;
    }

    public String getMonedaMod() {
        return monedaMod;
    }

    public void setMonedaMod(String monedaMod) {
        this.monedaMod = monedaMod;
    }

    public Collection<Subasta> getSubastaCollection() {
        return subastaCollection;
    }

    public void setSubastaCollection(Collection<Subasta> subastaCollection) {
        this.subastaCollection = subastaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoMod != null ? codigoMod.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Moneda)) {
            return false;
        }
        Moneda other = (Moneda) object;
        if ((this.codigoMod == null && other.codigoMod != null) || (this.codigoMod != null && !this.codigoMod.equals(other.codigoMod))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "financials.suabasta.entity.subasta.Moneda[ codigoMod=" + codigoMod + " ]";
    }
    
}
