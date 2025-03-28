package modelo.vehiculo.abm;

import modelo.vehiculo.Auto;
import modelo.vehiculo.Moto;
import modelo.vehiculo.Vehiculo;
import repositorio.RepositorioDatos;
import java.util.Scanner;

public class ABMAutoImpl implements IAbmVehiculo {
	Scanner scanner = new Scanner (System.in);
	@Override
	public boolean cargarVehiculoImpl(Vehiculo vehiculo) {

		if (RepositorioDatos.indice < RepositorioDatos.TAMANIO_ARREGLO) {
			if (vehiculo instanceof Auto) {
				Auto auto = (Auto) vehiculo;
				if (validarAuto(auto)) {
					if (existeAuto(auto) == -1) {
						RepositorioDatos.vehiculos[RepositorioDatos.indice] = vehiculo;
						RepositorioDatos.indice++;
						return true;
					} else {
						System.out.println("El auto ingresado ya existe");
					}
				} else {
					System.out.println("Faltan cargar datos");
				}
			} else {
				System.out.println("El vehiculo no es un auto");
			}
		} else {
			System.out.println("Se supero la capacidad del arreglo de vehiculos");
		}
		return false;
	}

	@Override
	public boolean modificarVehiculoImpl(Vehiculo vehiculo) {

		Auto auto = (Auto) vehiculo;
		if (validarAuto(auto)) {
			int i = existeAuto(auto);
			if (i != -1) {
				RepositorioDatos.vehiculos[i] = vehiculo;
				return true;
			} else
				System.out.println("El auto ingresado no existe");
		} else
			System.out.println("Faltan cargar datos");

		return false;
	}

	@Override
	public void eliminarVehiculoImpl(Vehiculo vehiculo) {
		Auto auto = (Auto) vehiculo;
		int i = existeAuto(auto);
		if (i != -1) {
			RepositorioDatos.vehiculos[i] = null;
		} else {
			System.out.println("No se encontro el auto que quiere eliminar");
		}
	}

	private boolean validarAuto(Auto auto) {
		if (auto == null)
			return false;
		else {
			if (auto.getMarca().equals(""))
				return false;
			if (auto.getModelo().equals(""))
				return false;
			if (auto.getTipoCombustible().equals(""))
				return false;
			if (auto.getCantPuerta() == 0)
				return false;
		}
		return true;
	}

	public int existeAuto(Auto auto) {
		for (int i = 0; i < RepositorioDatos.vehiculos.length; i++) {
			if (RepositorioDatos.vehiculos[i] instanceof Moto) {
				Auto a = (Auto) RepositorioDatos.vehiculos[i];
				if (a != null && auto.getPatente().equals(a.getPatente()))
					return i;
			}
		}
		return -1;
	}
	public Auto buscarAutoPorPatente(String patente) {
		for (Vehiculo vehiculo : RepositorioDatos.vehiculos) {
			if (vehiculo instanceof Auto && vehiculo.getPatente().equals(patente)) {
				return (Auto) vehiculo;
			}
		}
		return null;
	}
	public void crearAuto(){
		System.out.println("Indica el modelo del auto: ");
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
		System.out.println("Cantidad de puertas: ");
		int cantPuertas = scanner.nextInt();
		System.out.println("Tipo de combustible: ");
		String tipoCombustible = scanner.next();
		System.out.println("Marca: ");
		String marca = scanner.next();
		System.out.println("Patente: ");
		String patente = scanner.next();

		Auto auto = new Auto(modelo,color,precio,kilometro,usado,cantPuertas,tipoCombustible,marca,patente);
		ABMAutoImpl abmAutoImpl=new ABMAutoImpl();
		abmAutoImpl.cargarVehiculoImpl(auto);
	}

	@Override
	public void mostrarVehiculoImpl() {
		for (int i = 0; i < RepositorioDatos.vehiculos.length; i++) {
			if (RepositorioDatos.vehiculos[i] instanceof Auto) {
				Auto auto = (Auto) RepositorioDatos.vehiculos[i];
				if (auto != null) {
					System.out.println(auto);

				}
			}
		}
	}
}
