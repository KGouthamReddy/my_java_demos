package java_project;

public class NetflixPlanFactory {
	public NetflixPlan getPlan(String plan) {
		if(plan == null) {
			return null;
		}
		if(plan.equalsIgnoreCase("basic")) {
			return new BasicPlan();
		}
		else if(plan.equalsIgnoreCase("standard")) {
			return new StandardPlan();
		}
		else if(plan.equalsIgnoreCase("premium")) {
			return new PreminumPlan();
		}
		return null;
	}

}
