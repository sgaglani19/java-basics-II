public class Person {
    private int ssn;
    private byte age;
    private String firstName;
    private String lastName;

    public Person(){

    }

    public Person(String firstName, String lastName, Byte age, Integer ssn){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.ssn = ssn;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public Byte getAge(){
        return this.age;
    }

    public Integer getSSN(){
        return this.ssn;
    }
}
