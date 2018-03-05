/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cosw.examples.productorders.repositories;

import edu.eci.cosw.samples.model.Cliente;
import edu.eci.cosw.samples.model.Producto;
import edu.eci.cosw.samples.model.Vehiculo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author 2101751
 */

public interface ClientRepository extends JpaRepository<Cliente, Integer>{
  
    @Query("select pedido.cliente from Pedido pedido left join pedido.detallesPedidos as detpedido left join detpedido.producto as producto with producto.precio>?1")
    List<Cliente> findClientByProductPrice(long price);
    
}
