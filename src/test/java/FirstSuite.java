import config.TestSessionListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestSessionListener.class)
public class FirstSuite {


    @Test
    public void check(){
       new Testplatform()
               .openHomePage()
               .openNewPage()
               .verifyThatOnPageThereAre(10);
    }

    @Test
    public void checkSome(){
        new Testplatform()
                .openHomePage()
                .openNewPage()
                .verifyThatOnPageThereAre(10);
    }

    @Test
    public void testOne(){
        new Testplatform()
                .openHomePage()
                .openNewPage()
                .verifyThatOnPageThereAre(10);
    }

    @Test
    public void TestTwo(){
        new Testplatform()
                .openHomePage()
                .openNewPage()
                .verifyThatOnPageThereAre(10);
    }


}
