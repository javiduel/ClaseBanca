package com.javier.clases;

public class Corriente extends Cuenta{

	protected double credito;
	protected double interes;
	public Corriente() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Corriente(String dni, String nombre, String numero, int edad,
			double saldo) {
		super(dni, nombre, numero, edad, saldo);
		credito=0;
		interes=0;
	}
	public Corriente(String dni, String nombre, String numero, int edad,
			double saldo, double credito, double interes) {
		super(dni, nombre, numero, edad, saldo);
		this.credito = credito;
		this.interes = interes;
	}
	
	public double getCredito() {
		return credito;
	}
	public void setCredito(double credito) {
		this.credito = credito;
	}
	public double getInteres() {
		return interes;
	}
	public void setInteres(double interes) {
		this.interes = interes;
	}
	public double retirarFondos(double cantidad) throws Exception {
		if(cantidad<=saldo)
			saldo-=cantidad;
		else{
			if(Math.abs(saldo-cantidad)<=credito){
				saldo-=cantidad;
				saldo=saldo+(saldo*interes/100);
				
			}
			else{
				
				throw 
				new Exception("Saldo insuficiente, tu disponible actual es:"+saldo);
			}
			
			
		}
		return saldo;
	}

	

	public String toString() {
		String res="Cuenta corriente\n";
		res+=super.toString();
		return res;	
	
	}
	public double ingresarForndos(double cantidad) {
		saldo+=cantidad;
		return saldo;
	}


}
