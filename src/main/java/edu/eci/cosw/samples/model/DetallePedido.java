package edu.eci.cosw.samples.model;

// Generated Feb 5, 2013 5:52:11 PM by Hibernate Tools 3.4.0.CR1

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

/**
 * AlmDetallesPedido generated by hbm2java
 */
@Entity
@Table(name = "ALM_DETALLES_PEDIDO" )
public class DetallePedido implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8518145128362313552L;
	private DetallePedidoId id;
	private Producto almProductos;
	private int cantidad;

	public DetallePedido() {
            
	}

	public DetallePedido(DetallePedidoId id, Producto almProductos,
			 int cantidad) {
		this.id = id;
		this.almProductos = almProductos;
		this.cantidad = cantidad;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "productosIdproducto", column = @Column(name = "PRODUCTOS_idproducto", nullable = false)),
			@AttributeOverride(name = "pedidosIdpedido", column = @Column(name = "PEDIDOS_idpedido", nullable = false)) })
	public DetallePedidoId getId() {
		return this.id;
	}

	public void setId(DetallePedidoId id) {
		this.id = id;
	}
   
        
	@ManyToOne    
        @Fetch(FetchMode.JOIN)
	@JoinColumn(name = "PRODUCTOS_idproducto", nullable = false, insertable = false, updatable = false)
	public Producto getProducto() {
		return this.almProductos;
	}

	public void setProducto(Producto almProductos) {
		this.almProductos = almProductos;
	}


	@Column(name = "cantidad", nullable = false)
	public int getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

}
