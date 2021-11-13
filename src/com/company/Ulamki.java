package com.company;

public class Ulamki {
    private int licznik1;
    private int mianownik1;
    private int licznik2;
    private int mianownik2;
    private int licznikSuma;
    private int mianownikSuma;
    /********************************************************
     * nazwa funkcji: Ulamki
     * parametry wejściowe: licznik1 - licznik pierwszego ułamka
     *                      mianownik1 - mianownik pierwszego ułamka
     *                      licznik2 - licznik drugiego ułamka
     *                      mianownik2 - mianownik drugieego ułamka
     * wartość zwracana: brak
     * opis: konstruktor klasy Umlamki
     * autor: 23456789012
     * ****************************************************/
    public Ulamki(int licznik1, int mianownik1, int licznik2, int mianownik2) {
        this.licznik1 = licznik1;
        this.mianownik1 = mianownik1;
        this.licznik2 = licznik2;
        this.mianownik2 = mianownik2;
    }

    /********************************************************
     * nazwa funkcji: obliczNWD
     * parametry wejściowe: a - mianownik pierwszego ułamka
     *                      b - mianownik drugiego ułamka
     * wartość zwracana: największy wspólny dzielnik dwóch mianowników
     * opis: oblicza największy wspólny dzielnik dwóch liczb a i b
     * autor: 23456789012
     * ****************************************************/
    private int obliczNWD(int a, int b){
        while (a!=b){
            if(a>b){
                a = a - b;
            } else{
                b = b -a;
            }
        }
        return a;
    }
    /********************************************************
     * nazwa funkcji: dodajUlamki
     * parametry wejściowe: brak
     * wartość zwracana: brak
     * opis: dodaje dwa ułamki zwykłe
     * autor: 23456789012
     * ****************************************************/
    public void dodajUlamki(){
        int nwd = obliczNWD(mianownik1, mianownik2);
        licznikSuma = (licznik1 * mianownik2 + licznik2 * mianownik1) / nwd;
        mianownikSuma = mianownik1 * mianownik2 / nwd;
    }

    /********************************************************
     * nazwa funkcji: getLicznikSuma
     * parametry wejściowe: brak
     * wartość zwracana: zsumowany licznik
     * opis: konstruktor zwraca sumę liczników
     * autor: 23456789012
     * ****************************************************/
    public int getLicznikSuma() {
        return licznikSuma;
    }

    /********************************************************
     * nazwa funkcji: getMianownikSuma
     * parametry wejściowe: brak
     * wartość zwracana: zsumowany mianownik
     * opis: konstruktor zwraca sumę mianowników
     * autor: 23456789012
     * ****************************************************/
    public int getMianownikSuma() {
        return mianownikSuma;
    }
}
