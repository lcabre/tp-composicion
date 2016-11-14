package tpcomposicion;

import java.util.Random;

public class Tragamonedas {
	private Tambor tambor1;
	private Tambor tambor2;
	private Tambor tambor3;
	
	public Tragamonedas(Tambor tambor1, Tambor tambor2, Tambor tambor3){
		this.tambor1 = tambor1;
		this.tambor2 = tambor2;
		this.tambor3 = tambor3;
	}
	
	public void rodarTambores(){
		this.tambor1.girar();
		this.tambor2.girar();
		this.tambor3.girar();
	}
	
	public Tambor getTambor1() {
		return tambor1;
	}

	public Tambor getTambor2() {
		return tambor2;
	}

	public Tambor getTambor3() {
		return tambor3;
	}
	
	public int getValorTambor1() {
		return tambor1.getValorActual();
	}

	public int getValorTambor2() {
		return tambor2.getValorActual();
	}

	public int getValorTambor3() {
		return tambor3.getValorActual();
	}
}
