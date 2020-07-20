package hometask;


import org.apache.log4j.Logger;


public class HomeTask {

	 static Logger log = Logger.getLogger(HomeTask.class.getName());
	public static void main(String[] args) {
	
		InterestEvaluation.interestEvaluator();
        ConstructionCostEstimation.costEvaluator(); 
	}

}
