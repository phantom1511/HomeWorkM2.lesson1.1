public class Second extends First {
    private int age;

    public Second(String name, Fifth fifth, Fourth fourth, int age) {
        super(name, fifth, fourth);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public final void count(){
        System.out.println("Counting");
    }

    public void count(String count){
        System.out.println(count);
    }

    public String getInfo(){
        return super.getInfo()+ "\nAge: " + getAge();
    }
}
