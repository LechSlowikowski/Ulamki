package com.company;

import java.util.Scanner;

public class Main {
    private static int licznik1;
    private static int mianownik1;
    private static int licznik2;
    private static int mianownik2;

    public static void wczytaj(){
        Scanner daneWejsciowe = new Scanner(System.in);
        System.out.print("Podaj licznik pierwszego ułamka: ");
        licznik1 = daneWejsciowe.nextInt();
        System.out.print("Podaj mianownik pierwszego ułamka: ");
        mianownik1 = daneWejsciowe.nextInt();

        System.out.print("Podaj licznik drugiego ułamka: ");
        licznik2 = daneWejsciowe.nextInt();
        System.out.print("Podaj mianownik drugiego ułamka: ");
        mianownik2 = daneWejsciowe.nextInt();
    }

    public static void main(String[] args) {
	    wczytaj();
	    Ulamki ulamki = new Ulamki(licznik1, mianownik1, licznik2, mianownik2);
	    ulamki.dodajUlamki();
	    int licznikSuma = ulamki.getLicznikSuma();
	    int mianownikSuma = ulamki.getMianownikSuma();
	    System.out.print(licznik1 + "/" + mianownik1 + " + ");
        System.out.print(licznik2 + "/" + mianownik2 + " = ");
        System.out.print(licznikSuma + "/" + mianownikSuma);
    }
}
