package tpcomposicion;

import java.util.Random;

public class Tambor {
	private int caras;
	private int valorActual;
	
	public Tambor(int caras){
		this.caras = caras;
	}
	
	public void girar(){
		Random r = new Random();
		this.valorActual = r.nextInt(this.caras-1) + 1;
	}
	
	public int getValorActual(){
		return this.valorActual;
	}
}
