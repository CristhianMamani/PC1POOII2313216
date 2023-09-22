package puntos2;

import java.util.Scanner;

public class puntos2 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Ingrese la cantidad de puntos que su equipo ha obtenido en cada juego de esta temporada.");
	        System.out.println("Ingrese -1 cuando haya terminado.");
	        
	        int totalPuntos = 0;
	        boolean terminado = false;
	        
	        while (!terminado) {
	            System.out.print("Introduce puntos del juego o -1 para finalizar: ");
	            
	            if (scanner.hasNextInt()) {
	                int puntosJuego = scanner.nextInt();
	                
	                if (puntosJuego == -1) {
	                    terminado = true;
	                } else {
	                    totalPuntos += puntosJuego;
	                }
	            } else {
	                System.out.println("Entrada no válida. Introduce un número entero o -1 para finalizar.");
	                scanner.next(); 
	            }
	        }
	        
	        System.out.println("El total de puntos obtenidos por el equipo es: " + totalPuntos);
	        
	        scanner.close();
	    }
	}

	


