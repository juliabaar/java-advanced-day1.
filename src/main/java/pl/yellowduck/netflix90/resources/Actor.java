package pl.yellowduck.netflix90.resources;

public class Actor extends Person {

    public Actor(String firstname, String lastname, Gender1 gender1) { //konstruktor klasy podrzednej nie musi miec tyle samo argumentow
        super(firstname, lastname, gender1);
        // super(firstname,lastname,lastname.endsWith("i) ? Gender.MAN : Gender.WOMAN; i wtedy bez gender1 gender w argumentach konstruktora
    }

    @Override
    public void introduce() {
    /*    switch(this.gender){
            case MAN:
                System.out.println("Hello, my name is: " + firstname + " " + lastname + ". I am an actor.");
                break;
            case WOMAN:
                System.out.println("Hello, my name is: " + firstname + " " + lastname + ". I am an actress.");
                break;
        }
        można tez tak
     */

        if (Gender1.WOMAN.equals(gender)) {
            System.out.println("Hello, my name is: " + firstname + " " + lastname + ". I am an actress.");
        } else {
            System.out.println("Hello, my name is: " + firstname + " " + lastname + ". I am an actor.");
        }


    }
}
