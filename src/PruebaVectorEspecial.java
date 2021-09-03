import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


/*
 * Ejemplo TDA 1: Funcionalidad ESPECIAL de VECTORES (ARRAYS)

	Operaciones: 
	
		[HECHO] 1) Crear
		[HECHO] 2) Llenar
		[HECHO] 3) Obtener posición inicio
		[HECHO] 4) Obtener posición fin
		[HECHO] 5) Obtener cantidad elementos	
		[HECHO] 6) Mostrar todo los elementos
		[HECHO] 7) Mostrar elemento del inicio
		[HECHO] 8) Mostrar elemento del fin
		[HECHO] 9) Aumentar tamaño del arreglo
		[HECHO] 10) Disminuir tamaño del arreglo	
		[HECHO] 11) Insertar elemento en posición especifica
		[HECHO] 12) Eliminar elemento de posición especifica
		13) Invertir el vector

*/

class VectorEspecial{
	Scanner entrada = new Scanner(System.in);
	
	//1) Crear
	private int vector[];
	
	public VectorEspecial(int tam) {
		vector = new int[tam];
	}
	
	//2)Llenar
	public void llenarVectorAutomatizado() {
		for (int i=0; i< vector.length; i++) {
			vector[i] = new Random().nextInt(99);
		}
	}
	
	public void llenarVectorTeclado() {}
	
	//6) Mostrar Todos los Elementos
	public void mostrarVector() {
		for(int i=0; i<vector.length; i++) {
			System.out.print(vector[i] + "  ");
		}
		System.out.println();
	}
	
	//3) Obtener posición inicio
	public void obtenerPosicionInicio() {
		System.out.println("0");
	}
	
	//4) Obtener posición fin
	public void obtenerPosicionFin() {
		System.out.println(vector.length-1);
	}
	
	//5) Obtener cantidad elementos
	public void obtenerCantidadElementos() {
		System.out.println(vector.length);
	}
	
	//7) Mostrar elemento del inicio
	public void mostrarElementoInicio() {
		System.out.println(vector[0]);
	}
	
	//8) Mostrar elemento del fin
	public void mostrarElementoFin() {
		System.out.println(vector[vector.length-1]);
	}

	//9) Aumentar tamaño del arreglo
	public void aumentarTamanoArreglo() {
		System.out.println("¿Cuanto quiere aumentar?");
		int aumento = entrada.nextInt();
		
		int vecTem[];
		vecTem = new int [(vector.length+aumento)];
		
		for(int i=0; i<vector.length; i++) {
			vecTem[i] = vector[i];
		}
		
		vector = new int [vecTem.length];
		
		for(int i=0; i<vecTem.length; i++) {
			vector[i] = vecTem[i];
		}
	}
	
	//10) Disminuir tamaño del arreglo
	public void disminuirTamanoArreglo() {
		System.out.println("¿Cuanto quiere disminuir?");
		int decremento = entrada.nextInt();
		
		int vecTem[];
		vecTem = new int [(vector.length-decremento)];
		
		for(int i=0; i<vecTem.length; i++) {
			vecTem[i] = vector[i];
		}
		
		vector = new int [vecTem.length];
		
		for(int i=0; i<vecTem.length; i++) {
			vector[i] = vecTem[i];
		}
	}
	
	//11) Insertar elemento en posición especifica
	public void insertarElementoEspecifico() {
		System.out.println("¿En que posicion desea insertar?");
		int elec = entrada.nextInt();
		System.out.println("Ingrese el numero por el que se va a cambiar");
		vector[elec-1] = entrada.nextInt();
	}
	
	//12) Eliminar elemento de posición especifica
	public void eliminarElementoEspecifico() {
		System.out.println("¿En que posicion desea eliminar?");
		int elec = entrada.nextInt();
		vector[elec-1] = 0;
	}
	
	//13) Invertir el vector
	public void invertirArreglo() {
		int vecTem[];
		vecTem = new int[vector.length];
		
		for(int i=0; i<vector.length; i++) {
			vecTem[i] = vector[((vecTem.length-1)-i)];
		}
		
		vector = new int [vecTem.length];
		
		for(int i=0; i<vecTem.length; i++) {
			vector[i] = vecTem[i];
		}
	}
}

public class PruebaVectorEspecial {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		VectorEspecial ve1 = new VectorEspecial(10);
		ve1.llenarVectorAutomatizado();
		
		System.out.println("OPCIONES");
		System.out.println("1.Obtener posición inicio\r\n"
				+ "2.Obtener posición fin\r\n"
				+ "3.Obtener cantidad elementos \r\n"
				+ "4.Mostrar todo los elementos\r\n"
				+ "5.Mostrar elemento del inicio\r\n"
				+ "6.Mostrar elemento del fin\r\n"
				+ "7.Aumentar tamaño del arreglo\r\n"
				+ "8.Disminuir tamaño del arreglo \r\n"
				+ "9.Insertar elemento en posición especifica\r\n"
				+ "10.Eliminar elemento de posición especifica\r\n"
				+ "11.Invertir el vector\r\n"
				+ "12.Salir");
		
		int s=0;
		while (s == 0) {
			System.out.println("---------------------------------------");
			System.out.println("Ingrese la Opcion a Elegir:");
			String op = entrada.next();
			switch(op) {
				case "1": ve1.obtenerPosicionInicio();
					break;
				case "2": ve1.obtenerPosicionFin();
					break;
				case "3": ve1.obtenerCantidadElementos();
					break;
				case "4": ve1.mostrarVector();
					break;
				case "5": ve1.mostrarElementoInicio();
					break;
				case "6": ve1.mostrarElementoFin();
					break;
				case "7": ve1.aumentarTamanoArreglo();
					break;
				case "8": ve1.disminuirTamanoArreglo();
					break;
				case "9": ve1.insertarElementoEspecifico();
					break;
				case "10": ve1.eliminarElementoEspecifico();
					break;
				case "11": ve1.invertirArreglo();
					break;
				case "12": s=1;
					System.out.println("BYE BYE :3");
					break;
				default:
					System.out.println("Esa no es una opcion ingrese una valida");
				break;
			}
		}
		
	}
}
