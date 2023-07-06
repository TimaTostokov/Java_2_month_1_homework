public class Shirt extends Clothes{

    private EnumMaterial enumMaterial;
    private int size;
    public Shirt(int weight, String color, int area,int size,EnumMaterial enumMaterial) {
        super(weight, color, area);
        this.size = size;
        this.enumMaterial = enumMaterial;
    }

    public EnumMaterial getEnumMaterial() {
        return enumMaterial;
    }

    public int getSize() {
        return size;
    }
    public String getInfo1(){
        return "WEIGHT (gramm): " + getWeight() +
                "\nCOLOR: " + getColor() +
                "\nAREA: " + getArea() +
                "\nSIZE: " + size +
                "\nMATERIAL: " + enumMaterial;
    }
    public final String getInfo2(){
        return "SIZE: " + size +
                "\nMATERIAL: " + enumMaterial;
    }
}
