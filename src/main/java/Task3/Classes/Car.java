package Task3.Classes;

import Task3.Interfaces.IMovable;

public  class Car implements IMovable {
    private int cost;
    private int maxSpeed;
    private int capacity;
    private int consumption;

    public Car(int cost, int maxSpeed, int capacity, int consumption) {
        this.cost = cost;
        this.maxSpeed = maxSpeed;
        this.capacity = capacity;
        this.consumption = consumption;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void Move() {
        System.out.println(("Транспорт передвигается"));
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
    public int getCapacity() {
        return capacity;
    }

    public int getConsumption() {
        return consumption;
    }
}
