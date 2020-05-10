import Model.DistanceInstance1;
import Model.PathX;
import Mutation.MutationInsert;
import Mutation.MutationReverse;
import Mutation.MutationSwap;
import PopulationFactory.PopulationFactoryChild.PopulationFactoryChildByAdding;
import PopulationFactory.PopulationFactoryChild.PopulationFactoryChildByIndexing;
import PopulationFactory.PopulationFactoryParent.PopulationFactoryParentRandom;
import Selection.SelectionByBetterThanMax;
import TesterParamManager.*;

public class Main {

    public static void main(String[] args) {

        PathX.setDistanceValues((new DistanceInstance1()));

        TesterParamManager testerParamManager = new TesterParamManager();

        testerParamManager.setManagerFactoryParent(20,new ManagerFactoryParent());
        testerParamManager.setManagerFactoryChild(20, 1,new ManagerFactoryChild());
        testerParamManager.setManagerMutation(1,new ManagerMutation());
        testerParamManager.setManagerSelection(new ManagerSelection());

        testerParamManager.getManagerFactoryParent().add(new PopulationFactoryParentRandom());
        testerParamManager.getManagerFactoryChild().add(new PopulationFactoryChildByAdding());
        testerParamManager.getManagerFactoryChild().add(new PopulationFactoryChildByIndexing());
        testerParamManager.getManagerMutation().add(new MutationSwap());
        testerParamManager.getManagerMutation().add(new MutationInsert());
        testerParamManager.getManagerMutation().add(new MutationReverse());
        testerParamManager.getManagerSelection().add(new SelectionByBetterThanMax());

        TesterPopulation testerPopulation = new TesterPopulation(1, 100000, testerParamManager);
        testerPopulation.start();

    }
}
