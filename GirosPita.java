 public class GirosPita extends Saurma {
    private String winevinegar;
    public GirosPita(String cheese, String meat, String greenery, String souce, String tomato, String oregano, String winevinegar, String s) {
        super(cheese, meat, greenery, souce, tomato,oregano,winevinegar);
        this.winevinegar = winevinegar;
    } public String printInfo() {
        return "cheese - " + this.getCheese() + "\nmeat - " + this.getMeat() + "\ngreenery - " + this.getGreenery() + "\nsouce - " + this.getSouce() + "\ntomato - " + this.getTomato() + "\noregano - " + this.getOregano() + "\nwhite wine vinegar - " + this.winevinegar; } }