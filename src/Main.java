import java.util.*;

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
        for(int i = 0; i <listaLiczbWpisanych.size() ; i++) {
            System.out.println(listaLiczbWpisanych.get(i));
        }

        //losowanie liczb bez powtórzeń

        ArrayList<Integer> listaLosowychBezPowturzen = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            int liczba = (int)(Math.random()*100+1);
            while (listaLosowychBezPowturzen.contains(liczba)) {
                liczba = (int) (Math.random() * 100 + 1);
            }
                listaLosowychBezPowturzen.add(liczba);//dodawanie liczby do listy

        }
        //wypisywanie tablicy
        System.out.println("Wylosowane liczby bez powtórzeń");
        System.out.println(listaLosowychBezPowturzen);

        //losowanie bez powtórzeń do zbioru

        HashSet<Integer> zbiorLiczbLosowych = new HashSet<>();
        while(zbiorLiczbLosowych.size() < 6){
            int liczba = (int)(Math.random()*100+1);
            zbiorLiczbLosowych.add(liczba);
        }
        System.out.println("Zbiór liczb bez powtórzeń, wylosowane liczby: ");
        System.out.println(zbiorLiczbLosowych);

        //lista
        /*
        Elementy mogą się powtarzać
        Elementy są indeksowane
         */
        //zbiór
        /*
        Elementy są unikatowe
        Elementy nie są indeksowane
         */

        LinkedList<Integer> trafione = new LinkedList<>();
        //trafione to elementy które występują w wylosowanych i wpisanych

        for (Integer wpisana: listaLiczbWpisanych) {
            if(zbiorLiczbLosowych.contains(wpisana)){
                trafione.add(wpisana);
            }
        }
        System.out.println("Trafione: "+trafione);
    }
}