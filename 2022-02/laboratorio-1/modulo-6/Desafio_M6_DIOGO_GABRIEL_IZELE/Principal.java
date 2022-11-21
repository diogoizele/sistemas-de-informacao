import java.util.Scanner;

public class Principal {
    
    public final static int PUBLICA = 1;
    public final static int PRIVADA = 2;
    
    public static void main(String[] args) {
        
        int quantidadeUniversidades, tipo, indicador;
        String menu;
        Universidade universidades[];
        Mec mec = new Mec();
        
        menu = "Que tipo de universidade voce deseja cadastrar?\n1- Publica\n2- Privada\n";
        quantidadeUniversidades = Teclado.leInt("Digite a quantidade de universidades que deseja cadastrar: ");
        universidades = new Universidade[quantidadeUniversidades];
        
        for (int i = 0; i < quantidadeUniversidades; i++) {
            System.out.println("\nCadastro da universidade (" + (i + 1) + ")" );
            tipo = Teclado.leInt(menu);
            
            while (tipo != PUBLICA && tipo != PRIVADA) {
                System.out.println("Opcao Invalida! Por favor digite uma opcao Valida!\n");
                tipo = Teclado.leInt(menu);
            }
            
            indicador = i + 1;
            
            if (tipo == PUBLICA) {
                System.out.println("Tipo escolhido - Publica");
                universidades[i] = new Publica(
                    Teclado.leString("Qual o nome da " + indicador + "ª universidade: "),
                    Teclado.leInt("Qual a quantidade de alunos da " + indicador + "ª universidade: "),
                    Teclado.leInt("Qual a quantidade de professores da " + indicador + "ª universidade: "),
                    Teclado.leString("Em que estado esta a " + indicador + "ª universidade: "),
                    Teclado.leString("Em qual cidade esta a " + indicador + "ª universidade: ")
                );
            } else { 
                System.out.println("Tipo escolhido - Privada");
                universidades[i] = new Privada(
                    Teclado.leString("Qual o nome da " + indicador + "ª universidade: "),
                    Teclado.leInt("Qual a quantidade de alunos da " + indicador + "ª universidade: "),
                    Teclado.leInt("Qual a quantidade de professores da " + indicador + "ª universidade: "),
                    Teclado.leDouble("Qual o valor da mensalidade da " + indicador + "ª universidade: ")
                );
            }
        }
        
        mec.imprimeUniversidades(universidades);
        mec.maisCara(universidades);
        mec.universidadesDoSul(universidades);
    }
}