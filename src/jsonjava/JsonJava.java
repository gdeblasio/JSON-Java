package jsonjava;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;

public class JsonJava {
    public static void main(String[] args) {
        String jsonString = 
                "{ "
                +   "\"firstName\": \"Albert\", "
                +   "\"lastName\": \"Einstein\", "
                +   "\"age\": 139, "
                +   "\"streetAddress\": \"1 EMC2 Drive\", "
                +   "\"city\": \"Princeton\","
                +   "\"state\": \"New Jersey\", "
                +   "\"postalCode\": \"12345\", "
                +   "\"phoneNumbers\": [ "
                +   "   { \"mobile\": 666123456},"
                +   "   { \"home\": 928001122 } "
                +   " ] "
                + "}";
        
        JsonParser parser = new JsonParser();
        JsonObject gsonObj = parser.parse(jsonString).getAsJsonObject();
        JsonPrimitive agePrimitive = gsonObj.getAsJsonPrimitive("age");
        int age = agePrimitive.getAsInt();
        System.out.println("La edad es: " + age);
    }
}