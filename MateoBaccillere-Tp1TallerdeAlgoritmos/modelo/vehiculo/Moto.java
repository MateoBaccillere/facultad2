package modelo.vehiculo;

public class Moto extends Vehiculo {

    //Atributos
    public static final String NAFTA = "nafta";
	public static final String ELECTRICO = "electrico";

    private String marca;
    private String patente;
    private String tipoCombustible;
    private int cilindrado;
    
    //Constructores
    public Moto() {
    }
    public Moto(String modelo, String color, double precio, float kilometro, boolean usado, String marca,
            String patente, String tipoCombustible, int cilindrado) {
        super(modelo, color, precio, kilometro, usado);
        this.marca = marca;
        this.patente = patente;
        this.tipoCombustible = tipoCombustible;
        this.cilindrado = cilindrado;
    }

    //getters y setters
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
    public String getTipoCombustible() {
        return tipoCombustible;
    }
    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }
    public int getCilindrado() {
        return cilindrado;
    }
    public void setCilindrado(int cilindrado) {
        this.cilindrado = cilindrado;
    }

    //Métodos de la clase abstracta
   /* @Override
    public boolean cargarVehiculo(Vehiculo vehiculo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cargarVehiculo'");
    }
    @Override
    public boolean modificarVehiculo(Vehiculo vehiculo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'modificarVehiculo'");
    }
    @Override
    public void eliminarVehiculo(Vehiculo vehiculo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminarVehiculo'");
    }*/
    @Override
    public String toString() {
        return "Moto [marca=" + marca + ", patente=" + patente + ", tipoCombustible=" + tipoCombustible
                + ", cilindrado=" + cilindrado + ", Modelo=" + getModelo() + ", Color=" + getColor()
                + ", Precio=" + getPrecio() + ", Kilometro=" + getKilometro() + ", Usado=" + isUsado()
                + "]";
    }


    
    

    



}