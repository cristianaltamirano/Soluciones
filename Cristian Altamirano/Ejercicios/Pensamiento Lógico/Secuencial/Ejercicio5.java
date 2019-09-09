package ejercicios.logica.secuencial;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		List<Float> nums  = new ArrayList<>();
		guardarDatos(nums);
		mostrarResultados(superficie(nums), perimetro(nums, hipotenusa(nums)), hipotenusa(nums));
	}
	
	private static List<Float> guardarDatos(List<Float> nums) {
		Float aux1 = 0.0F, aux2 = 0.0F;
		Scanner lector = new Scanner(System.in);
		try {
			escribir("	-- Calculo Perimetro, Superficie, Hipotenusa de un Triangulo Rectangulo --");
			escribir("Ingrese Dos Lados");
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
	
	private static float hipotenusa(List<Float> nums) {
		Float cat1 = nums.get(0);
		Float cat2 = nums.get(1);
		Float hip = (float) Math.sqrt((Math.pow(cat1, 2) + Math.pow(cat2, 2)));
		return hip;
	}
	
	private static float perimetro(List<Float> nums, Float hip) {
		return nums.get(0)+nums.get(1)+hip;
	}
	
	private static float superficie(List<Float> nums) {
		return (nums.get(0)*nums.get(1))/2;
	}
	
	private static void mostrarResultados(float superficie, float perimetro, Float hipotenusa) {
		escribir("Superficie: "+ superficie + "\nPerimetro: "+ perimetro + "\nHipotenusa: "+ hipotenusa);
	}
	
	private static void escribir(String texto) {
		System.out.println(texto);
	}
}