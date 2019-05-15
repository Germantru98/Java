package Task3.PL;

import Task3.Classes.Bus;
import Task3.Classes.Car;
import Task3.Interfaces.IBusGarage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class PublicTransport implements IBusGarage {

    public static void main(String[] args) {
        Bus b = new Bus(5000, 150,30,40,26,20);
        b.Move();
        System.out.println(b);
    }


    public void BuyBus() {

    }

    public void SaleBus() {

    }

    public void SortByConsumption() {

    }

    public void ShowAll() {

    }
}
