import java.util.Scanner;
import musical.ReprodutorMusical;
import telefone.Telefone;

public class Iphone {
    public static void main(String[] args) throws Exception {
        while(true){
            Scanner terminal = new Scanner(System.in);
            try{
                System.out.println("Acessando as opções do smartphone: \n1- Acessar Reprodutor Musical\n2- Telefônico");
                int opcao = terminal.nextInt();
                switch (opcao) {
                    case 1:
                        ReprodutorMusical rm = new ReprodutorMusical();
                        System.out.println("1 - Selecionar Musica \n2-tocar aleatório\n3-pausar");    
                        int opcaoMusica = terminal.nextInt();
                        switch (opcaoMusica) {
                            case 1:
                                System.out.println();
                                rm.selecionarMusica();
                                break;
                            case 2:
                                rm.tocar();
                                break;
                            case 3:
                                rm.pausar();
                                break;
                            default:
                                throw new AssertionError();
                        }
                        break;
                    case 2:
                    Telefone tl = new Telefone();
                        System.out.println("1- Ligar \n2- Atender \n3- Iniciar CorrerioVoz");
                        int opcaoTelefonico = terminal.nextInt();
                        switch (opcaoTelefonico) {
                            case 1:
                                
                                break;
                            case 2:
                                
                                break;
                            case 3:
                                
                                break;
                            default:
                                throw new AssertionError();
                        }
                        break;
                    default:
                        throw new AssertionError();
                }
            }catch(Exception e){
                System.err.println("Erro na selecao");
            }finally {
                terminal.close(); 
            }
        }
    }
}
