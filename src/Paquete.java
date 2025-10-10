
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC 15
 */
public class Paquete {
    
    private String destino;
    private int dias;
    private double precioBase;
    
    public Paquete(String destino, int dias, double precioBase){
        this.destino = destino;
        this.dias = dias;
        this.precioBase = precioBase;
    }
    
    public Paquete(){
        super();
    }
    
    
    public void setDestino(String destino){
        this.destino = destino;
    }
    
    public void setDias(int dias){
	if(dias > 0){
            this.dias = dias;
	}
	else{
	    this.dias = 0;
	}
    }
    
    public void setPrecioBase(double precioBase){
	if(precioBase > 0){
	    this.precioBase = precioBase;
	}
	else{
	    this.precioBase = 0;
	}
    }

    public double getPrecioBase() {
	return precioBase;
    }
    
    
    public String mostrarInfo(){
        return "----------------- Datos ----------------- " + "\nLugar: " + destino + "\nDias: " + dias + "\nPrecio: " + precioBase + "\n";
    }
}
