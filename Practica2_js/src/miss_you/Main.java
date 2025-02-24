package miss_you;
import java.util.*;
public class Main {
	 public static void main(String[] args) {
	        // Crear puntos con float
	        Punto p1 = new Punto(4f, 5f);
	        Punto p2 = new Punto(4f, 6f);
	        Punto centro = new Punto(3f, 3f);

	        // Crear línea y círculo
	        Linea linea = new Linea(p1, p2);
	        Circulo circulo = new Circulo(centro, 4f);

	        // Mostrar información y dibujar
	        System.out.println(linea.toString());
	        linea.dibujalinea();

	        System.out.println(circulo.toString());
	        circulo.dibujacirculo();
	    }
	 

}
