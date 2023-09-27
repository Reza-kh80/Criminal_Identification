package model.head;

public class PersonHead extends Head {

    private String firstName, lastName, birthday, birthPlace, workPlace;

    public PersonHead(String[] inputs) {
        firstName = inputs[0];
        lastName = inputs[1];
        nationalCode = inputs[2];
        birthday = inputs[3];
        birthPlace = inputs[4];
        workPlace = inputs[5];
    }

    @Override
    public String toString() {
        return "person-head:{national code: " + nationalCode + ", first name: " + firstName + ", last name: " + lastName
                + ", birthday: " + birthday + ", birth place: " + birthPlace + ", work place: " + workPlace + "}";
    }

    public Object getWorkPlace() {
        return workPlace;
    }
}
