import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        var myCat = new Cat("Gypsy");
        System.out.println(myCat.toString());

        var myLeg = new Leg(25);
        var myTable = new Table(20,10,4,myLeg);

        var person = new Person("Shriyu","Gaglani",(byte)22,2020020);
        var employee = new Employee(80000,person);
        employee.speak();

        var animals = new ArrayList<Animal>();
        var dog = new Dog();
        var lion = new Lion();
        var fox = new Fox();

        animals.add(dog);
        animals.add(lion);
        animals.add(fox);

        for(Animal a : animals){
            System.out.println(a.speak());
        }
        
    }
}
