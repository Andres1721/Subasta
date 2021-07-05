/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package financials.suabasta.facade.subasta;

import financials.suabasta.entity.subasta.Moneda;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ai00214
 */
@Stateless
public class MonedaFacade extends AbstractFacade<Moneda> implements MonedaFacadeLocal {

    @PersistenceContext(unitName = "financials.suabasta.entity_Subasta_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MonedaFacade() {
        super(Moneda.class);
    }
    
}
