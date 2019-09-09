package ejercicios.logica.secuencial;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		List<Float> nums  = new ArrayList<>();
		guardarDatos(nums);
		mostrarResultados(calcularSueldo(nums));
	}
	
	private static List<Float> guardarDatos(List<Float> nums) {
		Float aux1 = 0.0F;
		Scanner lector = new Scanner(System.in);
		try {
			escribir("	-- Calculo Sueldo --");
			escribir("Ingrese el tiempo trabajado");
			aux1 = lector.nextFloat();
		}catch(InputMismatchException error) {
			escribir("SOLO PUEDES INGRESAR NUMEROS");
			lector.close();
		}
		if(aux1 != null) {
			nums.add(aux1);
		}
		return nums;
	}

	private static float calcularSueldo(List<Float> nums) {
		return nums.get(0)*10;
	}
	
	private static void mostrarResultados(float sueldo) {
		escribir("Sueldo:"+ sueldo);
	}
	
	private static void escribir(String texto) {
		System.out.println(texto);
	}
	
}
