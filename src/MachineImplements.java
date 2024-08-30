import java.util.ArrayList;

public class MachineImplements implements Machine {

    private ArrayList<Fruits> listaDeFrutasAleatorias = new ArrayList<>();
    private int totalPontos = 0;

    @Override
    public String getRandomFruits() {
        listaDeFrutasAleatorias.clear();
        totalPontos = 0;


        for (int index = 0; index < 3; index++) {
            Fruits frutaAleatoria = Fruits.obterFrutaAleatoria();
            listaDeFrutasAleatorias.add(frutaAleatoria);
            totalPontos += frutaAleatoria.getValue();
        }

        String resultado = "";
        for (int index = 0; index < listaDeFrutasAleatorias.size(); index++) {
            resultado += listaDeFrutasAleatorias.get(index);
            if (index < listaDeFrutasAleatorias.size() - 1) {
                resultado += " | ";
            }
        }


        resultado += " \nTotal: " + totalPontos + " pontos.";

        return resultado;
    }


    @Override
    public int getTotalPoints() {
        return totalPontos;
    }
}
