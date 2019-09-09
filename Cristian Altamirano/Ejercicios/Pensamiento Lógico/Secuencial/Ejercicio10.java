package ejercicios.logica.secuencial;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		List<Float> nums  = new ArrayList<>();
		guardarDatos(nums);
		mostrarResultados(calcularSueldo(nums));
	}
	
	private static List<Float> guardarDatos(List<Float> nums) {
		Float valorauto = 0.0F, cantventas = 0.0F;
		Scanner lector = new Scanner(System.in);
		try {
			escribir("	-- Calculo Sueldo Vendedor --");
			escribir("Ingrese Valor Vehiculo y luego la Cantidad Vendida");
			valorauto = lector.nextFloat();
			cantventas = lector.nextFloat();
		}catch(InputMismatchException error) {
			escribir("DATO INVÁLIDO");
			lector.close();
		}
		if(valorauto != null && cantventas != null) {
			nums.add(valorauto);
			nums.add(cantventas);
		}
		return nums;
	}
	
	private static void mostrarResultados(float sueldo) {
		escribir("Sueldo: "+sueldo);
	}
	
	private static float calcularSueldo(List<Float> nums) {
		return 500+((50+nums.get(0)*0.10F)*nums.get(1));
	}
	
	private static void escribir(String texto) {
		System.out.println(texto);
	}

}
