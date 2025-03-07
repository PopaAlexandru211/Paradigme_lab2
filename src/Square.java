import java.awt.*;

public class Square extends Form {
    private float side;
    public Square() {
        side=0;
    }
    public Square(float side, String color) {
        this.side=side;
        this.color=color;
    }
    public float getArea(){
        return side*side;
    }
    public String toString(){
        return super.toString();
    }
    public boolean equals(Square other){
        if(side==other.side&& color==other.color){
            return true;
        }
        else return false;
    }
}
