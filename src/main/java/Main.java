import Model.DistanceInstance1;
import Model.PathX;
import TestScenario.Pg.Ca.Ms.PgCaMsSb;
import TestScenario.Pr.Ca.Mi.PrCaMiSb;
import TestScenario.Pr.Ca.Mi.PrCaMiSi;
import TestScenario.Pr.Ca.Ms.PrCaMsSb;

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

        testerList.add(new Tester(new PrCaMiSb(20, 20, 1, 1), 200000));
        testerList.add(new Tester(new PrCaMiSi(20, 20, 1, 1), 200000));
        testerList.add(new Tester(new PrCaMsSb(20, 20, 1, 1), 200000));
        testerList.add(new Tester(new PgCaMsSb(20, 20, 1, 1), 200000));

        testerList.forEach(Tester::start);
        testerList.forEach(tester -> {
            tester.start();
            System.out.println(tester.getScenarioPCMS().toString());
        });
        System.out.println();
    }
}
