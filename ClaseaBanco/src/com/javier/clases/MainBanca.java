package com.javier.clases;

public class MainBanca {

	public static void main(String args[]){
		Cuenta[] cuentas=new Cuenta[4];
		cuentas[0]=new Corriente("1234", "Pedro", "1234", 23, 500);
		cuentas[1]=new Corriente("5678", "Juan", "1234", 23, 700,500,4);
		cuentas[2]=new Ahorro("9012", "Eva", "1234", 23, 3000,5,7);
		cuentas[3]=new Ahorro("3456", "Maria", "1234", 23, 3000,7,4);
	
		procesar(cuentas);
	}

public static void procesar(Cuenta[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			
			try {
				System.out.println("Al sacar:"+arr[i].retirarFondos(1000));
			} catch (Exception e) {
				//Envio un correo indicando intento erroneo
				//Guardo el el log del usuario
				
				System.out.println(e.getMessage());
			}
			System.out.println(arr[i]);
			
			
		}
		
	}
}
