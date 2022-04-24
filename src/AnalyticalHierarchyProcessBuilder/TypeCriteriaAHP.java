package AnalyticalHierarchyProcessBuilder;


public class TypeCriteriaAHP {
    AHPSubCriteriaProcess ahpSubCriteriaProcess = new AHPSubCriteriaProcess();
    double[] typeCounter = new double[6];

    public AHPcriteriaWeight typeCriteriaAHPMethods(double criteria, PriorityData[] priorityData, int numberOfBooks) {

        AHPcalculation ahPcalculation = new AHPcalculation();

        typeCounter = ahpSubCriteriaProcess.typeCriteriaCalculationMethods(priorityData, numberOfBooks);
        double [] typeWeightMatrix = ahPcalculation.matrixCalculationAnalyticalHierarchyProcess(6,typeCounter,criteria);

        AHPcriteriaWeight ahPcriteriaWeight = new AHPcriteriaWeight(typeWeightMatrix);

        return ahPcriteriaWeight;

    }
}
