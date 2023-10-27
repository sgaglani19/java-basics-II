import java.util.ArrayList;
public class Table implements Billable {
    private Integer width;
    private Integer length;
    private ArrayList<Leg> legs = new ArrayList<>();
    
    public Table(Integer width, Integer length, Integer numLegs, Leg leg){
        for(int i = 0; i < numLegs; i++){
            legs.add(new Leg(leg.getLength()));
        }
    }
    public Float getPrice(){
        float price = 1;
        float cost = (this.width * this.length) * price;

        return cost;
    }
}
