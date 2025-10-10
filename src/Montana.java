/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC 15
 */
public class Montana extends Paquete{
    
    private double costoGuia;
    private double alquilerEquipo;
    private double seguroPorcentaje;
    
    public Montana(){
	super();
    }
    
    public Montana(double costoGuia, double alquilerEquipo, double seguroPorcentaje){
        this.costoGuia = costoGuia;
        this.alquilerEquipo = alquilerEquipo;
        this.seguroPorcentaje = seguroPorcentaje;
    }
    
    public Montana(String destino, int dias, double precioBase, double costoGuia, double alquilerEquipo, double seguroPorcentaje){
	super(destino, dias, precioBase);
	this.costoGuia = costoGuia;
	this.alquilerEquipo = alquilerEquipo;
	this.seguroPorcentaje = seguroPorcentaje;
    }
    
    public void setCostoGuia(double costoGuia){
	this.costoGuia = costoGuia;
    }
    
    public void setAlquilerEquipo(double alquilerEquipo){
	this.alquilerEquipo = alquilerEquipo;
    }
    
    public void setSeguroPorcentaje(double seguroPorcentaje){
	this.seguroPorcentaje = seguroPorcentaje;
    }
    
    public double SubTotal(){
	return getPrecioBase() + costoGuia + alquilerEquipo;
    }
    
    public double Seguro(){
	return SubTotal() + seguroPorcentaje;
    }
    
    public double Total(){
	return SubTotal() + Seguro();
    }
    
    public String resumen(){
	return super.mostrarInfo() + "\nCosto Guia: " + costoGuia + "\nAlquiler Equipo: " + alquilerEquipo + "\nSeguro Porcentaje: " + seguroPorcentaje + "\n"; 
    }
    
    
}
