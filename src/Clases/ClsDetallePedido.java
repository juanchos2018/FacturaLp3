/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author usuario
 */
public class ClsDetallePedido {
    String IdPedido;
    String IdProducto;
    String Descripcion;
    String Precio;
    String Cntidad;
    String Subtotal;

    public ClsDetallePedido(String IdPedido, String IdProducto, String Descripcion, String Precio, String Cntidad) {
        this.IdPedido = IdPedido;
        this.IdProducto = IdProducto;
        this.Descripcion = Descripcion;
        this.Precio = Precio;
        this.Cntidad = Cntidad;
     //   this.Subtotal = Subtotal;
    }

    public String getIdPedido() {
        return IdPedido;
    }

    public void setIdPedido(String IdPedido) {
        this.IdPedido = IdPedido;
    }

    public String getIdProducto() {
        return IdProducto;
    }

    public void setIdProducto(String IdProducto) {
        this.IdProducto = IdProducto;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String Precio) {
        this.Precio = Precio;
    }

    public String getCntidad() {
        return Cntidad;
    }

    public void setCntidad(String Cntidad) {
        this.Cntidad = Cntidad;
    }

    public String getSubtotal() {
        return Subtotal;
    }

    public void setSubtotal(String Subtotal) {
        this.Subtotal = Subtotal;
    }
    
    
    
}
