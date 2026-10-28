public class FrogSimulation
{
    private int goalDistance;
    private int maxHops;
    
    public FrogSimulation(int dist, int numHops)
    {
        goalDistance = dist;
        maxHops = numHops;
    }
    private int hopDistance()
    {   
        int hop=(int)(Math.random()*10)+1;
        if(Math.random()<0.1){
            hop=-hop;
        }
        return hop;
    }
    public boolean simulate()
    {
        double where=0;
        for (int i=0;i<maxHops;i++){
            where+=hopDistance();
            if( where>=goalDistance){
                return true;
            }
            if(where<0){
                return false;
            }
        }
       
        
        return false;
    }
    public double runSimulations(int num)
    {
        double times=0;
        for (int i=0;i<num;i++){
            if(simulate()){
                times++;
            }
        }
        return times/num;
    }
    public static void main(String[] args) {
        FrogSimulation sim=new FrogSimulation(24,3);
        System.out.println(sim.simulate());
        System.out.println(sim.runSimulations(300));
        
    }
}
