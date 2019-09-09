import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

/**
 * Created by venkata on 09/09/2019.
 */
public class getEmployees extends BaseTest {



    @Test
    public void listUsers() {

        //RestAssured.baseURI = "https://reqres.in/api";

        Response response = RestAssured.given().when().request("/users?page=1");
        System.out.println(response);
        String responseAsString = response.asString();
        System.out.println(responseAsString);


    }




}
