public final class Printed_T_shirts extends Shirt{
    private Print print;

    public Print getPrint() {
        return print;
    }

    public Printed_T_shirts(int weight, String color, int area, int size, EnumMaterial enumMaterial, Print print) {
        super(weight, color, area, size, enumMaterial);
        this.print = print;
    }

    @Override
    public String getInfo1() {
        return super.getInfo1() + "\nSIZE: " + print.getSize() +
                "\nPRICE: " + print.getPrice();
    }
}
