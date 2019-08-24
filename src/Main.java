public class Main {

    public static void main(String[] args) {
        Fourth fourth = new Fourth("Circle");
        Fourth fourth1 = new Fourth("Square");
        Fourth fourth2 = new Fourth("Triangle");

        Second objectA = new Second("A", Fifth.SIXTH, fourth, 21);
        Third objectB = new Third("B",Fifth.SEVENTH, fourth1, 22, 2);
        Third objectC = new Third("C", Fifth.EIGHTH, fourth2, 22, 3);

        objectA.sayIt();
        objectB.sayIt();
        objectC.sayIt();

        System.out.println(objectB.getInfo());

        objectB.copyParameters(objectC);

        System.out.println(objectA.getInfo());
        System.out.println(objectB.getInfo());
        System.out.println(objectC.getInfo());
    }
}
