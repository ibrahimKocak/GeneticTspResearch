package TestScenario;

import TestScenario.Pg.Ca.Mi.PgCaMiSb;
import TestScenario.Pg.Ca.Mi.PgCaMiSi;
import TestScenario.Pg.Ca.Mi.PgCaMiSs;
import TestScenario.Pg.Ca.Mr.PgCaMrSb;
import TestScenario.Pg.Ca.Mr.PgCaMrSi;
import TestScenario.Pg.Ca.Mr.PgCaMrSs;
import TestScenario.Pg.Ca.Ms.PgCaMsSb;
import TestScenario.Pg.Ca.Ms.PgCaMsSi;
import TestScenario.Pg.Ca.Ms.PgCaMsSs;
import TestScenario.Pg.Ci.Mi.PgCiMiSb;
import TestScenario.Pg.Ci.Mi.PgCiMiSi;
import TestScenario.Pg.Ci.Mi.PgCiMiSs;
import TestScenario.Pg.Ci.Mr.PgCiMrSb;
import TestScenario.Pg.Ci.Mr.PgCiMrSi;
import TestScenario.Pg.Ci.Mr.PgCiMrSs;
import TestScenario.Pg.Ci.Ms.PgCiMsSb;
import TestScenario.Pg.Ci.Ms.PgCiMsSi;
import TestScenario.Pg.Ci.Ms.PgCiMsSs;
import TestScenario.Pr.Ca.Mi.PrCaMiSb;
import TestScenario.Pr.Ca.Mi.PrCaMiSi;
import TestScenario.Pr.Ca.Mi.PrCaMiSs;
import TestScenario.Pr.Ca.Mr.PrCaMrSb;
import TestScenario.Pr.Ca.Mr.PrCaMrSi;
import TestScenario.Pr.Ca.Mr.PrCaMrSs;
import TestScenario.Pr.Ca.Ms.PrCaMsSb;
import TestScenario.Pr.Ca.Ms.PrCaMsSi;
import TestScenario.Pr.Ca.Ms.PrCaMsSs;
import TestScenario.Pr.Ci.Mi.PrCiMiSb;
import TestScenario.Pr.Ci.Mi.PrCiMiSi;
import TestScenario.Pr.Ci.Mi.PrCiMiSs;
import TestScenario.Pr.Ci.Mr.PrCiMrSb;
import TestScenario.Pr.Ci.Mr.PrCiMrSi;
import TestScenario.Pr.Ci.Mr.PrCiMrSs;
import TestScenario.Pr.Ci.Ms.PrCiMsSb;
import TestScenario.Pr.Ci.Ms.PrCiMsSi;
import TestScenario.Pr.Ci.Ms.PrCiMsSs;
import org.junit.jupiter.api.Test;

public class ScenarioPCMSTest {

    @Test
    void PCMSTest() {

        assert ((new PrCaMiSb(0, 0, 0, 0)).toName().equals("PrCaMiSb") && (new PrCaMiSb(0, 0, 0, 0)).toName().equals(PrCaMiSb.class.getSimpleName()));
        assert ((new PrCaMiSi(0, 0, 0, 0)).toName().equals("PrCaMiSi") && (new PrCaMiSi(0, 0, 0, 0)).toName().equals(PrCaMiSi.class.getSimpleName()));
        assert ((new PrCaMiSs(0, 0, 0, 0)).toName().equals("PrCaMiSs") && (new PrCaMiSs(0, 0, 0, 0)).toName().equals(PrCaMiSs.class.getSimpleName()));
        assert ((new PrCaMrSb(0, 0, 0, 0)).toName().equals("PrCaMrSb") && (new PrCaMrSb(0, 0, 0, 0)).toName().equals(PrCaMrSb.class.getSimpleName()));
        assert ((new PrCaMrSi(0, 0, 0, 0)).toName().equals("PrCaMrSi") && (new PrCaMrSi(0, 0, 0, 0)).toName().equals(PrCaMrSi.class.getSimpleName()));
        assert ((new PrCaMrSs(0, 0, 0, 0)).toName().equals("PrCaMrSs") && (new PrCaMrSs(0, 0, 0, 0)).toName().equals(PrCaMrSs.class.getSimpleName()));
        assert ((new PrCaMsSb(0, 0, 0, 0)).toName().equals("PrCaMsSb") && (new PrCaMsSb(0, 0, 0, 0)).toName().equals(PrCaMsSb.class.getSimpleName()));
        assert ((new PrCaMsSi(0, 0, 0, 0)).toName().equals("PrCaMsSi") && (new PrCaMsSi(0, 0, 0, 0)).toName().equals(PrCaMsSi.class.getSimpleName()));
        assert ((new PrCaMsSs(0, 0, 0, 0)).toName().equals("PrCaMsSs") && (new PrCaMsSs(0, 0, 0, 0)).toName().equals(PrCaMsSs.class.getSimpleName()));
        assert ((new PrCiMiSb(0, 0, 0, 0)).toName().equals("PrCiMiSb") && (new PrCiMiSb(0, 0, 0, 0)).toName().equals(PrCiMiSb.class.getSimpleName()));
        assert ((new PrCiMiSi(0, 0, 0, 0)).toName().equals("PrCiMiSi") && (new PrCiMiSi(0, 0, 0, 0)).toName().equals(PrCiMiSi.class.getSimpleName()));
        assert ((new PrCiMiSs(0, 0, 0, 0)).toName().equals("PrCiMiSs") && (new PrCiMiSs(0, 0, 0, 0)).toName().equals(PrCiMiSs.class.getSimpleName()));
        assert ((new PrCiMrSb(0, 0, 0, 0)).toName().equals("PrCiMrSb") && (new PrCiMrSb(0, 0, 0, 0)).toName().equals(PrCiMrSb.class.getSimpleName()));
        assert ((new PrCiMrSi(0, 0, 0, 0)).toName().equals("PrCiMrSi") && (new PrCiMrSi(0, 0, 0, 0)).toName().equals(PrCiMrSi.class.getSimpleName()));
        assert ((new PrCiMrSs(0, 0, 0, 0)).toName().equals("PrCiMrSs") && (new PrCiMrSs(0, 0, 0, 0)).toName().equals(PrCiMrSs.class.getSimpleName()));
        assert ((new PrCiMsSb(0, 0, 0, 0)).toName().equals("PrCiMsSb") && (new PrCiMsSb(0, 0, 0, 0)).toName().equals(PrCiMsSb.class.getSimpleName()));
        assert ((new PrCiMsSi(0, 0, 0, 0)).toName().equals("PrCiMsSi") && (new PrCiMsSi(0, 0, 0, 0)).toName().equals(PrCiMsSi.class.getSimpleName()));
        assert ((new PrCiMsSs(0, 0, 0, 0)).toName().equals("PrCiMsSs") && (new PrCiMsSs(0, 0, 0, 0)).toName().equals(PrCiMsSs.class.getSimpleName()));
        assert ((new PgCaMiSb(0, 0, 0, 0)).toName().equals("PgCaMiSb") && (new PgCaMiSb(0, 0, 0, 0)).toName().equals(PgCaMiSb.class.getSimpleName()));
        assert ((new PgCaMiSi(0, 0, 0, 0)).toName().equals("PgCaMiSi") && (new PgCaMiSi(0, 0, 0, 0)).toName().equals(PgCaMiSi.class.getSimpleName()));
        assert ((new PgCaMiSs(0, 0, 0, 0)).toName().equals("PgCaMiSs") && (new PgCaMiSs(0, 0, 0, 0)).toName().equals(PgCaMiSs.class.getSimpleName()));
        assert ((new PgCaMrSb(0, 0, 0, 0)).toName().equals("PgCaMrSb") && (new PgCaMrSb(0, 0, 0, 0)).toName().equals(PgCaMrSb.class.getSimpleName()));
        assert ((new PgCaMrSi(0, 0, 0, 0)).toName().equals("PgCaMrSi") && (new PgCaMrSi(0, 0, 0, 0)).toName().equals(PgCaMrSi.class.getSimpleName()));
        assert ((new PgCaMrSs(0, 0, 0, 0)).toName().equals("PgCaMrSs") && (new PgCaMrSs(0, 0, 0, 0)).toName().equals(PgCaMrSs.class.getSimpleName()));
        assert ((new PgCaMsSb(0, 0, 0, 0)).toName().equals("PgCaMsSb") && (new PgCaMsSb(0, 0, 0, 0)).toName().equals(PgCaMsSb.class.getSimpleName()));
        assert ((new PgCaMsSi(0, 0, 0, 0)).toName().equals("PgCaMsSi") && (new PgCaMsSi(0, 0, 0, 0)).toName().equals(PgCaMsSi.class.getSimpleName()));
        assert ((new PgCaMsSs(0, 0, 0, 0)).toName().equals("PgCaMsSs") && (new PgCaMsSs(0, 0, 0, 0)).toName().equals(PgCaMsSs.class.getSimpleName()));
        assert ((new PgCiMiSb(0, 0, 0, 0)).toName().equals("PgCiMiSb") && (new PgCiMiSb(0, 0, 0, 0)).toName().equals(PgCiMiSb.class.getSimpleName()));
        assert ((new PgCiMiSi(0, 0, 0, 0)).toName().equals("PgCiMiSi") && (new PgCiMiSi(0, 0, 0, 0)).toName().equals(PgCiMiSi.class.getSimpleName()));
        assert ((new PgCiMiSs(0, 0, 0, 0)).toName().equals("PgCiMiSs") && (new PgCiMiSs(0, 0, 0, 0)).toName().equals(PgCiMiSs.class.getSimpleName()));
        assert ((new PgCiMrSb(0, 0, 0, 0)).toName().equals("PgCiMrSb") && (new PgCiMrSb(0, 0, 0, 0)).toName().equals(PgCiMrSb.class.getSimpleName()));
        assert ((new PgCiMrSi(0, 0, 0, 0)).toName().equals("PgCiMrSi") && (new PgCiMrSi(0, 0, 0, 0)).toName().equals(PgCiMrSi.class.getSimpleName()));
        assert ((new PgCiMrSs(0, 0, 0, 0)).toName().equals("PgCiMrSs") && (new PgCiMrSs(0, 0, 0, 0)).toName().equals(PgCiMrSs.class.getSimpleName()));
        assert ((new PgCiMsSb(0, 0, 0, 0)).toName().equals("PgCiMsSb") && (new PgCiMsSb(0, 0, 0, 0)).toName().equals(PgCiMsSb.class.getSimpleName()));
        assert ((new PgCiMsSi(0, 0, 0, 0)).toName().equals("PgCiMsSi") && (new PgCiMsSi(0, 0, 0, 0)).toName().equals(PgCiMsSi.class.getSimpleName()));
        assert ((new PgCiMsSs(0, 0, 0, 0)).toName().equals("PgCiMsSs") && (new PgCiMsSs(0, 0, 0, 0)).toName().equals(PgCiMsSs.class.getSimpleName()));
    }
}
