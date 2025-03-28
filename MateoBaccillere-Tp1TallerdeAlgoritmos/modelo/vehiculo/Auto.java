package modelo.vehiculo;
import modelo.vehiculo.abm.ABMAutoImpl;

public class Auto extends Vehiculo {



	//Atributos
	public static final String NAFTA = "nafta";
	public static final String GASOIL = "gasoil";
	public static final String ELECTRICO = "electrico";

	private int cantPuerta;
	private String tipoCombustible;
	private String marca;
	private String patente;

	//Constructores
	public Auto() {
		super();
	}

	public Auto(String modelo, String color, double precio, float kilometro, boolean usado, int cantPuerta,
			String tipoCombustible, String marca, String patente) {
		super(modelo, color, precio, kilometro, usado);
		this.cantPuerta = cantPuerta;
		this.tipoCombustible = tipoCombustible;
		this.marca = marca;
		this.patente=patente;
	}

	//Getters y Setters

	public int getCantPuerta() {
		return cantPuerta;
	}

	public void setCantPuerta(int cantPuerta) {
		this.cantPuerta = cantPuerta;
	}

	public String getTipoCombustible() {
		return tipoCombustible;
	}

	public void setTipoCombustible(String tipoConbustible) {
		this.tipoCombustible = tipoConbustible;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	@Override
	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}
	
	// En esta seccion se muestra como hacer metodos y funciones en una clase concreta
	public boolean cargarAuto(Auto auto) {
		return false;
	}

	public boolean modificarAuto(Auto auto) {
		return false;
	}

	public void eliminarAuto(Auto auto) {

	}

	
	// En esta seccion se muestra como implementar los metodos y funciones definidos en la clase abstracta
	/*@Override
	public boolean cargarVehiculo(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modificarVehiculo(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void eliminarVehiculo(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		
	}*/

	@Override
	public String toString() {
		return "Auto [cantidad de puertas=" + cantPuerta + ", tipo de combustible=" + tipoCombustible + ", marca=" + marca
				+ ", patente=" + patente + ", Modelo=" + getModelo() + ", Color=" + getColor()
				+ ", Precio=" + getPrecio() + ", Kilometro=" + getKilometro() + ", Usado=" + isUsado()
				+ "]";
	}

	/* En esta seccion mostramos como implemetar los métodos y funciones a traves de una interfaz.
	 * Esta las comentamos para implementarlas en otra clase ABMAutos. 
	@Override
	public boolean cargarVehiculoImpl(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modificarVehiculoImpl(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void eliminarVehiculoImpl(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		
	}
	*/

	
}
