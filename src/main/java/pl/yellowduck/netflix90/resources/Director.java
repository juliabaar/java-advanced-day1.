package pl.yellowduck.netflix90.resources;

public class Director extends Person {
    public Director(String firstname, String lastname, Gender1 gender1) {
        super(firstname, lastname, gender1);
    }

    @Override // info dla kompilatora że metoda jest przesłonieta
    public void introduce(){
        System.out.println("Hello, my name is: " + firstname + " " + lastname + ". I am a director.");
    }
// void sluzy przede wszystkim przekazaniu danych do kolejnego obiektu/systemu

}
