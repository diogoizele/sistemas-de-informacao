import java.math.BigInteger;

public class Baralho {

    public final static String[] NAIPES = {"Ouro", "Paus", "Copas", "Espadas"};
    public final static int CARTAS_POR_NAIPE = 13;
    public final static int TOTAL_DE_CARTAS = CARTAS_POR_NAIPE * NAIPES.length;
    public final static int PRINCIPE = 10;
    public final static int RAINHA = 11;
    public final static int REI = 12;
    public final static int UM = 1;

    Carta cartas[] = new Carta[TOTAL_DE_CARTAS];

    public Baralho() {
        int primeiraCartaDoNaipe = 0;

        for (int i = 0; i < NAIPES.length; i++) {
            for (int j = primeiraCartaDoNaipe; j < (primeiraCartaDoNaipe + CARTAS_POR_NAIPE); j++) {
                int posicao = j + UM - primeiraCartaDoNaipe;

                if ((j + CARTAS_POR_NAIPE) % CARTAS_POR_NAIPE == 0)
                    cartas[j] = new Carta("Ás", NAIPES[i]);
                else if (posicao == PRINCIPE)
                    cartas[j] = new Carta("Príncipe", NAIPES[i]);
                else if (posicao == RAINHA)
                    cartas[j] = new Carta("Rainha", NAIPES[i]);
                else if (posicao == REI)
                    cartas[j] = new Carta("Rei", NAIPES[i]);
                else
                    cartas[j] = new Carta(String.valueOf(posicao), NAIPES[i]);
            }

            primeiraCartaDoNaipe += CARTAS_POR_NAIPE;
        }
    }


    public void imprimeBaralho() {
        String str = "Baralho: \n";
        int primeiraCartaDoNaipe = 0;

        for (int i = 0; i < NAIPES.length; i++) {
            str += NAIPES[i] + ":\n";
            for (int j = primeiraCartaDoNaipe; j < (CARTAS_POR_NAIPE + primeiraCartaDoNaipe); j++) {
                if (cartas[j] != null)
                    if ((j + 1) % CARTAS_POR_NAIPE == 0)
                        str += "\n";
                    else
                        str += cartas[j].getNome() + ", ";
            }

            primeiraCartaDoNaipe += CARTAS_POR_NAIPE;
        }
        System.out.println(str);
    }
}
