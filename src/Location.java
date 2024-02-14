public class Location {

    Rule alpha;
    boolean left;
    String position;

    public Location(Rule alpha, boolean left, String position) {
        this.alpha = alpha;
        this.left = left;
        this.position = position;
    }

    public String write(){
        return "(" + alpha.write() + ", " + (left ? "L" : "R") + ", " + position + ")" ;
    }


    //GETTERS AND SETTERS
    public Rule getAlpha() {
        return alpha;
    }

    public void setAlpha(Rule alpha) {
        this.alpha = alpha;
    }

    public boolean isLeft() {
        return left;
    }

    public void setLeft(boolean left) {
        this.left = left;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
