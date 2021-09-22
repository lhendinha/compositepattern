public class Main {
    public static void main(String[] args) {
        Shape octagon = new Octagon();
        Shape pentagon = new Pentagon();

        Drawing drawing = new Drawing();
        drawing.add(octagon);
        drawing.add(pentagon);

        drawing.drawShape("Purple");

        drawing.clear();

        drawing.add(pentagon);
        drawing.add(octagon);
        drawing.drawShape("Yellow");
    }
}