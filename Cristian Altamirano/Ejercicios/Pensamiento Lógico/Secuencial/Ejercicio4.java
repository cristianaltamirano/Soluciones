package ejercicios.logica.secuencial;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		List<Float> nums  = new ArrayList<>();
		guardarDatos(nums);
		perimetro(nums);
	}

	public static List<Float> guardarDatos(List<Float> nums) {
		Float aux1 = null, aux2 = null, aux3 = null;
		Scanner lector = new Scanner(System.in);
		try {
			escribir("-- Calculo Perimetro de un Triangulo --");
			escribir("Ingrese Los Tres Lados");
			aux1 = lector.nextFloat();
			aux2 = lector.nextFloat();
			aux3 = lector.nextFloat();
		}catch(InputMismatchException error) {
			escribir("SOLO PUEDES INGRESAR NUMEROS");
			lector.close();
		}
		if(aux1 != null && aux2 != null && aux3 != null) {
			nums.add(aux1);
			nums.add(aux2);
			nums.add(aux3);
			return nums;
		}else
			nums.add((float) 0);
			nums.add((float) 0);
			nums.add((float) 0);
			return nums;
	}

	private static void perimetro(List<Float> nums) {
		Float perimetro = nums.get(0)+nums.get(1)+nums.get(2);
		escribir("Perimetro: "+ perimetro);
	}
	
	private static void escribir(String texto) {
		System.out.println(texto);
	}
}
