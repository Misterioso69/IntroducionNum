package EjercicioC;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;


public class BibliotecaTest {
	@Test
	public void cantidadnumTest (){
		List<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		int canti =   Biblioteca.cantidadnum(a);
		Assert.assertEquals(3, canti);
	}
	
	@Test
	public void medianumTest () throws Exception {
		List<Integer>a = new ArrayList<Integer>();
		a.add(1);
		a.add(1);
		a.add(1);
		int media = Biblioteca.medianum(a);
		Assert.assertEquals(1, media);
	}
	@Test
	public void matorPar() throws Exception {
		List<Integer>a = new ArrayList<Integer>();
		a.add(2);
		a.add(6);
		a.add(33);
		int cant = Biblioteca.matorPar(a);
		Assert.assertEquals(6, cant);
	}
}
