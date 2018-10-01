package jsonjava;

import com.google.gson.Gson;

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
        Gson gson = new Gson();
        Agenda agenda = gson.fromJson(jsonString, Agenda.class);
        long age = agenda.getAge();
        System.out.println("La edad es: " + age);
    }
}