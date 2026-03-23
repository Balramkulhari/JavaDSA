class OOPs {
    //    public static void main(String[] args) {
//        pen pen1 = new pen();
//        pen1.color = "blue";
//        pen pen2 = new pen();
//        pen2.setTip(5);
//        System.out.println(pen2.tip);
//        pen2.getlength(3);
//        System.out.println(pen2.length);
//        chullu.eat();
    //        chullu.breathr();}
//        Goat Bubika = new Goat();
//        Bubika.walk();
    public static void main(String[] args) {

        cow chullu = new cow();
        chullu.swim();
    }
}
class pen{
    String color;
    int  tip;
    int length;
    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newtip){
        tip = newtip;
    }
    void getlength(int newlength){
        length = newlength;
    }


//inheritance
}
class animal{
    String color;
    void eat(){
        System.out.println("eats ");
    }
    void breathe(){
        System.out.println("breaths");
    }
}
class cow extends animal{
    int fins;
    void swim(){
        System.out.println("swims");
    }
}
//abstract class
abstract class Animal{
    void eat(){
        System.out.println("eats");
    }
    abstract void walk();

}
class Chullu extends Animal{
    void walk(){
        System.out.println("walks on 4 legs ");
    }}
// interfaces
interface ChessPlayer{
    public void moves();
}
class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("left rigth up down");
    }
}