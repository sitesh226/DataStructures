package DesignPatterns.Factory;

public class GetPlanFactory {

    public Plan getPlan(String planType){
        if(planType==null)
            return null;
        else if(planType.equalsIgnoreCase("DOMESTICPLAN"))
            return new DomesticPlan();
        else if(planType.equalsIgnoreCase("COMMERCIALPLAN"))
            return new CommmercialPlan();
        else
            return null;
    }
}
