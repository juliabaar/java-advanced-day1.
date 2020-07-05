package pl.yellowduck.netflix90;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class MainIO {

    public static void main(String[] args) throws FileNotFoundException {
        // wylistowanie katalogu Users Dell
        File file = new File("C:\\Users\\Dell E7440");
        if (file.exists()) {
            for (File listFile : file.listFiles()) {
                System.out.println(listFile.getName());
            }
        } else {
            throw new FileNotFoundException("Plik katalog nie istnieje");
        }

        System.out.println("\nZadanie z PATH\n");

        Path path = Paths.get("C:\\Users\\Dell E7440\\Desktop\\plik.txt");
        // path.toFile();  za pomocą tego możemy sprowadizć do starego API czyli File
        try {
            final List<String> strings = Files.readAllLines(path); // final bo tylko raz jej używamy
            for (String string : strings) {
                System.out.println(string);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\nDrugi sposób przeczytania pliku + dodanie linii:\n");

        try(BufferedWriter bufferedWriter = Files.newBufferedWriter(path)) {
            bufferedWriter.write("Dodaje tekst do pliku\n");
            bufferedWriter.write("Dodaje kolejny tekst do pliku\n");
            bufferedWriter.write("Dodaje ostatni tekst do pliku\n");


        } catch (IOException e){
            System.out.println("Plik nie istnieje");
        }

        try (BufferedReader bufferedReader = Files.newBufferedReader(path)) {
            String line;
            while((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
        }

        catch(IOException e)
        {
            System.out.println("Sorry plik nie istnieje");
        }
        finally {
          /*  try { // w ten sposób zrobione to po staremu
                if(bufferedReader != null){
                bufferedReader.close();}
            } catch (IOException e) {
                e.printStackTrace();
            }

           */



        }
    }


}
