package hu.petrik.szuperhosprojekt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Kepregeny {

    public static List<SzuperHos> szuperhosLista = new ArrayList<>();

    public static void szereplok(String fajlElérésiÚtja) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fajlElérésiÚtja))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                String type = parts[0];
                int count = Integer.parseInt(parts[1]);

                SzuperHos hero;
                if (type.equalsIgnoreCase("Batman")) {
                    hero = new Batman();
                } else if (type.equalsIgnoreCase("Vasember")) {
                    hero = new Vasember();
                } else {
                    System.out.println("Unknown hero type: " + type);
                    continue;
                }

                for (int i = 0; i < count; i++) {
                    if (hero instanceof Milliardos) {
                        ((Milliardos) hero).kutyutKeszit();
                    }
                }
                szuperhosLista.add(hero);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format in file: " + e.getMessage());
        }
    }

    public static void szuperhosok() {
        for (SzuperHos szuperhos : szuperhosLista) {
            System.out.println(szuperhos);
        }
    }

    public static void main(String[] args) {
        String file = "heroes.txt";
        szereplok(file);
        szuperhosok();
    }
}
