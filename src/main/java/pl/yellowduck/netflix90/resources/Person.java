package pl.yellowduck.netflix90.resources;

public abstract class Person { // polimorfizm - obiekty pozwalaja wywolac metode ze wskazanej instancji
    // klasa ktora posiada chociaz jedna metode abstrakcyjna musi byc abstrakcyjna, abstrakcyjna czyli nie tworzymy jej instancji
    protected String firstname;
    protected String lastname;
    protected final Gender1 gender;

    public Person(String firstname, String lastname, Gender1 gender) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;

    }
    public abstract void introduce();

    @Override
    public String toString() {
        return firstname + " " + lastname;
    }
}

// wyjatki unchecked tzw runtimowe,