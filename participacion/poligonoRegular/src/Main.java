public class Main {
    public static void main(String[] args) {

        PoligonoRegular p1 = new PoligonoRegular();
        PoligonoRegular p2 = new PoligonoRegular(6, 4);
        PoligonoRegular p3 = new PoligonoRegular(10, 4, 5.6, 7.8);

        System.out.println("Poligono 1");
        System.out.println("Perimetro: " + p1.getPerimetro());
        System.out.println("Area: " + p1.getArea());

        System.out.println("Poligono 2");
        System.out.println("Perimetro: " + p2.getPerimetro());
        System.out.println("Area: " + p2.getArea());

        System.out.println("Poligono 3");
        System.out.println("Perimetro: " + p3.getPerimetro());
        System.out.println("Area: " + p3.getArea());
    }
}