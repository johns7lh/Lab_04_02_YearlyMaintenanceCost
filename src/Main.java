public class Main
{
    public static void main(String[] args)

    {
        double maintenanceCostSpring = 250.75;
        double maintenanceCostSummer= 315;
        double maintenanceCostFall= 230.30;
        double maintenanceCostWinter= 150.50 ;
       double  totalMaintenanceCost = maintenanceCostFall + maintenanceCostWinter + maintenanceCostSpring + maintenanceCostSummer;

        System.out.println("The yearly cost of your maintenance is: " + totalMaintenanceCost);
    }
}