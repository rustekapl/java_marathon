package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> membersBand1 = new ArrayList<>();
        membersBand1.add(new MusicArtist("Ivan Ivanov", 2000));
        membersBand1.add(new MusicArtist("Petr Petrov",2001));
        membersBand1.add(new MusicArtist("Petr Ivanov",2002));
        MusicBand band1 = new MusicBand("Mad Guitar", 2022, membersBand1 );

        List<MusicArtist> membersBand2 = new ArrayList<>();
        membersBand2.add(new MusicArtist("Joanna Smith",2002));
        membersBand2.add(new MusicArtist("Bob John", 2002));
        MusicBand band2 = new MusicBand("Bad blues", 2020, membersBand2);

        band1.printMembers();
        band2.printMembers();

        MusicBand.transferMembers(band1, band2);

        band1.printMembers();
        band2.printMembers();
    }
}
