package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> membersBand1 = new ArrayList<>();
        membersBand1.add("Ivan Ivanov");
        membersBand1.add("Petr Petrov");
        membersBand1.add("Petr Ivanov");
        MusicBand band1 = new MusicBand("Mad Guitar", 2000, membersBand1);

        List<String> membersBand2 = new ArrayList<>();
        membersBand2.add("Joanna Smith");
        membersBand2.add("Bob John");
        MusicBand band2 = new MusicBand("Bad blues", 2020, membersBand2);

        band1.printMembers();
        band2.printMembers();

        MusicBand.transferMembers(band1, band2);

        band1.printMembers();
        band2.printMembers();

    }
}
