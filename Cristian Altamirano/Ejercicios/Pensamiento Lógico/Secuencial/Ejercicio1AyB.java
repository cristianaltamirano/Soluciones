package ejercicios.logica.secuencial;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Ejercicio1AyB {

	public static void main(String[] args){
		List<Float> nums  = new ArrayList<>();
		guardarDatos(nums);
		sumar(nums);
	}


	public static List<Float> guardarDatos(List<Float> nums) {
		Float aux1 = null, aux2 = null;
		Scanner lector = new Scanner(System.in);
		try {
			escribir("	-- Suma de 2 Numeros --	");
			aux1 = lector.nextFloat();
			aux2 = lector.nextFloat();
		}catch(InputMismatchException error) {
			escribir("SOLO PUEDES INGRESAR NUMEROS");
			lector.close();
		}
		if(aux1 != null && aux2 != null) {
			nums.add(aux1);
			nums.add(aux2);
			return nums;
		}else
			nums.add((float) 0);
			nums.add((float) 0);
			return nums;
	}

	private static void sumar(List<Float> nums) {
		Float res = nums.get(0)+nums.get(1);
		escribir("Resultado: "+ res);
	}
	
	private static void escribir(String texto) {
		System.out.println(texto);
	}
}