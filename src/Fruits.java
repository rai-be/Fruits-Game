import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public enum Fruits {

     UVA("Uva", 30, "nivel 1"),
     MORANGO("Morango", 20, "nivel 1"),
     BANANA("Banana", 10, "nivel 1"),
    JABOTICABACA ("Jaboticaba", 15, "nivel 2"),
    MAÇA ("kiwi", 36, "nivel 2"),
    MELANCIA ("Melancia", 27, "nivel 2");

    private final String fruit;
    private final int value;
    private final String nivel;

    private static final Random RANDOM = new Random();


    Fruits(String fruit, int value, String nivel) {
        this.fruit = fruit;
        this.value = value;
        this.nivel = nivel;
    }

    public String getFruit() {
        return fruit;
    }

    public int getValue() {
        return value;
    }
    public String getNiveis(){
        return nivel;
    }

    public static Fruits obterFrutaAleatoria(String categoria) {
        List<Fruits> frutasniveis = new ArrayList<>();
        for (Fruits fruta : values()){
            if (fruta.getNiveis().equals(categoria)) {
                frutasniveis.add(fruta);
            }
        }
         if (frutasniveis.isEmpty()){
         throw new RuntimeException("nivel não encontrado: " + categoria);
         }
        int indiceAleatorio = RANDOM.nextInt(frutasniveis.size());
        return frutasniveis.get(indiceAleatorio);
    }

    @Override
    public String toString() {
        return fruit;
    }
}
