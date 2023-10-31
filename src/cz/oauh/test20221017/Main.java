package cz.oauh.test20221017;

import cz.oauh.test20221017.EvidenceSkladu;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static final String data = "soubor";
    String line;
    public static void main(String[] args) {
        List<EvidenceSkladu> seznamProduktu = new ArrayList<>();
    try(Scanner scanner = new Scanner(new BufferedReader(new FileReader("soubor"))))
    {
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
           String pole[] = line.split(";");
           String jmeno = pole[0];
           int mnozstvi = Integer.parseInt(pole[1]);
           double hmostnost = Double.parseDouble(pole[2]);
           boolean dostupnost = Boolean.parseBoolean(pole[3]);

            System.out.println(line);
           seznamProduktu.add(jmeno, mnozstvi, hmostnost, dostupnost);

        }

    } catch (FileNotFoundException e) {
        throw new RuntimeException(e);
    }
    catch (IOException e) {
        System.err.println("při načítaní souboru nastala chyba.");
    }
    }
}