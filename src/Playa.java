/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC 15
 */
public class Playa extends Paquete {

    private boolean todoIncluido;
    private double impuestoTuristico;
    private double descuentoTemporada;

    public Playa() {
        super();
    }

    public Playa(boolean todoIncluido, double impuestoTuristico, double descuentoTemporada) {
        this.todoIncluido = todoIncluido;
        this.impuestoTuristico = impuestoTuristico;
        this.descuentoTemporada = descuentoTemporada;
    }

    public Playa(String destino, int dias, double precioBase, double impuestoTuristico, double descuentoTemporada) {
        super(destino, dias, precioBase);
        this.impuestoTuristico = impuestoTuristico;
        this.descuentoTemporada = descuentoTemporada;
    }

    public void setImpuestoTuristico(double impuestoTuristico) {
        this.impuestoTuristico = impuestoTuristico;
    }

    public void setDescuentoTemporada(double descuentoTemporada) {
        this.descuentoTemporada = descuentoTemporada;
    }


    public double calcularDescuento() {
        return getPrecioBase() * descuentoTemporada / 100;
    }

    public double calcularImpuesto() {
        return getPrecioBase() * impuestoTuristico / 100;
    }

    public double calcularTotal(boolean todoIncluido) {
        double subtotal = getPrecioBase() - calcularDescuento() + calcularImpuesto();
        if (todoIncluido) {
            return subtotal + 200;
        } else {
            return subtotal;
        }
    }

    public String resumenInfo() {

        return super.mostrarInfo() + "\nDescuento: " + calcularDescuento() + "\nImpuesto: " + calcularImpuesto() + "\nTotal: " + calcularTotal(todoIncluido) + "\n";

    }

}
