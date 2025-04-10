package EjercicioC;

import java.util.Iterator;
import java.util.List;

public class Biblioteca {
	
	public static int cantidadnum (List<Integer> a) {
		System.out.println("La cantidad de nmeros introducidos es de: "+a.size());
		return a.size();
	}
	
	public static int medianum (List<Integer> a) throws Exception{
		int suma =0;
		int cant =0;
		boolean ai = false;
		Iterator<Integer> i = a.iterator();
		while ( i.hasNext()) {
			Integer num = i.next();
			if(num%2!=0) {
				suma+=num;
				cant++;
				ai=true;
			}
		}
		if(ai) {
			System.out.println("La media de los numeros introducidos es de: "+(suma/cant));		
			return suma/cant;
		}else {
			throw new Exception("No hay numeros impares");
		}
	}
	
	public static int matorPar (List<Integer> a) throws Exception {
		int cant =0;
		boolean ai = false;
		Iterator<Integer> i = a.iterator();
		while ( i.hasNext()) {
			Integer num = i.next();
			if(num%2==0) {
				if(num>cant || cant ==0) {
					cant=num;
					ai=true;
				}
			}
		}
		if(ai) {
			System.out.println("El mayor de los numeros pares es : "+cant);
			return cant;
		}else {
			throw new Exception("No hay numeros pares");
		}
	}
}
