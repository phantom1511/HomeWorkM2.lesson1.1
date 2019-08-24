public class Third extends Second {
    private int type;


    public Third(String name, Fifth fifth, Fourth fourth, int age, int type) {
        super(name, fifth, fourth, age);
        this.type = type;
    }

    public int getType() {
        return type;
    }

    @Override
    public void sayIt(){
        System.out.println("No, i said it!");
    }

    public String getInfo(){
        return super.getInfo()+"\nType: "+ getType();
    }

}
