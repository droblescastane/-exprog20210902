package fp.daw.exprog20210902;
import java.util.*;
public class AutomovilMain {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("¿Que tipo de motor quieres?(gasolina,diesel,hibrido o electrico)");
		String motor = teclado.next();
		
		if (motor.equalsIgnoreCase("gasolina")||motor.equalsIgnoreCase("diesel")||motor.equalsIgnoreCase("hibrido")||motor.equalsIgnoreCase("electrico")) {
			
			Automovil [] coches = new Automovil [5];
			
			coches[0] = new Automovil("Volkswagen", "Passat", "DNX123", 2006, motor, 140);
			coches[1] = new Automovil("Audi", "A3", "DXC456", 2012, motor, 120);
			coches[2] = new Automovil("Citroen", "C4", "ADX123", 2016, motor, 160);
			coches[3] = new Automovil("BMW", "520", "ASX741", 2006, motor, 100);
			coches[4] = new Automovil("Ford", "focus", "OIU987", 2001, motor, 180);

		
		System.out.println(Arrays.toString(coches));
		
		Arrays.sort(coches);
		
		System.out.println("\n Ordenado: \n");
		
		System.out.println(Arrays.toString(coches));
			
		}
		else {
			System.out.println("No haz elegido un tipo de motor valido. Vuelve a intentarlo mas tarde.");
		}

	
	}
	
	

}
