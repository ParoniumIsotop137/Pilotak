package pilotak.feladat;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Feladatok {

	public void KeresettPilotak(List<Pilota> pilotak) {

		for (Pilota pilota : pilotak) {
			if (pilota.getSzuletesiDatum().isBefore((LocalDate.parse("1901-01-01")))) {
				System.out.println(
						pilota.getNev() + "(" + String.valueOf(pilota.getSzuletesiDatum()).replace("-", ".") + ".)");
			}
		}

	}

	public void LegkissebbRajtSzam(List<Pilota> pilotak) {

		int min = 0;

		for (int i = 0; i < pilotak.size(); i++) {
			if (pilotak.get(i).getRajtSzam() != 0) {
				if (pilotak.get(i).getRajtSzam() < pilotak.get(min).getRajtSzam()) {
					min = i;
				}
			}
		}
		System.out.println("\n6. feladat: " + pilotak.get(min).getNemzetiseg());

	}

	public void IsmetlodoRajtSzamok(List<Pilota> pilotak) {

		Map<Integer, Integer> rajtSzamok = new HashMap<Integer, Integer>();

		for (Pilota pilota : pilotak) {
			rajtSzamok.put(pilota.getRajtSzam(), 0);
		}

		for (Pilota pilota : pilotak) {
			for (Map.Entry<Integer, Integer> item : rajtSzamok.entrySet()) {

				if (pilota.getRajtSzam() != 0) {
					if (pilota.getRajtSzam() == item.getKey()) {
						item.setValue((item.getValue() + 1));
					}
				}
			}
		}

		StringBuilder szoveg = new StringBuilder();

		rajtSzamok.entrySet().stream().filter(x -> x.getValue() > 1).forEach(x -> szoveg.append(x.getKey() + ", "));

		System.out.println("\n7. feladat: " + szoveg.toString());
	}

}
