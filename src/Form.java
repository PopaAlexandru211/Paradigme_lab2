public class Form {
    public String color;
    Form(){
        color="white";
    }
    Form(String color){
        this.color=color;
    }
    public float getArea(){
        return 0;
    }
    public String toString(){
        return "This form has the color: "+color;
    }
}
