package com.javier.clases;

public abstract class Cuenta {
	protected String dni,nombre,numero;	
    protected int edad;
    protected double saldo;
	public Cuenta() {
		
	}
	public Cuenta(String dni, String nombre, String numero, int edad,
			double saldo) {
		this.dni = dni;
		this.nombre = nombre;
		this.numero = numero;
		this.edad = edad;
		this.saldo = saldo;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
    
	public abstract double retirarFondos(double cantidad) throws Exception;
	public abstract double ingresarForndos(double cantidad);
	public String toString(){
		return "Cliente: "+nombre+"\ncuenta:"+numero+"\nsaldo"+saldo;
	}
    
}
