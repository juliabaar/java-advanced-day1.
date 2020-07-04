package pl.yellowduck.netflix90;

import pl.yellowduck.netflix90.resources.Actor;
import pl.yellowduck.netflix90.resources.Director;
import pl.yellowduck.netflix90.resources.Gender1;
import pl.yellowduck.netflix90.resources.Person;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Director tommy = new Director("Tommy", "Wiseau", Gender1.MAN); //ctrl+alt+v przypisanie do zmiennej lokalnej
        Actor tommyActor = new Actor("Tommy", "Wiseau", Gender1.MAN);
        Actor juliette = new Actor("Juliette", "Danielle", Gender1.WOMAN);
        Actor greg = new Actor("Greg", "Sestero", Gender1.MAN);

        Set<Person> persons = new HashSet<>();
        persons.add(tommy);
        persons.add(tommyActor);
        persons.add(juliette);
        persons.add(greg);

        for (Person person: persons){
            person.introduce(); //w main2 jak jeszcze mozna to rozwiazac

        }
    }
}
