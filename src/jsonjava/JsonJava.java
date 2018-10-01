package jsonjava;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonJava {
    public static void main(String[] args) throws ParseException {
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

        JSONParser parser = new JSONParser();
        JSONObject jsonObj = (JSONObject) parser.parse(jsonString);
        for (Object key : jsonObj.keySet()) {
            String ageKey = (String) key;
            if (ageKey.equals("age")) {
                long age = (long) jsonObj.get("age");
                System.out.println("La edad es: " + age);
		      break;
            }
        }
    }
}