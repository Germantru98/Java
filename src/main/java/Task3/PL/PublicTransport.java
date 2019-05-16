package Task3.PL;

import Task3.Classes.Bus;
import Task3.Classes.Car;
import Task3.Classes.ElectroBus;

import java.util.*;

public class PublicTransport {
    private static ArrayList<Car>park = new ArrayList<Car>();
    public static void main(String[] args) {
        Comparator<Car> comp = new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                if(o1.getConsumption()==o2.getConsumption())
                    return 0 ;
                else if (o1.getConsumption()>o2.getConsumption())
                    return 1;
                else
                    return -1;
            }
        };
        Bus b1 = new Bus(5000,120,20,55,26,20);
        Bus b2 = new Bus(5000,120,20,45,26,20);
        Bus b3 = new Bus(5000,120,20,50,26,20);
        Bus b4 = new Bus(5000,120,20,35,26,20);
        BuyBus(b1);
        park.add(b2);park.add(b3);park.add(b4);
        park.sort(comp);
        ShowAll();


    }

    public static void BuyBus(Bus bus) {
        park.add(bus);
    }

    public static void SaleBus(Bus bus) {
        park.remove(bus);
    }

    public static void ShowAll() {
        for(Car i: park)
        {
            System.out.println(i);
        }
    }
}
