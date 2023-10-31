package cz.oauh.test20221017;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EvidenceSkladu {
    private String nazev;
    private int mnozstvi;
    private double hmostnost;
    private boolean dostupnost;
    private LocalDate uvedeniDoProdeje;
    public static final String soubor = "soubor";
  List<EvidenceSkladu> evidence = new ArrayList<>();
    public EvidenceSkladu(String nazev, int mnozstvi, double hmostnost, boolean dostupnost, LocalDate uvedeniDoProdeje) {
        this.nazev = nazev;
        this.mnozstvi = mnozstvi;
        this.hmostnost = hmostnost;
        this.dostupnost = dostupnost;
        this.uvedeniDoProdeje = uvedeniDoProdeje;

        try(Scanner scanner = new Scanner(new BufferedReader(new FileReader("soubor"))))
        {
            while(scanner.hasNextLine())
            {String line;
                line = scanner.nextLine();
                String pole[] = line.split(";");
                String jmeno = pole[0];
                mnozstvi = Integer.parseInt(pole[1]);
                hmostnost = Double.parseDouble(pole[2]);
                dostupnost = Boolean.parseBoolean(pole[3]);


            }



        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    public String getNazev() {
        return nazev;
    }

    public void setNazev(String nazev) {
        this.nazev = nazev;
    }

    public int getMnozstvi() {
        return mnozstvi;
    }

    public void setMnozstvi(int mnozstvi) {
        this.mnozstvi = mnozstvi;
    }

    public double getHmostnost() {
        return hmostnost;
    }

    public void setHmostnost(double hmostnost) {
        this.hmostnost = hmostnost;
    }

    public boolean isDostupnost() {
        return dostupnost;
    }

    public void setDostupnost(boolean dostupnost) {
        this.dostupnost = dostupnost;
    }

    public LocalDate getUvedeniDoProdeje() {
        return uvedeniDoProdeje;
    }

    public void setUvedeniDoProdeje(LocalDate uvedeniDoProdeje) {
        this.uvedeniDoProdeje = uvedeniDoProdeje;
    }
}

