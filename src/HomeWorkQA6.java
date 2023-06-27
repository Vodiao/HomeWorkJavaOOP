public class HomeWorkQA6 {
    public static void main(String[] args) {

        Car bmw = new Car("TwinPower Turbo Inline-6", "machine", 4, false);
        Car mercedes = new Car("M178", "machine", 4, false);

        System.out.println("Bmw : " + bmw);
        System.out.println("Mercedes : " + mercedes);

        System.out.println();

        System.out.println("Are the cars equal in transmission? " + bmw.equals(mercedes));
    }
}