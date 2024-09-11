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

    }
}