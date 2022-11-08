package day12.task5;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> members;

    public MusicBand(String name, int year, List<MusicArtist> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }


    public List<MusicArtist> getMembers() {
        return members;
    }

    public void addMember(MusicArtist member) {

        members.add(member);

    }

    public void removeMember(MusicArtist member) {

        members.remove(member);

    }

    public static void transferMembers(MusicBand musicBand1, MusicBand musicBand2) {
        for (MusicArtist member : musicBand1.getMembers()) {
            musicBand2.getMembers().add(member);
        }
        musicBand1.getMembers().clear();
    }

    public void printMembers() {
        System.out.println(members);
    }


    @Override
    public String toString() {
        return "['" + name + '\'' + ", " + year + "]";
    }
}
