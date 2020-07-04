package pl.yellowduck.netflix90;

import pl.yellowduck.netflix90.resources.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main2 {

    public static void main(String[] args) {
        Director tommy = new Director("Tommy", "Wiseau", Gender1.MAN); //ctrl+alt+v przypisanie do zmiennej lokalnej
        Actor tommyActor = new Actor("Tommy", "Wiseau", Gender1.MAN);
        Actor juliette = new Actor("Juliette", "Danielle", Gender1.WOMAN);
        Actor greg = new Actor("Greg", "Sestero", Gender1.MAN);

        Set<Actor> actors = new HashSet<>();
        actors.add(tommyActor);
        actors.add(juliette);
        actors.add(greg);

        VideoCassete theRoom = new VideoCassete("VID001",
                BigDecimal.valueOf(20),
                "The Room",
                tommy,
                Category.DRAMA,
                actors);
    }
}
