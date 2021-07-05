/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package financials.suabasta.entity.subasta;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author ai00214
 */
@Entity
@Table(name = "tbl_subasta")
@NamedQueries({
    @NamedQuery(name = "Subasta.findAll", query = "SELECT s FROM Subasta s")})
public class Subasta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_sub")
    private Integer idSub;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "valorOfrece_sub")
    private Double valorOfrecesub;
    @JoinColumn(name = "codigo_cli", referencedColumnName = "codigo_cli")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Cliente codigoCli;
    @JoinColumn(name = "codigo_mod", referencedColumnName = "codigo_mod")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Moneda codigoMod;
    @JoinColumn(name = "codigo_pdt", referencedColumnName = "codigo_pdt")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private lProducto codigoPdt;

    public Subasta() {
    }

    public Subasta(Integer idSub) {
        this.idSub = idSub;
    }

    public Integer getIdSub() {
        return idSub;
    }

    public void setIdSub(Integer idSub) {
        this.idSub = idSub;
    }

    public Double getValorOfrecesub() {
        return valorOfrecesub;
    }

    public void setValorOfrecesub(Double valorOfrecesub) {
        this.valorOfrecesub = valorOfrecesub;
    }

    public Cliente getCodigoCli() {
        return codigoCli;
    }

    public void setCodigoCli(Cliente codigoCli) {
        this.codigoCli = codigoCli;
    }

    public Moneda getCodigoMod() {
        return codigoMod;
    }

    public void setCodigoMod(Moneda codigoMod) {
        this.codigoMod = codigoMod;
    }

    public lProducto getCodigoPdt() {
        return codigoPdt;
    }

    public void setCodigoPdt(lProducto codigoPdt) {
        this.codigoPdt = codigoPdt;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSub != null ? idSub.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Subasta)) {
            return false;
        }
        Subasta other = (Subasta) object;
        if ((this.idSub == null && other.idSub != null) || (this.idSub != null && !this.idSub.equals(other.idSub))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "financials.suabasta.entity.subasta.Subasta[ idSub=" + idSub + " ]";
    }
    
}
