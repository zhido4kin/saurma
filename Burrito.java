public class Burrito extends Saurma {
    private String salsa;
    public Burrito(String cheese, String meat, String greenery, String souce, String tomato, String oregano, String salsa, String s) {
        super(cheese, meat, greenery, souce, tomato,oregano,salsa);
        this.salsa = salsa;
    } public String printInfo() {
        return "cheese - " + this.getCheese() + "\nmeat - " + this.getMeat() + "\ngreenery - " + this.getGreenery() + "\nsouce - " + this.getSouce() + "\ntomato - " + this.getTomato() + "\noregano - " + this.getOregano() + "\nsalsa - " + this.salsa; } }