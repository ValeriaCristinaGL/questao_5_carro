import java.util.ArrayList;
import java.util.List;

public class CompositePart implements CarPart {
    private final String name;
    private final List<CarPart> parts = new ArrayList<>();

    public CompositePart(String name) {
        this.name = name;
    }

    public void addPart(CarPart part) {
        parts.add(part);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getWeight() {
        int sum = 0;
        for (CarPart part : parts) {
            sum += part.getWeight();
        }
        return sum;
    }
}

