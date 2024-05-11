import java.util.Scanner;
import musical.ReprodutorMusical;
import telefone.Telefone;

public class Iphone {
    public static void main(String[] args) throws Exception {
        while(true){
            Scanner terminal = new Scanner(System.in);
            try{
                System.out.println("Acessando as opções do smartphone: \n1- Acessar Reprodutor Musical\n2- Telefônico\n3- Navegador\n0- desligar");
                int opcao = terminal.nextInt();
                switch (opcao) {
                    case 1:
                        boolean reprodutorAtivo = true;
                        while(reprodutorAtivo){

                            ReprodutorMusical rm = new ReprodutorMusical();
                            System.out.println("1 - Selecionar Musica \n2-tocar aleatório\n3-pausar\n0- voltar");    
                            int opcaoMusica = terminal.nextInt();
                            switch (opcaoMusica) {
                                case 1:
                                    System.out.println();
                                    rm.selecionarMusica();
                                break;
                                case 2:
                                    
                                break;
                                case 3:
                                    rm.pausar();
                                break;
                                case 0:
                                    reprodutorAtivo = false;
                                    break;
                                default:
                                throw new AssertionError();
                            }
                        }
                        break;
                    case 2:
                        boolean telefoneAtivo = true;
                        while(telefoneAtivo){

                            Telefone tl = new Telefone();
                            System.out.println("1- Ligar \n2- Atender \n3- Iniciar CorrerioVoz\n0-voltar");
                            int opcaoTelefonico = terminal.nextInt();
                            switch (opcaoTelefonico) {
                                case 1:
                                    tl.ligar();
                                break;
                                case 2:
                                    tl.atender();
                                break;
                                case 3:
                                    tl.iniciarCorreioVoz();
                                break;
                                case 0:
                                    telefoneAtivo = false;
                                    break;
                                default:
                                throw new AssertionError();
                            }
                        }
                    break;
                    case 3:
                        boolean navegadorAtivo = true;
                        while(navegadorAtivo){
                            
                        }
                    break;
                    case 0:
                        System.out.println("Encerrando...");
                    return;
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
