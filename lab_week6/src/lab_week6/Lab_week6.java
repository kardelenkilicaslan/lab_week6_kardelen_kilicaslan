
package lab_week6;

import java.util.ArrayList;
public class Lab_week6 {

  
    public static void main(String[] args) {
        ArrayList<Ride> rides = new ArrayList<>();

        Ride r1 = new Ride(
                "Kardelen", "Kadıköy", "Maltepe",
                10, 20, 8
        );

        EconomyRide r2 = new EconomyRide(
                "Berk", "Melikgazi", "AVM",
                15, 25, 8, 2
        );

        PremiumRide r3 = new PremiumRide(
                "Ömer", "Hotel", "Airport",
                20, 30, 10, 50, 1.5
        );

        SharedRide r4 = new SharedRide(
                "Rıdvan", " Erciyes University", "Airport",
                12, 20, 8, 2, 3
        );

        rides.add(r1);
        rides.add(r2);
        rides.add(r3);
        rides.add(r4);

        for (Ride ride : rides) {
            System.out.println("---------------------------");
            System.out.println(ride.toString());
            System.out.println("Total Fare: "
                    + ride.calculateFare() + " TL");
        }
    }
    }
    

