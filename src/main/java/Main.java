import Model.DistanceInstance1;
import Model.PathX;
import Mutation.MutationInsert;
import PopulationFactory.PopulationFactoryChild.PopulationFactoryChildByAdding;
import PopulationFactory.PopulationFactoryParent.PopulationFactoryParentRandom;
import Selection.SelectionByBetterThanMax;
import Selection.SelectionBySorting;
import TesterParamManager.*;
import org.apache.commons.lang3.SerializationUtils;

import java.util.ArrayList;
import java.util.List;

public class Main {

    /***** Notation ***

     pR -> Population"P"arent"R"andom
     pG -> Population"P"arent"G"reedy
     cA -> Population"C"hildrenBy"A"dding
     cI -> Population"C"hildrenBy"I"ndexing
     mI -> "M"utation"I"nsert
     mR -> "M"utation"R"everse
     mS -> "M"utation"S"wap
     sB -> "S"electionBy"B"etterThanMax
     sI -> "S"electionBy"I"ndexing
     sS -> "S"electionBy"S"orting

     explain:
     mS -> "m" means "m"utation, "S" means mutation type is "s"wap, so mS -> using MutationSwap.class for mutation.
     order priority p > c > m > s

     */

    public static void main(String[] args) {

        PathX.setDistanceValues((new DistanceInstance1()));

        TesterParamManager sharingParams = new TesterParamManager();

        sharingParams.setManagerFactoryParent(20, new ManagerFactoryParent());
        sharingParams.setManagerFactoryChild(20, 1, new ManagerFactoryChild());
        sharingParams.setManagerMutation(1, new ManagerMutation());
        sharingParams.setManagerSelection(new ManagerSelection());

        TesterParamManager pRcAmIsB = SerializationUtils.clone(sharingParams);

        pRcAmIsB.getManagerFactoryParent().add(new PopulationFactoryParentRandom());
        pRcAmIsB.getManagerFactoryChild().add(new PopulationFactoryChildByAdding());
        pRcAmIsB.getManagerMutation().add(new MutationInsert());

        TesterParamManager pRcAmIsS = SerializationUtils.clone(pRcAmIsB);

        pRcAmIsB.getManagerSelection().add(new SelectionByBetterThanMax());
        pRcAmIsS.getManagerSelection().add(new SelectionBySorting());


        List<TesterPopulation> list = new ArrayList<>();
        list.add(new TesterPopulation("pop0", 200000, pRcAmIsB));
        list.add(new TesterPopulation("pop1", 200000, pRcAmIsS));

        list.forEach(TesterPopulation::start);
    }
}
