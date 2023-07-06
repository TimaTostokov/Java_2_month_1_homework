public class Main {
    public static void main(String[] args) {
        Print print = new Print("XL",1999);
        Print print2 = new Print("XXL",4990);
        Shirt objectA = new Shirt(50,"Red",28,54,EnumMaterial.COTTON);
        Printed_T_shirts objectB = new Printed_T_shirts(objectA.getWeight(),objectA.getColor(),objectA.getArea(),objectA.getSize(),
                objectA.getEnumMaterial(),print);
        Printed_T_shirts objectC = new Printed_T_shirts(objectA.getWeight(),objectA.getColor(),objectA.getArea(),objectA.getSize(),
                objectA.getEnumMaterial(),print2);
        System.out.println(objectA.getInfo1());
        System.out.println("------------------------");
        System.out.println(objectA.getInfo2());
        System.out.println("------------------------");
        System.out.println(objectB.getInfo1());
        System.out.println("------------------------");
        System.out.println(objectC.getInfo1());
    }
}