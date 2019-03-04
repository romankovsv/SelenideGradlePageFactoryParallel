package config;

/*import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;*/
import io.qameta.allure.Step;
import org.testng.Reporter;

//import ru.yandex.qatools.allure.annotations.Step;

public class ExtendReporter extends Reporter{

    //private static final Logger logger = LogManager.getLogger(ExtendReporter.class);


    @Step("{log}")
    public static void logToAllure(String log, boolean value) {
        String date = DateTimeUtil.getCurrentDateTimeInUTC();
        Reporter.log("["+date+"]"+log, value);

    }

    @Step("{log}")
    public static void logToAllure(String log) {
        String date = DateTimeUtil.getCurrentDateTimeInUTC();
        Reporter.log("["+date+"]"+log, true);
    }





}
