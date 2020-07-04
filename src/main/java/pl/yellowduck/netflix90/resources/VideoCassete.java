package pl.yellowduck.netflix90.resources;

import java.math.BigDecimal;
import java.util.Set;

public class VideoCassete {
    private String id;
    private BigDecimal price; // float i double gubią precyzję w obliczeniach
    private String title;
    private Director director; //alt+enter mozemy kliknac ze tworzymy klase
    private Category category; // przyjmuje tylko to, co wpisalismy w klasie enum Category
    private Set<Actor> actors; // <> - typ generyczny czyli jest pewne zachowanie wspolne ktore moze przechowywac elementy danego typu

    public VideoCassete(String id, BigDecimal price, String title, Director director, Category category, Set<Actor> actors) {
        this.id = id;
        this.price = price;
        this.title = title;
        this.director = director;
        this.category = category;
        this.actors = actors;
    }

}
