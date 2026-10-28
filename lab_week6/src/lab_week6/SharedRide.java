
package lab_week6;


public class SharedRide extends EconomyRide {
    
     private int passengerCount;

    public SharedRide(String passengerName, String pickup, String destination,
                      double distanceKm, int durationMin,
                      double pricePerKm, double pricePerMinute,
                      int passengerCount) {

        super(passengerName, pickup, destination,
              distanceKm, durationMin, pricePerKm, pricePerMinute);

        if (passengerCount < 1 || passengerCount > 4) {
            System.out.println("Warning: Passenger count must be between 1 and 4. Set to 1.");
            passengerCount = 1;
        }

        this.passengerCount = passengerCount;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    @Override
    public double calculateFare() {
        return (super.calculateFare() / passengerCount) * 1.10;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nRide Type: Shared"
                + "\nPassenger Count: " + passengerCount;
    }
}
