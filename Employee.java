public class Employee extends Person {
    private int salary;
    
    public Employee(int salary, Person person){
        super(person.getFirstName(),person.getLastName(),person.getAge(),person.getSSN());
        this.salary = salary;
    }

    public void speak(){
        System.out.println("Employee name: " + super.getFirstName() + " " + super.getLastName() + ", Employee Salary: " + getSalary() );
    }

    public int getSalary(){
        return this.salary;
    }
}
