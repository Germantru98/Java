package Task3.PL;

import Task3.Classes.Bus;
import Task3.Classes.Car;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class PublicTransport {
    static List<Car>park;

    public static void main(String[] args) {
        Bus b = new Bus(5000, 150,30,40,26,20);
        b.Move();
        System.out.println(b);
        park.add(b);
        System.out.println(park.);
    }



}
