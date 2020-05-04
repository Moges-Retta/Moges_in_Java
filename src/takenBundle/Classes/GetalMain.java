package takenBundle.Classes;

public class GetalMain {
    public static void main(String[] args) {
        Getal obj = new Getal(0);
        obj.print();
        System.out.println(obj.abs(-45));
        System.out.println(obj.som(-45));
        Getal obj2 = new Getal(10);
        obj2.print();
        System.out.println(obj2.add(45));
        System.out.println(obj2.som(1.5));
        System.out.println(obj2.som(15.625455));
        System.out.println(obj2.toDouble());
        System.out.println(obj2.toDouble());
        obj.setX(10);
        System.out.println(obj.getX());
    }
}
