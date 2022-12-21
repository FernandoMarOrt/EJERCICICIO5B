/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generico;

/**
 *
 * @author fer
 */
public class CatalogoVehiculos extends CatalogoG<Vehiculo> {

    public CatalogoVehiculos(int tamanio) {
        super(tamanio);
    }

    //PONER BUSCAR VEHICULO 
    
    // Y CONSTRUCTOR CREANDO CTALOGO
    
    public Vehiculo buscarVehiculo(String bastidor) {
        // 
        Vehiculo aux = new Vehiculo();
        aux.setBastidor(bastidor); //
        int posicion = this.buscarElemento(aux);

        return (posicion >= 0) ? this.lista.get(posicion) : null;
    }
    
    
}
