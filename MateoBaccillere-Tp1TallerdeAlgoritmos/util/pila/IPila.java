package util.pila;

import util.nodo.NodoPila;

public interface IPila {

	public void insertarElementoPila(NodoPila nodoPila);
	
	public NodoPila eliminarElementoDePila();
	
	public void listarElementos();
}
