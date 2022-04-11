
import java.util.Random;


    
public class PlanePQ implements Comparable<PlanePQ>{
    private String name;
    private int fuelPct;
    private Random rand = new Random();
    
   
    public PlanePQ(String name, int fuelPct) {
        this.name = name;
        this.fuelPct = fuelPct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFuelPct() {
        return fuelPct;
    }

    public void setFuelPct(int fuelPct) {
        this.fuelPct = fuelPct;
    }

    public void setRandFuelPct() {
        fuelPct = fuelPct - rand.nextInt(10);
    }

    @Override

    public int compareTo(PlanePQ o) {
        if (this.fuelPct < o.fuelPct) {
            return -1;
        } else if (this.fuelPct > o.fuelPct) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override

    public String toString() {
        return "PlanePQ [name=" + name + ", fuelPct=" + fuelPct + "]";
    }


}

