package fp.daw.examen;

public class Ejercicio3 {

	/*
	 * 1 punto
	 * 
	 * En codingbat.com se propone el problema siguiente (Array-3/fix45):
	 * 
	 * Retornar un array de números enteros que contenga exactamente los mismos
	 * números que un array dado, pero reorganizados de forma que cada a cada 4
	 * le sigua un 5. Los 4 conservarán su posición original, condición que no
	 * han de cumplir el resto de números.
	 * 
	 * El array original cumplirá las condiciones siguientes: 
	 * 	- Contiene la misma cantidad de 4 que de 5.
	 *  - Cada 4 irá seguido de un número distinto de 4.
	 *  - Los 5 pueden aparecer en cualquier posición.
	 * 
	 * A continuación se propone una solución a este problema en la que se utiliza
	 * un bucle 'for' interno para buscar un valor 5 cada vez que se encuentra un
	 * valor 4 que no está seguido de un valor 5. La búsqueda solo está interesada
	 * en los valores 5 que no estén precedidos de un valor 4 y en buscar a partir
	 * de la posición en la que acabo la búsqueda anterior (la primera búsqueda
	 * comenzará en la posición 0). Una vez encontrado el valor 5 adecuado, se procede
	 * a su intercambio con la posición que le sigue al valor 4 que no está seguido 
	 * del valor 5.
	 * 
	 * Se pide sustituir el bucle 'for' interno por un bucle 'while' en el que la condición de
	 * bucle no utilice el operador lógico ! (no confundir con el operador de
	 * comparación !=)
	 */
	
	public static int [] fix45(int [] nums) {
		int j = 0;
		for (int i=0; i<nums.length-1; i++)
			if (nums[i] == 4 && nums[i+1] != 5) {
				for (; !(nums[j] == 5 && (j == 0 || nums[j - 1] != 4)); j++);
				nums[j] = nums[i + 1];
				nums[i + 1] = 5;
			}
		return nums;
	}
	
	/*
	 * 0,25 puntos
	 * 
	 * Escribe en el método main las sentencias necesarias para poner a prueba
	 * el método 'fix45' mostrando por pantalla el resultado de su ejecución. 
	 */
	
	public static void main(String[] args) {
			array nums;
			int j = 0;
			for (int i=0; i<nums.length-1; i++)
				if (nums[i] == 4 && nums[i+1] != 5) {
					for (; !(nums[j] == 5 && (j == 0 || nums[j - 1] != 4)); j++);
					nums[j] = nums[i + 1];
					nums[i + 1] = 5;
				}
			return nums;
			System.out.println("nums=" + nums);
		}

	}


