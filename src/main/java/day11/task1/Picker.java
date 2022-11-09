package day11.task1;

public class Picker implements Worker {
    private int salary;
    private boolean isPayed;
    private Warehouse warehouse;

    public Picker(Warehouse warehouse) {

        this.warehouse = warehouse;
    }

    public double getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    @Override
    public String toString() {
        return "salary=" + salary +
                ", isPayed=" + isPayed;
    }

    @Override
    public void doWork() {
        salary += Constants.SALARY_PICKER;
        warehouse.setCountPickedOrders(warehouse.getCountPickedOrders() + 1);

    }

    @Override
    public void bonus() {
        if (warehouse.getCountPickedOrders() < Constants.VALUE_ORDERS_FOR_BONUS) {
            System.out.println("Бонус пока не доступен");
            return;
        }
        if (isPayed) {
            System.out.println("Бонус уже был выплачен");
            return;
        }
        salary += Constants.BONUS_PICKER;
        isPayed = true;
    }
}
