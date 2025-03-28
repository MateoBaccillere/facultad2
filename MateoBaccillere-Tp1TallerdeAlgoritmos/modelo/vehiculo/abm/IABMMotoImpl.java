package modelo.vehiculo.abm;

import modelo.vehiculo.Moto;
import modelo.vehiculo.Vehiculo;
import repositorio.RepositorioDatos;

import java.util.Scanner;

import static repositorio.RepositorioDatos.vehiculos;

public class IABMMotoImpl implements IAbmVehiculo {

	Scanner scanner = new Scanner (System.in);
	//El Override se utiliza cuando hay una sobrecarga de métodos
	@Override
	public boolean cargarVehiculoImpl(Vehiculo vehiculo) {
		if (RepositorioDatos.indice < RepositorioDatos.TAMANIO_ARREGLO) {
			if (vehiculo instanceof Moto) {
				Moto moto = (Moto) vehiculo;
				if (validarMoto(moto)) {
					if (existeMoto(moto) == -1) {
						vehiculos[RepositorioDatos.indice] = vehiculo;
						RepositorioDatos.indice++;
						return true;
					} else {
						System.out.println("La moto ingresada ya esta cargada");
					}
				} else {
					System.out.println("Faltan cargar datos en el arreglo");
				}
			} else {
				System.out.println("El vehiculo no es una moto");
			}
		} else {
			System.out.println("Se supero la capacidad del arreglo de vehiculos");
		}
		return false;
	}

	@Override
	public boolean modificarVehiculoImpl(Vehiculo vehiculo) {
		Moto moto = (Moto) vehiculo;
		if (validarMoto(moto)) {
			int i = existeMoto(moto);
			if (i != -1) {
				vehiculos[i] = vehiculo;
				return true;
			} else
				System.out.println("La moto ingresada no existe en el arreglo de vehiculos");
		} else
			System.out.println("Faltan cargar datos al arreglo");

		return false;
	}

	@Override
	public void eliminarVehiculoImpl(Vehiculo vehiculo) {
		Moto moto = (Moto) vehiculo;
		int i = existeMoto(moto);
		if (i != -1) {
			vehiculos[i] = null;
		} else {
			System.out.println("No se encontró la moto que quiere eliminar");
		}
	}

	private boolean validarMoto(Moto moto) {
		if (moto == null)
			return false;
		else {
			if (moto.getMarca().equals(""))
				return false;
			if (moto.getModelo().equals(""))
				return false;
			if (moto.getTipoCombustible().equals(""))
				return false;
			if (moto.getCilindrado() > 3000)
				return false;
		}
		return true;
	}

	public int existeMoto(Moto moto) {
		for (int i = 0; i < vehiculos.length; i++) {
			if (vehiculos[i] instanceof Moto) {
				Moto a = (Moto) vehiculos[i];
				if (a != null && moto.getPatente().equals(a.getPatente()))
					return i;
			}
		}
		return -1;
	}
	public Moto existeMotoPorPatente(String patente) {
		for (Vehiculo vehiculo : RepositorioDatos.vehiculos) {
			if (vehiculo instanceof Moto && vehiculo.getPatente().equals(patente)) {
				return (Moto) vehiculo;
			}
		}
		return null;
	}
	public void crearMoto(){
		System.out.println("Indica el modelo de la moto: ");
		String modelo = scanner.next();
		System.out.println("Indica el color: ");
		String color = scanner.next();
		System.out.println("Indica el precio: ");
		Double precio = scanner.nextDouble();
		System.out.println("Indica el kilometraje: ");
		float kilometro = scanner.nextFloat();
		Boolean usado;
		if(0 < kilometro){
			usado = true;
		}else {
			usado = false;
		}
		System.out.println("Tipo de combustible: ");
		String tipoCombustible = scanner.next();
		System.out.println("Cilindrado: ");
		int cilindrado = scanner.nextInt();
		System.out.println("Marca: ");
		String marca = scanner.next();
		System.out.println("Patente: ");
		String patente = scanner.next();

		Moto moto = new Moto(modelo,color,precio,kilometro,usado,marca,patente,tipoCombustible,cilindrado);
		IABMMotoImpl abmMotoImpl=new IABMMotoImpl();
		abmMotoImpl.cargarVehiculoImpl(moto);
	}

	@Override
	public void mostrarVehiculoImpl() {
		for (int i = 0; i < vehiculos.length; i++) {
			if (vehiculos[i] instanceof Moto) {
				Moto moto = (Moto) vehiculos[i];
				if (moto != null) {
					System.out.println(moto);

				}
			}
		}
	}
}
