package com.javier.clases;

public class Ahorro extends Cuenta {
 
  public double interesIngresos;
  public double penalizacionRetirada;
public Ahorro() {
	
}


public Ahorro(String dni, String nombre, String numero, int edad, double saldo,double interesIngresos,double penalizacionRetirada) {
	super(dni, nombre, numero, edad, saldo);
	this.interesIngresos=interesIngresos;
    this.penalizacionRetirada=penalizacionRetirada; 
}
public double getInteresIngresos() {
	return interesIngresos;
}
public void setInteresIngresos(double interesIngresos) {
	this.interesIngresos = interesIngresos;
}
public double getPenalizacionRetirada() {
	return penalizacionRetirada;
}
public void setPenalizacionRetirada(double penalizacionRetirada) {
	this.penalizacionRetirada = penalizacionRetirada;
}

public double retirarFondos(double cantidad){
	saldo-=cantidad*(interesIngresos/100)-cantidad;
	return saldo;
}
public double ingresarForndos(double cantidad) {
	saldo+=cantidad*(interesIngresos/100)+cantidad;
	return saldo;
}

public String toString(){
	String res="Cuenta de ahorro\n";
	res+=super.toString();
	return res;
	
}




}
