import java.util.Scanner;
import musical.ReprodutorMusical;
import navegador.Navegador;
import telefone.Telefone;

public class Iphone {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        try {
            while (true) {
                liparConsole();
                boolean reprodutorAtivo = true;
                boolean telefoneAtivo = true;
                boolean navegadorAtivo = true;

                System.out.println("Acessando as opções do smartphone: \n1 - Acessar Reprodutor Musical \n2 - Telefônico \n3 - Navegador \n0 - Desligar");

                if (terminal.hasNextInt()) {
                    int opcao = terminal.nextInt();

                    switch (opcao) {
                        case 1:
                            while (reprodutorAtivo) {
                                ReprodutorMusical rm = new ReprodutorMusical();
                                
                                System.out.println("1 - Selecionar Música \n2 - Tocar Aleatório\n3 - Pausar\n0 - Voltar");

                                if (terminal.hasNextInt()) {
                                    int opcaoMusica = terminal.nextInt();

                                    switch (opcaoMusica) {
                                        case 1:
                                            rm.selecionarMusica();
                                           
                                            break;
                                        case 2:
                                            rm.tocar();
                                           
                                            break;
                                        case 3:
                                            
                                            rm.pausar();
                                           
                                            break;
                                        case 0:
                                            reprodutorAtivo = false;
                                            break;
                                        default:
                                            System.out.println("Opção inválida.");
                                            break;
                                    }
                                } else {
                                    System.out.println("Opção inválida. Tente novamente.");
                                    terminal.next(); 
                                }
                            }
                            break;

                        case 2:
                            while (telefoneAtivo) {
                                Telefone tl = new Telefone();
                                System.out.println("1 - Ligar\n2 - Atender\n3 - Iniciar Correio de Voz \n0 - Voltar");

                                if (terminal.hasNextInt()) {
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
                                            System.out.println("Opção inválida.");
                                            break;
                                    }
                                } else {
                                    System.out.println("Opção inválida. Tente novamente.");
                                    terminal.next(); 
                                }
                            }
                            break;

                        case 3:
                            while(navegadorAtivo){
                                Navegador nv = new Navegador();
                                System.out.println("1 - Exibir Pagina\n2 - Adicionar Nova Aba\n3 - Atualizar Pagina \n0 - Voltar");

                                if (terminal.hasNextInt()) {
                                    int opcaoTelefonico = terminal.nextInt();

                                    switch (opcaoTelefonico) {
                                        case 1:
                                            nv.exibirPagina();
                                            break;
                                        case 2:
                                            nv.adicionarNovaAba();
                                            break;
                                        case 3:
                                            nv.atualizarPagina();
                                            break;
                                        case 0:
                                            telefoneAtivo = false;
                                            break;
                                        default:
                                            System.out.println("Opção inválida.");
                                            break;
                                    }
                                } else {
                                    System.out.println("Opção inválida. Tente novamente.");
                                    terminal.next(); 
                                }
                            }
                            
                            break;

                        case 0:
                            System.out.println("Encerrando...");
                            return;

                        default:
                            System.out.println("Opção inválida.");
                            break;
                    }
                } else {
                    System.out.println("Opção inválida. Tente novamente.");
                    terminal.next(); 
                }
            }
        } catch (Exception e) {
            System.err.println("Erro na seleção: " + e.getMessage());
        } finally {
            terminal.close();
        }
    }

    private static void liparConsole(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}