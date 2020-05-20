import Model.DistanceInstance1;
import Model.PathX;
import Mutation.MutationInsert;
import Mutation.MutationSwap;
import PopulationFactory.ChildPopulationFactory.ChildPopulationFactoryByAdding;
import PopulationFactory.ParentPopulationFactory.ParentPopulationFactoryGreedy;
import PopulationFactory.ParentPopulationFactory.ParentPopulationFactoryRandom;
import Selection.SelectionByBetterThanMax;
import Selection.SelectionByIndexing;

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

        List<Tester> testerList = new ArrayList<>();

        Tester tester0 = new Tester(20, 20, 1, 1, 200000);
        tester0.add(new ParentPopulationFactoryRandom());
        tester0.add(new ChildPopulationFactoryByAdding());
        tester0.add(new MutationInsert());
        tester0.add(new SelectionByBetterThanMax());

        Tester tester1 = new Tester(20, 20, 1, 1, 200000);
        tester1.add(new ParentPopulationFactoryRandom());
        tester1.add(new ChildPopulationFactoryByAdding());
        tester1.add(new MutationInsert());
        tester1.add(new SelectionByIndexing());

        Tester tester2 = new Tester(20, 20, 1, 1, 200000);
        tester2.add(new ParentPopulationFactoryRandom());
        tester2.add(new ChildPopulationFactoryByAdding());
        tester2.add(new MutationSwap());
        tester2.add(new SelectionByBetterThanMax());

        Tester tester3 = new Tester(20, 20, 1, 1, 200000);
        tester3.add(new ParentPopulationFactoryGreedy());
        tester3.add(new ChildPopulationFactoryByAdding());
        tester3.add(new MutationSwap());
        tester3.add(new SelectionByBetterThanMax());

        testerList.add(tester0);
        testerList.add(tester1);
        testerList.add(tester2);
        testerList.add(tester3);

        testerList.forEach(Tester::start);
        System.out.println();
    }
}
