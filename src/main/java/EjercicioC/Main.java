package EjercicioC;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main (String [] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int a;
		List<Integer> listanum = new ArrayList<Integer>();
		do {
			System.out.println("Dame un numero");
			 a  =  sc.nextInt();
			 if(a>0) {
				 listanum.add(a);
			 }
		} while (a > 0);
		Biblioteca.cantidadnum(listanum);
		Biblioteca.medianum(listanum);
		Biblioteca.matorPar(listanum);
	}
}