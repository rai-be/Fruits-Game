import java.util.Random;

public enum Fruits {

    UVA("Uva", 30),
    MORANGO("Morango", 20),
    BANANA("Banana", 10);

    private final String fruit;
    private final int value;

    Fruits(String fruit, int value) {
        this.fruit = fruit;
        this.value = value;
    }

    public static Fruits obterFrutaAleatoria() {
        Fruits[] frutas = values();
        Random random = new Random();
        int indiceAleatorio = random.nextInt(frutas.length);
        return frutas[indiceAleatorio];
    }

    public String getFruit() {
        return fruit;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return fruit;
    }
}
