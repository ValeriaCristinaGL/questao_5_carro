public class Main {
    public static void main(String[] args) {
        // Carroceria
        CompositePart carroceria = new CompositePart("Carroceria");
        carroceria.addPart(new SimplePart("Para-lamas", 15));
        carroceria.addPart(new SimplePart("Portas", 40));
        carroceria.addPart(new SimplePart("Painéis", 25));
        carroceria.addPart(new SimplePart("Porta-malas", 30));
        carroceria.addPart(new SimplePart("Capô", 20));

        // Trem de força
        CompositePart tremDeForca = new CompositePart("Trem de força");
        tremDeForca.addPart(new SimplePart("Motor", 150));
        tremDeForca.addPart(new SimplePart("Transmissão", 80));
        tremDeForca.addPart(new SimplePart("Diferencial", 60));
        tremDeForca.addPart(new SimplePart("Rodas", 50));

        // Chassi
        CompositePart chassi = new CompositePart("Chassi");
        chassi.addPart(tremDeForca);
        chassi.addPart(new SimplePart("Suspensão", 70));

        // Carro completo
        CompositePart carro = new CompositePart("Carro");
        carro.addPart(carroceria);
        carro.addPart(chassi);

        System.out.println("\nPeso total do carro: " + carro.getWeight() + " kg");
    }
}
