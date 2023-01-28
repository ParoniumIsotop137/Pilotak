package pilotak.feladat;

import java.util.ArrayList;
import java.util.List;

public class PilotakFoProgram {

	public static void main(String[] args) {

		List<Pilota> pilotak = new ArrayList<Pilota>();
		FajlKezelo fajl = new FajlKezelo();
		Feladatok feladat = new Feladatok();
		pilotak = fajl.FajlBeolvasas("F:\\Kurs\\Feladatok\\Pilotak\\pilotak.csv", ";");

		// pilotak.stream().forEach(System.out::println);

		System.out.println("3. feladat: " + String.valueOf(pilotak.size()));
		System.out.println("\n4. feladat: " + pilotak.get((pilotak.size() - 1)).getNev());
		System.out.println("\n5. feladat:\n");
		feladat.KeresettPilotak(pilotak);
		feladat.LegkissebbRajtSzam(pilotak);
		feladat.IsmetlodoRajtSzamok(pilotak);
	}

}
