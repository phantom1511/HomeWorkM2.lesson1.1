import com.sun.xml.internal.ws.api.ha.StickyFeature;

public class First {
    private String name;
    private Fifth fifth;
    private Fourth fourth;

    public First(String name, Fifth fifth, Fourth fourth) {
        this.name = name;
        this.fifth = fifth;
        this.fourth = fourth;
    }

    public String getName() {
        return name;
    }

    public Fifth getFifth() {
        return fifth;
    }

    public Fourth getFourth() {
        return fourth;
    }

    public void sayIt(){
        System.out.println("I said it");
    }

    public String getInfo(){
        return "Name: " + getName()+ "\nShape: " + getFourth().getShape()+ "\nNumber: " + getFifth();
    }

    public void copyParameters(First first){
        this.name = first.getName();
    }
}
