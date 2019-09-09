import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by venkata on 09/09/2019.
 */
public class BaseTest {


    @BeforeTest
    public static void setUp(){

        RestAssured.baseURI = "https://reqres.in/api";
    }


}
