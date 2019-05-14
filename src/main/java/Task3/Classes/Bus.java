package Task3.Classes;

public class Bus extends Car {

    private int ticketPrice;
    private int weight;

    public Bus(int cost, int maxSpeed, int capacity, int consumption, int ticketPrice, int weight) {
        super(cost, maxSpeed, capacity, consumption);
        this.ticketPrice = ticketPrice;
        this.weight = weight;
    }


    @Override
    public void Move() {
        System.out.println("Автобус передвигается");
    }

    @Override
    public int getCapacity() {
        return super.getCapacity();
    }

    @Override
    public int getCost() {
        return super.getCost();
    }

    @Override
    public int getMaxSpeed() {
        return super.getMaxSpeed();
    }

    @Override
    public int getConsumption() {
        return super.getConsumption();
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Автобус вместительности "+this.getCapacity()+"человек с ценой билета: "+ this.ticketPrice+" Максимальная скорость "+this.getMaxSpeed()+"км/ч Расход "+this.getConsumption()+"л Вес "
                +this.weight+"тонн " +" Цена"+this.getCost();
    }
}
