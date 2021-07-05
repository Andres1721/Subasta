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
@Table(name = "tbl_producto")
@NamedQueries({
    @NamedQuery(name = "lProducto.findAll", query = "SELECT l FROM lProducto l")})
public class lProducto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "codigo_pdt")
    private Integer codigoPdt;
    @Size(max = 25)
    @Column(name = "nombre_pdt")
    private String nombrePdt;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "valorInicial_ptd")
    private Double valorInicialptd;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigoPdt", fetch = FetchType.LAZY)
    private Collection<Subasta> subastaCollection;

    public lProducto() {
    }

    public lProducto(Integer codigoPdt) {
        this.codigoPdt = codigoPdt;
    }

    public Integer getCodigoPdt() {
        return codigoPdt;
    }

    public void setCodigoPdt(Integer codigoPdt) {
        this.codigoPdt = codigoPdt;
    }

    public String getNombrePdt() {
        return nombrePdt;
    }

    public void setNombrePdt(String nombrePdt) {
        this.nombrePdt = nombrePdt;
    }

    public Double getValorInicialptd() {
        return valorInicialptd;
    }

    public void setValorInicialptd(Double valorInicialptd) {
        this.valorInicialptd = valorInicialptd;
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
        hash += (codigoPdt != null ? codigoPdt.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof lProducto)) {
            return false;
        }
        lProducto other = (lProducto) object;
        if ((this.codigoPdt == null && other.codigoPdt != null) || (this.codigoPdt != null && !this.codigoPdt.equals(other.codigoPdt))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "financials.suabasta.entity.subasta.lProducto[ codigoPdt=" + codigoPdt + " ]";
    }
    
}
