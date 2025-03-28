package util.cola.impl;

import util.cola.ICola;
import util.nodo.NodoCola;

public class ColaImpl implements ICola{
	private NodoCola pri;
	private NodoCola ult;
	
	public ColaImpl() {
		this.pri=this.ult=null;
	}
	
	@Override
	public void insertarElementoEnCola(String dato) {
		if(esVacia())
			this.pri=this.ult=new NodoCola(dato);
		else {
			NodoCola nuevo=new NodoCola(dato);
			this.ult.sig=nuevo;
			this.ult=nuevo;
			//this.ult=this.ult.sig;
		}
			
	}

	@Override
	public NodoCola eliminarElementoDeCola() {
		NodoCola pri=null;
		if(esVacia())
			System.out.println("La cola esta vacia");
		else {
			pri=this.pri;
			this.pri=this.pri.sig;
			//pri=this.pri=this.pri.sig;
		}
		return pri;
	}

	@Override
	public void listarElementosDeCola() {
		if(!esVacia()) {
			NodoCola aux=this.pri;
			while(aux!=null) {
				System.out.println("El dato es: "+ aux.dato);
				aux=aux.sig;
			}
		}else
			System.out.println("No hay datos en la cola");
		
	}
	
	private boolean esVacia() {
		return this.pri==null && this.ult==null;
	}
}
