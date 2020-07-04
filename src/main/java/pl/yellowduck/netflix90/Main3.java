package pl.yellowduck.netflix90;

import pl.yellowduck.netflix90.resources.Category;

public class Main3 {
    public static void main(String[] args) {
        Category category = Category.DRAMA;

        System.out.println("simple print " + category);
        System.out.println("print toString " + category.toString());
        System.out.println("print name " + category.name());
        System.out.println("print oridnal " + category.ordinal());
    }
}
