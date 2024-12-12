public class StepTracker{
    int steps;
    double AVGsteps;
    int days;
    int ACTdays;
    
    public int addDailySteps(int USERsteps){
        steps=steps+USERsteps;
        days=days+1;
        return steps;
        return days;
    }
    
    public int activeDays(int USERsteps){
        
        if(USERsteps>=10000){
            ACTdays=ACTdays+1;
        }
        return ACTdays;
    }
    
    public double averageSteps(){
        AVGsteps=steps/days;
        return AVGsteps;
    }
}