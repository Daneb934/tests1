package tests;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.get;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ApiTests {
    @Test
    void firstTest(){
        String users = get("https://reqres.in/api/users?page=2").asString();
        System.out.println(users);
    }
    @Test
    void secondTest(){
        String users1 = get("https://reqres.in/api/users?page=2").asString();
        assertTrue(users1.length() > 0, "Users length <= 0");
    }
    @Test
    void thirdTest(){

    }


}