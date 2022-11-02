package day6;

public class Teacher {
    String name;
    String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void evaluate(Student s){
        int mark = (int)(Math.random()*5)+1;

        switch (mark){
            case 2: System.out.println("Преподаватель "+this.getName()+" оценил студента с именем "+s.getName()+" по предмету "+this.getSubject()+" на оценку неудовлетворительно");
            case 3: System.out.println("Преподаватель "+this.getName()+" оценил студента с именем "+s.getName()+" по предмету "+this.getSubject()+" на оценку удовлетворительно");
            case 4: System.out.println("Преподаватель "+this.getName()+" оценил студента с именем "+s.getName()+" по предмету "+this.getSubject()+" на оценку хорошо");
            case 5: System.out.println("Преподаватель "+this.getName()+" оценил студента с именем "+s.getName()+" по предмету "+this.getSubject()+" на оценку отлично");
        }

    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

}
