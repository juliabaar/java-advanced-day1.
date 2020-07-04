package pl.yellowduck.netflix90;

import java.sql.SQLException;
import java.util.IllegalFormatException;

public class MAin6 {

    public static void main(String[] args) {
        // error handled with try-catch
        try { // blok try-catch, sprobuj wykonac metode test, a jesli sie nie powiedzi zlap ten wyjątek i wyprintuje error handler
            test();
        } catch (IllegalAccessError | IllegalFormatException e ){
            System.out.println("error handler !!! " + e.getMessage()); //getMessage pobiera z testu wiadomosc
        } catch (IllegalStateException e ){
            System.out.println("error handler ### " + e.getMessage());
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Finally always call");
        }
    }


    private static void test() throws SQLException { // wyjatek typu checked więc musi zostac obsluzony
        if (true) {
            throw new SQLException("Źródłowy problem. Błedny stan");
        }
        System.out.println("after error:");
    }
}
