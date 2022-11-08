package day12.task3;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> bands = new ArrayList<>();
        bands.add(new MusicBand("Abba", 1972));
        bands.add(new MusicBand("Depeche Mode", 1981));
        bands.add(new MusicBand("A-ha", 1982));
        bands.add(new MusicBand("Queen", 1973));
        bands.add(new MusicBand("Кино", 1980));
        bands.add(new MusicBand("Чайф", 1983));
        bands.add(new MusicBand("Damroka", 2009));
        bands.add(new MusicBand("Infinite ", 2010));
        bands.add(new MusicBand("La Femme", 2010));
        bands.add(new MusicBand("Unicorn ", 2015));

        List<MusicBand> groupsAfter2000 = groupsAfter2000(bands);

        System.out.println(bands);
        System.out.println(groupsAfter2000);

    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> sortedBands = new ArrayList<>();
        for (MusicBand band : bands) {
            if (band.getYear() > 2000) {
                sortedBands.add(band);
            }
        }
        return sortedBands;
    }
}
