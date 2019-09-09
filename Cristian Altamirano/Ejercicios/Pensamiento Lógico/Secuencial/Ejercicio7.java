package ejercicios.logica.secuencial;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		List<Float> nums  = new ArrayList<>();
		guardarDatos(nums);
		mostrarResultados(suma(nums), producto(nums), resta(nums));
	}
	
	private static List<Float> guardarDatos(List<Float> nums) {
		Float aux1 = 0.0F, aux2 = 0.0F;
		Scanner lector = new Scanner(System.in);
		try {
			escribir("	-- Calculo Suma, Producto, Resta de 2 Numeros --");
			escribir("Ingrese Dos Numeros");
			aux1 = lector.nextFloat();
			aux2 = lector.nextFloat();
		}catch(InputMismatchException error) {
			escribir("SOLO PUEDES INGRESAR NUMEROS");
			lector.close();
		}
		if(aux1 != null && aux2 != null) {
			nums.add(aux1);
			nums.add(aux2);
		}
		return nums;
	}
	
	private static float suma(List<Float> nums) {
		return nums.get(0)+nums.get(1);
	}
	
	private static float producto(List<Float> nums) {
		return nums.get(0)*nums.get(1);
	}
	
	private static float resta(List<Float> nums) {
		return nums.get(0)-nums.get(1);
	}
	
	private static void mostrarResultados(float suma, float producto, float resta) {
		escribir("Suma: "+ suma + "\nProducto: "+ producto + "\nResta del primero con el segundo: "+ resta);
	}
	
	private static void escribir(String texto) {
		System.out.println(texto);
	}
}
