package it.epicode.esercizi;

public class esercizio1 {

    public static boolean stringaPariDispari(String s) {
        return s.length() % 2 == 0;
    }

    public static boolean annoBisestile(int anno) {
        if (anno % 4 == 0) {
            if (anno % 100 == 0) {
                return anno % 400 == 0;
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        String str1 = "Esercizio";
        String str2 = "Java";

        System.out.println("La stringa \"" + str1 + "\" ha un numero di caratteri pari? " + stringaPariDispari(str1));
        System.out.println("La stringa \"" + str2 + "\" ha un numero di caratteri pari? " + stringaPariDispari(str2));

        int anno1 = 2024;
        int anno2 = 1900;

        System.out.println("L'anno " + anno1 + " è bisestile? " + annoBisestile(anno1));
        System.out.println("L'anno " + anno2 + " è bisestile? " + annoBisestile(anno2));
    }
}

