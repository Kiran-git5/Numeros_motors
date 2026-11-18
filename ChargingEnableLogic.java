
public class ChargingEnableLogic {

    public static void main(String[] args) {

        // Inputs
        double vehicleSpeed = 0.0;
        boolean ignitionStatus = false; // false = OFF, true = ON
        boolean sideStandStatus = true; // true = ENGAGED, false = DISENGAGED

        // Internal signals
        boolean vehicleStationary;
        boolean chargingAllowed;

        // Step 1: Vehicle Stationary Detection
        if (vehicleSpeed == 0.0) {
            vehicleStationary = true;
        } else {
            vehicleStationary = false;
        }

        // Step 2: Charging Enable Decision
        if (vehicleStationary == true &&
            ignitionStatus == false &&
            sideStandStatus == true) {

            chargingAllowed = true;

        } else {
            chargingAllowed = false;
        }

        // Output
        System.out.println("Vehicle Stationary: " + vehicleStationary);
        System.out.println("Charging Allowed: " + chargingAllowed);
    }
}
