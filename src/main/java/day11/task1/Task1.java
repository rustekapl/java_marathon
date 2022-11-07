package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse1 = new Warehouse();
        Picker p1 = new Picker(warehouse1);
        Courier c1 = new Courier(warehouse1);

        businessProcess(p1);
        businessProcess(c1);

        System.out.println(warehouse1);

        Warehouse warehouse2 = new Warehouse();
        Picker p2 = new Picker(warehouse2);
        Courier c2 = new Courier(warehouse2);

        businessProcess(p2);
        businessProcess(c2);

        System.out.println(warehouse2);


    }

    static void businessProcess(Worker worker) {
        for (int i = 0; i < 10000; i++) {
            worker.doWork();
        }
        worker.bonus();
    }

}
