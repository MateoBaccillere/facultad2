package util.pila.impl;

import util.nodo.NodoPila;
import util.pila.IPila;

public class PilaImpl implements IPila {
	
	public NodoPila tope;
	
	
	public PilaImpl() {
		this.tope=null;
	}
	
	@Override
	public void insertarElementoPila(NodoPila nodoPila) {
		
		if(esVacia())
			this.tope=nodoPila;
		else {
			nodoPila.ant=this.tope;
			this.tope=nodoPila;
		}
	}

	@Override
	public NodoPila eliminarElementoDePila() {
		NodoPila ult=this.tope;
		if(esVacia())
			System.out.println("La pila esta vacia");
		else
			this.tope=this.tope.ant;
		return ult;
	}
	
	public void listarElementos() {
		NodoPila aux=this.tope;
		while(aux!=null) {
			System.out.println(aux.dato);
			aux=aux.ant;
		}
		
	}
	
	private boolean esVacia() {
		//if(this.tope!=null)
		//	return true;
		
		//return (this.tope!=null)?true:false;
		return this.tope==null;
	}
}
