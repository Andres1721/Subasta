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
@Table(name = "tbl_cliente")
@NamedQueries({
    @NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM Cliente c")})
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "codigo_cli")
    private Integer codigoCli;
    @Size(max = 25)
    @Column(name = "nombre_cli")
    private String nombreCli;
    @Size(max = 25)
    @Column(name = "apellido_cli")
    private String apellidoCli;
    @Size(max = 16)
    @Column(name = "telefono_cli")
    private String telefonoCli;
    @Size(max = 25)
    @Column(name = "email_cli")
    private String emailCli;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigoCli", fetch = FetchType.LAZY)
    private Collection<Subasta> subastaCollection;

    public Cliente() {
    }

    public Cliente(Integer codigoCli) {
        this.codigoCli = codigoCli;
    }

    public Integer getCodigoCli() {
        return codigoCli;
    }

    public void setCodigoCli(Integer codigoCli) {
        this.codigoCli = codigoCli;
    }

    public String getNombreCli() {
        return nombreCli;
    }

    public void setNombreCli(String nombreCli) {
        this.nombreCli = nombreCli;
    }

    public String getApellidoCli() {
        return apellidoCli;
    }

    public void setApellidoCli(String apellidoCli) {
        this.apellidoCli = apellidoCli;
    }

    public String getTelefonoCli() {
        return telefonoCli;
    }

    public void setTelefonoCli(String telefonoCli) {
        this.telefonoCli = telefonoCli;
    }

    public String getEmailCli() {
        return emailCli;
    }

    public void setEmailCli(String emailCli) {
        this.emailCli = emailCli;
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
        hash += (codigoCli != null ? codigoCli.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.codigoCli == null && other.codigoCli != null) || (this.codigoCli != null && !this.codigoCli.equals(other.codigoCli))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "financials.suabasta.entity.subasta.Cliente[ codigoCli=" + codigoCli + " ]";
    }
    
}
