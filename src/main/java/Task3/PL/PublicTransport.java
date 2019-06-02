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
        //Tests
        Bus b1 = new Bus(5000,135,20,55,26,20);
        ElectroBus b2 = new ElectroBus(5000,120,20,25,26,300,25);
        ElectroBus b3 = new ElectroBus(5000,120,30,35,26,300,25);
        Bus b4 = new Bus(5000,120,20,35,26,20);
        BuyBus(b1);
        BuyBus(b2);
        BuyBus(b3);
        BuyBus(b4);
        park.sort(comp);
        ShowAll();
        SaleBus(b1);
        System.out.println();
        ShowAll();


    }

    public static void BuyBus(Car bus) {
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
