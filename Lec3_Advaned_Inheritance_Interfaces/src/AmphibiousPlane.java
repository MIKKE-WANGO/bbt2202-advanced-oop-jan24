public class AmphibiousPlane implements Amphibious, AirVehicle {
    @Override
    public void dock() {
        System.out.println("Amphibious plane is docking.");
    }

    @Override
    public void launch() {
        System.out.println("Amphibious plane is launching.");
    }



    @Override
    public void fly() {
        // TODO Auto-generated method stub
        System.out.println("Amphibious plane is flying.");
    }


    // Additional methods and properties specific to AmphibiousPlane
}