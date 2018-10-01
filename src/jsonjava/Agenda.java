package jsonjava;

public class Agenda {
    private String firstName;
    private String lastName;
    private long age;
    private String streetAdress;
    private String city;
    private String state;
    private String postalCode;
    private PhoneNumbers[] phoneNumbers;

    public String getFirstName() {
        return firstName;
    }

    public long getAge() {
        return age;
    }

    public String getStreetAdress() {
        return streetAdress;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getLastName() {
        return lastName;
    }
    
    public PhoneNumbers[] getPhoneNumbers() {
        return phoneNumbers;
    }

    public class PhoneNumbers {
        private long mobile;
        private long home;

        public long getMobile() {
            return mobile;
        }

        public long getHome() {
            return home;
        }
    }
}
