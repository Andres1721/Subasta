/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package financials.suabasta.facade.subasta;

import financials.suabasta.entity.subasta.lProducto;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author ai00214
 */
@Local
public interface lProductoFacadeLocal {

    void create(lProducto lProducto);

    void edit(lProducto lProducto);

    void remove(lProducto lProducto);

    lProducto find(Object id);

    List<lProducto> findAll();

    List<lProducto> findRange(int[] range);

    int count();
    
}
