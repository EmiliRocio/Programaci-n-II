package miss_you;
import java.util.*;
public class Linea {
	 private Punto p1;
	    private Punto p2;

	    public Linea(Punto p1, Punto p2) {
	        this.p1 = p1;
	        this.p2 = p2;
	    }

	    @Override
	    public String toString() {
	        return "Línea desde " + p1 + " hasta " + p2;
	    }

	    public void dibujalinea() {
	        System.out.println("Dibujando línea desde " + p1 + " hasta " + p2);
	    }

}
