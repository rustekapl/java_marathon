package day12.task4;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> members;

    public MusicBand(String name, int year, List<String> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }


    public List<String> getMembers() {
        return members;
    }

    public void addMember(String member) {

        members.add(member);

    }

    public void removeMember(String member) {

        members.remove(member);

    }

    public static void transferMembers(MusicBand musicBand1, MusicBand musicBand2) {
        for (String member : musicBand1.getMembers()) {
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
