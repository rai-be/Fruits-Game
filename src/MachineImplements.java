import java.util.ArrayList;

public class MachineImplements implements Machine {

    private ArrayList<Fruits> listaDeFrutasAleatorias = new ArrayList<>();
    private int totalPontos = 0;

    private String nivelPadrao = "nivel 1";

    @Override
    public String getRandomFruits(String nivel) {
        if (!nivel.equals("nivel 1") && !nivel.equals("nivel 2")) {
            return "Nivel não existe. Use 'nivel 1' ou 'nivel 2'.";
        }
        listaDeFrutasAleatorias.clear();
        totalPontos = 0;

        for (int index = 0; index < 3; index++) {
            Fruits frutaAleatoria = Fruits.obterFrutaAleatoria(nivel);
            listaDeFrutasAleatorias.add(frutaAleatoria);
            totalPontos += frutaAleatoria.getValue();
        }
        StringBuilder resultado  = new StringBuilder();
        for (int index = 0; index < listaDeFrutasAleatorias.size(); index++) {
            resultado.append(listaDeFrutasAleatorias.get(index).getFruit());
            if (index < listaDeFrutasAleatorias.size() - 1) {
                resultado.append(" | ");
            }

        }
        resultado.append(" \nTotal: ").append(totalPontos).append(" pontos.");
        return resultado.toString();
    }

}
