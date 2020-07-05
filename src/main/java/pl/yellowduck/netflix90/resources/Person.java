package pl.yellowduck.netflix90.resources;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@Getter

public abstract class Person { // polimorfizm - obiekty pozwalaja wywolac metode ze wskazanej instancji
    // klasa ktora posiada chociaz jedna metode abstrakcyjna musi byc abstrakcyjna, abstrakcyjna czyli nie tworzymy jej instancji
    protected String firstname;
    protected String lastname;
    protected final Gender1 gender;


    public abstract void introduce();

    @Override
    public String toString() {
        return firstname + " " + lastname; // mogę to osiągnąć anotacją toString(exclude = {"gender"})
    }
}

// wyjatki unchecked tzw runtimowe,