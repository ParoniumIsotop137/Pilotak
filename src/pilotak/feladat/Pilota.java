package pilotak.feladat;

import java.time.LocalDate;

public class Pilota {

	private String nev;
	private LocalDate szuletesiDatum;
	private String nemzetiseg;
	private int rajtSzam;

	public Pilota(String nev, LocalDate szuletesiDatum, String nemzetiseg, int rajtSzam) {
		this.nev = nev;
		this.szuletesiDatum = szuletesiDatum;
		this.nemzetiseg = nemzetiseg;
		this.rajtSzam = rajtSzam;
	}

	public String getNev() {
		return nev;
	}

	public LocalDate getSzuletesiDatum() {
		return szuletesiDatum;
	}

	public String getNemzetiseg() {
		return nemzetiseg;
	}

	public int getRajtSzam() {
		return rajtSzam;
	}

	@Override
	public String toString() {
		return "Pilóta neve: " + this.nev + ", szuletési dátuma: "
				+ (String.valueOf(this.szuletesiDatum).replace("-", ".")) + ", nemzetisége: " + this.nemzetiseg
				+ ", rajtszáma (0 ha nem volt): " + this.rajtSzam;
	}

}
