package pilotak.feladat;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FajlKezelo {

	public List<Pilota> FajlBeolvasas(String fajlnev, String elvalaszto) {

		List<Pilota> pilotak = new ArrayList<Pilota>();

		try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fajlnev), "UTF-8"))) {

			br.readLine();
			int rajtSzam;

			while (br.ready()) {
				String[] sor = br.readLine().split(elvalaszto);

				if (sor.length == 4) {
					rajtSzam = Integer.parseInt(sor[3]);
				} else {
					rajtSzam = 0;
				}

				Pilota pilota = new Pilota(sor[0], LocalDate.parse((sor[1].replace(".", "-"))), sor[2], rajtSzam);
				pilotak.add(pilota);
			}

		} catch (Exception e) {

			System.err.println("Hiba lépett fel az adatok beolvasásakor!");
		}

		return pilotak;
	}

}
