package principal;
import modelo.vehiculo.Auto;
import modelo.vehiculo.Moto;
import modelo.vehiculo.abm.ABMAutoImpl;
import modelo.vehiculo.abm.IABMMotoImpl;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		boolean condition = true;
		while (condition == true) {

			System.out.println("1. Agregar Auto");
			System.out.println("2. Agregar Moto");
			System.out.println("3. Eliminar Vehículo");
			System.out.println("4. Deshacer");
			System.out.println("5. Mostrar Vehículos");
			System.out.println("6. Salir");
			int n = scanner.nextInt();

			switch(n){
				case 1:
					abmAutoImpl.crearAuto();
					break;
				case 2:
					abmMotoImpl.crearMoto();
					break;
				case 3:
					eliminarVehiculo();
					break;
				case 4:

					break;
				case 5:
					abmAutoImpl.mostrarVehiculoImpl();
					abmMotoImpl.mostrarVehiculoImpl();
					break;
				case 6:
					condition = false;
					System.exit(0);
					break;
				default:
					System.out.println("Error! Ingrese un número del 1 al 6");
					break;
			}

		}

		/*Auto auto1= new Auto("2024","rojo",22000D,50000F,true,5,Auto.NAFTA,"FORD","AS457RT");
		Auto auto2= new Auto("2000","negro",12000D,80000F,true,5,Auto.NAFTA,"RENAULT","AW901RT");
		Moto moto1=new Moto("2024","blanco y azul oscuro",100000D,0F,false,"Honda","AR678TY",Moto.NAFTA,1000);
		Moto moto2=new Moto("2022","azul",4000D,50000F,true,"Yamaha","AR656HJ",Moto.NAFTA,300);
		
		IABMMotoImpl abmMotoImpl= new IABMMotoImpl();
		ABMAutoImpl abmAutoImpl=new ABMAutoImpl();

		if(abmAutoImpl.cargarVehiculoImpl(auto1))
			System.out.println("Se cargo con exito");
		else
			System.out.println("No se cargo con exito");


		abmAutoImpl.cargarVehiculoImpl(auto2);
		abmAutoImpl.mostrarVehiculoImpl();

		if(abmMotoImpl.cargarVehiculoImpl(moto1))
			System.out.println("Se cargo con exito");
		else
			System.out.println("No se cargo con exito");

		abmMotoImpl.cargarVehiculoImpl(moto2);
		abmMotoImpl.mostrarVehiculoImpl();
		
		abmMotoImpl.eliminarVehiculoImpl(moto2);
		abmMotoImpl.mostrarVehiculoImpl();*/

		
	}
	static Scanner scanner = new Scanner(System.in);
	static IABMMotoImpl abmMotoImpl= new IABMMotoImpl();
	static ABMAutoImpl abmAutoImpl=new ABMAutoImpl();

	public static void eliminarVehiculo(){
		System.out.println("Ingrese la patente del vehículo para eliminar:");
		String patenteEliminar = scanner.next();
		Auto autoEliminar = abmAutoImpl.buscarAutoPorPatente(patenteEliminar);
		Moto motoEliminar = abmMotoImpl.existeMotoPorPatente(patenteEliminar);
		abmMotoImpl.eliminarVehiculoImpl(motoEliminar);
		abmAutoImpl.eliminarVehiculoImpl(autoEliminar);
		System.out.println("Se eliminó el vehículo correctamente");
	}
}

