package pl.yellowduck.netflix90;

import java.util.IllegalFormatException;

public class Main5 {
    public static void main(String[] args) {
        // error handled with try-catch
        try { // blok try-catch, sprobuj wykonac metode test, a jesli sie nie powiedzi zlap ten wyjątek i wyprintuje error handler
            test();
        } catch (IllegalAccessError | IllegalFormatException e ){
            System.out.println("error handler !!! " + e.getMessage()); //getMessage pobiera z testu wiadomosc
        } catch (IllegalStateException e ){
            System.out.println("error handler ### " + e.getMessage());
        } finally {
            System.out.println("Finally always call");
        }
    }
 // uzywamy tego gdy mamy metode, albo kod ktory uzywamy deklaruje throws, ale musza to byc wyjatki dziedziczace po exception?

    private static void test() throws IllegalStateException {
        if (true) {
            throw new IllegalStateException("Źródłowy problem. Błedny stan");
        }
        System.out.println("after error:");
    }
}

