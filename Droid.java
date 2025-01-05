
public class Droid{
    //fields
    String name;
    int batteryLevel;

    //constructor
    public Droid (String droidName){
        name = droidName;
        batteryLevel = 100;
    }

    //toString method
    public String toString(){
        return "Hello, I'm the droid: " + name;
    }

    //performTask method
    public void performTask(String task){
        System.out.println(name + " is performing task: " + task);
        batteryLevel-=10;
    }

    //getbatteryLevel method
    public void energyReport(){
        System.out.println("Battery level is: " + batteryLevel);
    }

    //energy transfer method
    public void energyTransfer(Droid otherDroid, int energyAmountToTransfer){

        int maxAmoutToTransfer = 100 - otherDroid.batteryLevel;

        if(energyAmountToTransfer > batteryLevel){
            System.out.println("Not enough energy to transfer");
            return;
        }

        if(energyAmountToTransfer > maxAmoutToTransfer){
            energyAmountToTransfer = maxAmoutToTransfer;
        }

        batteryLevel-=energyAmountToTransfer;
        otherDroid.batteryLevel+=energyAmountToTransfer;

        System.out.println("Energy transfer complete. transfered: " + energyAmountToTransfer + " to " + otherDroid.name);
    }

    //main method
    public static void main(String[] args) {
        
        Droid codey = new Droid("Codey");
        System.out.println(codey);
        codey.performTask("dancing");
        codey.energyReport();

        System.out.println();

        Droid Amitha = new Droid("Amitha");
        System.out.println(Amitha);
        Amitha.performTask("learning java");
        Amitha.energyReport();

        System.out.println();

        Amitha.energyTransfer(codey, 80);
        codey.energyReport();
        Amitha.energyReport();

    }
}