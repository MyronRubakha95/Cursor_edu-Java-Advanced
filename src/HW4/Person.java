package HW4;

public class Person {

    int PersonID;
    String FirstName;
    String LastName;
    int PhoneNumber;

    @Override
    public String toString() {
        return "Person{" + "PersonID=" + PersonID + ", FirstName='" + FirstName + '\'' + ", LastName='" + LastName + '\'' + ", PhoneNumber=" + PhoneNumber + '}';
    }

    public void setPersonID(int personID) {
        PersonID = personID;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setPhoneNumber(int phoneNumber) {
        PhoneNumber = phoneNumber;
    }


}
