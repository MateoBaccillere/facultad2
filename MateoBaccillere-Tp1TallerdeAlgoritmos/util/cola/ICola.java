package util.cola;

import util.nodo.NodoCola;

public interface ICola {
	
	public void insertarElementoEnCola(String dato);
	
	public NodoCola eliminarElementoDeCola();
	
	public void listarElementosDeCola();
}
