package Task3.Classes;

public class ElectroBus extends Car {
    private int ticketPrice;
    private int battery_capacity;
    private int weight;

    public ElectroBus(int cost, int maxSpeed, int capacity, int consumption, int ticketPrice, int battery_capacity, int weight) {
        super(cost, maxSpeed, capacity, consumption);
        this.ticketPrice = ticketPrice;
        this.battery_capacity = battery_capacity;
        this.weight = weight;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    @Override
    public int getConsumption() {
        return super.getConsumption();
    }

    @Override
    public int getMaxSpeed() {
        return super.getMaxSpeed();
    }

    @Override
    public int getCost() {
        return super.getCost();
    }

    @Override
    public void Move() {
        System.out.println("Троллейбус едет");
    }

    @Override
    public int getCapacity() {
        return super.getCapacity();
    }

    public int getBattery_capacity() {
        return battery_capacity;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Автобус вместительности "+this.getCapacity()+"человек с ценой билета: "+ this.ticketPrice+" Максимальная скорость "+this.getMaxSpeed()+"км/ч Расход "+this.getConsumption()+"ватт/ч"+"" +
                "Максимальная емкость батареи "+this.battery_capacity+ "Вес "+this.weight+"тонн " +" Цена"+this.getCost();
    }
}
