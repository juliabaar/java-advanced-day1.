package pl.yellowduck.netflix90.resources;

public enum Category  { //klasa specjalnego zastosowania, nie mozna dziedzieczyc po nim ani na nim, moze implementowac interface


    COMEDY(0,"Funny movies"),
    DRAMA(3,"Drama movies"),
    HORROR(4,"Scary movies"),
    MUSCIAL(3,"Musicals"),
    ACTION(2,"Action movies"); //definicja mozliwych wartosci do ustawienia

    private final int discount;
    private final String description;

    Category(int discount, String description) {
        this.discount = discount;
        this.description = description;
    }

    public int getDiscount() {
        return discount;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return name() + " " + description;
    }


    /* @Override
    public int discount() {
        return 0;
    }

    */
}
