import java.util.PriorityQueue;


public class AirportLandingPQ {
    private PriorityQueue<PlanePQ> landingPQ = new PriorityQueue<PlanePQ>();

    public AirportLandingPQ() {
        // TODO Auto-generated constructor stub
    }

    public void addPlane(PlanePQ p) {
        landingPQ.add(p);
    }

    public PlanePQ removePlane() {
        return landingPQ.remove();
    }

    public int getPlaneCount() {
        return landingPQ.size();
    }

    public void simulateLanding() {
        for (int i = 0; i < landingPQ.size(); i++) {
            System.out.println(landingPQ.remove().getName() + " " + landingPQ.remove().getFuelPct());
        }
    }


}
