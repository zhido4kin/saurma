public class Kebab extends Saurma {
    private String bread;
    private String bacon;
    public Kebab(String cheese, String meat, String pickle, String souce, String tomato, String oregano, String bread) {
        super(cheese, meat,pickle, souce, tomato, oregano,bread);
        this.bread = bread; this.bacon = bacon;
    }
    public String printInfo(){
        return("cheese - " + getCheese() + "\n" + "meat - " + getMeat() + "\n" + "pickle - " +getPickle() + "\n" + "souce - " + getSouce() + "\n" + "tomato - " + getTomato() + "\n" + "oregano - " +getOregano() + "\n"+ "greenery - "+getGreenery() + "\n" + "bread - " + bread + "\n" + "bacon - " + bacon + "\n"); } }