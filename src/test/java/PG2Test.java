import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class PG2Test {
PG pg1;
PG pg2;
PG pg3;
PG pg4;

@Before
public void setUP(){
    pg1=new PG(0.6,20,50,"Tatum");
    pg2=new PG(0.3,21,30,"Simmons");
    pg3=new PG(0.7,19,55,"DSJ");
    pg4=new PG(0.2,20,20,"Srulc");
}


    @Test
    @Parameters({
    "pg1,pg2,pg3,pg4,DSJ"
    })
public void testowanie(PG pg1,PG pg2, PG pg3, PG pg4, String result){

}

}
