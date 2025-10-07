public class SimplePart implements CarPart {
    private final String name;
    private final int weight;
    private static int total = 0;

    public SimplePart(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getWeight() {
        total += weight;
        System.out.println("Somando agora o peso de " + name + ": " + weight + ". Total parcial: " + total);
        return weight;
    }
}
