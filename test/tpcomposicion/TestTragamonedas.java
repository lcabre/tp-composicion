package tpcomposicion;
import static org.junit.Assert.*;

import org.junit.Test;

import tpcomposicion.Tambor;

public class TestTragamonedas {
	@Test
	public void queCreeElTragamonedasConSusTambores(){
		Tragamonedas tragamonedas = new Tragamonedas(new Tambor(5),new Tambor(5),new Tambor(5));
		assertTrue(tragamonedas.getTambor1()!=null);
		assertTrue(tragamonedas.getTambor2()!=null);
		assertTrue(tragamonedas.getTambor3()!=null);
	}
	
	@Test
	public void queLosTamboresGirenAleatoriamente(){
		Tragamonedas tragamonedas = new Tragamonedas(new Tambor(5),new Tambor(5),new Tambor(5));
		tragamonedas.rodarTambores();
		assertTrue(tragamonedas.getValorTambor1()>=1 && tragamonedas.getValorTambor1()<=5);
		assertTrue(tragamonedas.getValorTambor2()>=1 && tragamonedas.getValorTambor2()<=5);
		assertTrue(tragamonedas.getValorTambor3()>=1 && tragamonedas.getValorTambor3()<=5);
	}
}
