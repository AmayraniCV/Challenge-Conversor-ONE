/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.conversor.modelo;

import java.text.DecimalFormat;

/**
 *
 * @author corde
 */
public class Conversiones {
    
    double tipoDeCambio;
    double resultado;
    
    DecimalFormat df = new DecimalFormat("#.00");
    
    // DIVISAS
    
    public String pesoDolar(double valor) {
	this.tipoDeCambio = 17.06;
	resultado = valor / this.tipoDeCambio;
	return df.format(resultado);	
    }
    
    public String dolarPeso(double valor) {
	this.tipoDeCambio = 17.06;
	resultado = valor * this.tipoDeCambio;
	return df.format(resultado);	
    }
    
    public String pesoEuro(double valor) {
	this.tipoDeCambio = 18.55;
	resultado = valor / this.tipoDeCambio;
	return df.format(resultado);	
    }
    
    public String euroPeso(double valor) {
	this.tipoDeCambio = 18.55;
	resultado = valor * this.tipoDeCambio;
	return df.format(resultado);	
    }
    
    public String pesoLibra(double valor) {
	this.tipoDeCambio = 21.72;
	resultado = valor / this.tipoDeCambio;
	return df.format(resultado);	
    }
    
    public String libraPeso(double valor) {
	this.tipoDeCambio = 21.72;
	resultado = valor * this.tipoDeCambio;
	return df.format(resultado);	
    }
    
    public String pesoYen(double valor) {
	this.tipoDeCambio = 0.12;
	resultado = valor / this.tipoDeCambio;
	return df.format(resultado);	
    }
    
    public String yenPeso(double valor) {
	this.tipoDeCambio = 0.12;
	resultado = valor * this.tipoDeCambio;
	return df.format(resultado);	
    }
    
    public String pesoWon(double valor) {
	this.tipoDeCambio = 0.013;
	resultado = valor / this.tipoDeCambio;
	return df.format(resultado);	
    }
    
    public String wonPeso(double valor) {
	this.tipoDeCambio = 0.013;
	resultado = valor * this.tipoDeCambio;
	return df.format(resultado);	
    }
    
    //TEMPERATURAS
    
    public String celsiusFahrenheit(double cantidad) {
	resultado = (cantidad * 1.8) + 32;
	return df.format(resultado);	
    }
    public String celsiusKelvin(double cantidad) {
	resultado = cantidad + 273.15;
	return df.format(resultado);	
    }
    public String fahrenheitCelsius(double cantidad) {
	resultado = (cantidad - 32) / 1.8;
	return df.format(resultado);	
    }
    public String fahrenheitKelvin(double cantidad) {
	resultado = (cantidad + 459.67) * 5/9;
	return df.format(resultado);	
    }
    public String kelvinCelsius(double cantidad) {
	resultado = cantidad - 273.15;
	return df.format(resultado);	
    }
    public String kelvinFahrenheit(double cantidad) {
	resultado = (cantidad - 273.15) * 1.8 + 32;
	return df.format(resultado);	
    }
    
}
