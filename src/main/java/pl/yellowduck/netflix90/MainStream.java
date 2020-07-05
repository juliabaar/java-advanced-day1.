package pl.yellowduck.netflix90;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.List.*;

public class MainStream {
    public static void main(String[] args) {
        List<String> capitals = new ArrayList<>();
        capitals.add("Warsaw");
        capitals.add("Paris");
        capitals.add("London");
        capitals.add("Rome");
        capitals.add("Lisbona");
// na wyjsciu ma byc zbior stolic zaczynajacy sie na L pisany wielkimi literami Lisona -> ANOBSIL
        for (String list : capitals) { // stary sposób wyfiltrowania kolekcji
            Set<String> capitalsReverse = new HashSet<>();
            if (list.startsWith("L")) {
                capitalsReverse.add(list);

                for (int i = list.length() - 1; i >= 0; i--) {
                    System.out.print(list.toUpperCase().charAt(i));

                }
                System.out.println();
            }
// to samo zrobione inaczej:
        }
        Set<String> capitalWithReversed = capitals.stream().filter(p -> p.startsWith("L"))
                .map(String::toUpperCase)//map(p->p.toUpperCase())
                .map(StringUtils::reverse)
                .collect(Collectors.toSet());

        System.out.println(capitalWithReversed); // moge tak bo to nie sa obiekty

        // wyfiltruj stolice zaczynajce sie od litery O



    }
}

