import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //tablice
        //musi mieć z góry określony rozmiar
        // nie można go później zmienić
        // elementem tablicy mogą być typy proste i złożone

        //tablica z wartościami losowymi z zakresu 1 - 100 składająca się z 6 elementów

        int [] tablicaLosowych = new int[6];
        for (int i = 0; i < tablicaLosowych.length; i++) {
            tablicaLosowych[i] = (int) (Math.random()*100+1); //losowanie do tablicy liczb od 1 do 100
        }
        //wypisywanie elementów tablicy

        for (int element:tablicaLosowych) {
            System.out.print(element+", ");
        }
        //kolekcje, elementy typami złożonymi
        //nie muszą mieć zdefiniowanego rozmiaru
        //rozmiar w trakcie może się zmieniać
        //listy, zbiory Set, mapy

        //wstawianie liczb z klatwiatury do kolekcji

        List<Integer> listaLiczbWpisanych = new ArrayList<>();
        System.out.println("Podaj 6 liczb:");
        Scanner klawiatura = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            int liczba = klawiatura.nextInt();
            listaLiczbWpisanych.add(liczba);
        }
        System.out.println("Wstawione liczby: ");
            for (Integer liczbaWpisana:listaLiczbWpisanych) {
                System.out.println(liczbaWpisana);
            }
            //wypisywanie innym sposobem
        for (int i = 0; i <listaLiczbWpisanych.size() ; i++) {
            System.out.println(listaLiczbWpisanych.get(i));
        }
    }
}