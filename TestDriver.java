

    public class TestDriver {
        public static void main(String[] args) {
            AirportLandingPQ landingPQ = new AirportLandingPQ();
            
            PlanePQ plane1 = new PlanePQ("plane1", 70);
            PlanePQ plane2 = new PlanePQ("plane2", 70);
            PlanePQ plane3 = new PlanePQ("plane3", 70);
            PlanePQ plane4 = new PlanePQ("plane4", 70);
  
            landingPQ.addPlane(plane1);
            landingPQ.addPlane(plane2);
            landingPQ.addPlane(plane3);
            landingPQ.addPlane(plane4);
            System.out.println("\n");

            System.out.println("The landing priority queue is: ");
         
            if (landingPQ.getPlaneCount() > 0) {
            for (int i = 0; i < 4; i++) {
                plane1.setRandFuelPct();
                plane2.setRandFuelPct();
                plane3.setRandFuelPct();
                plane4.setRandFuelPct();
            }
            }
            for (int i = 0; i < 4; i++) {
                System.out.println(plane1.getName() + " " + plane1.getFuelPct());
                System.out.println(plane2.getName() + " " + plane2.getFuelPct());
                System.out.println(plane3.getName() + " " + plane3.getFuelPct());
                System.out.println(plane4.getName() + " " + plane4.getFuelPct());
            }

            System.out.println("\nPlanes Landing: ");
            for (int i = 0; i < 4; i++) {
                if (plane1.getFuelPct() < 60) {
                    System.out.println("The " + plane1.getName() + " is landing" + " with fuel " + plane1.getFuelPct());
                }
                if (plane2.getFuelPct() < 60) {
                    System.out.println("The " + plane2.getName() + " is landing" + " with fuel " + plane2.getFuelPct());
                }
                if (plane3.getFuelPct() < 60) {
                    System.out.println("The " + plane3.getName() + " is landing" + " with fuel " + plane3.getFuelPct());
                }
                if (plane4.getFuelPct() < 60) {
                    System.out.println("The " + plane4.getName() + " is landing " + " with fuel " + plane4.getFuelPct());
                }

            }

            System.out.println("\nAll planes have landed");
            System.out.println("\n");
            int count = 0;
            if (plane1.getFuelPct() < 50) {
                count++;
            }
            if (plane2.getFuelPct() < 50) {
                  count++;
            }
            if (plane3.getFuelPct() < 50) {
                count++;
            }
            if (plane4.getFuelPct() < 50) {
                count++;
            }
            System.out.println("There are " + count + " planes that have fuel below 50");
            System.out.println("\nNumber of planes in the priority queue: " + count);
            System.out.println("\nPlanes in the priority queue: " + count);
            System.out.println("\nPriority Queue: " + count);
        
            System.out.println("\nNumber of planes with fuel less than 60: " + landingPQ.getPlaneCount());

           
            System.out.println("\n");
        
        
        }

       
    }


        
            
   



