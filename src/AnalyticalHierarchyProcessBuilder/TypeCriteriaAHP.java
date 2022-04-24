package AnalyticalHierarchyProcessBuilder;


public class TypeCriteriaAHP {
   private AHPSubCriteriaProcess ahpSubCriteriaProcess =  AHPSubCriteriaProcess.getInstance();
   private double[] typeCounter = new double[3];

    public double [] typeCriteriaAHPMethods(double criteria, PriorityData[] priorityData, int numberOfBooks) {

        AHPcalculation ahPcalculation =  AHPcalculation.getInstance();

        typeCounter = ahpSubCriteriaProcess.typeCriteriaCalculationMethods(priorityData, numberOfBooks);
        double [] typeWeightMatrix = ahPcalculation.subCriteriaCalculationAnalyticalHierarchyProcess(3,typeCounter,criteria);


        return typeWeightMatrix;

    }
}
