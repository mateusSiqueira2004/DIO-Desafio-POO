package musical;

import java.util.Random;
import java.util.Scanner;

public class ReprodutorMusical {
    //@author: Mateus
    //Talvez eu tenha feito mais e melhor do que foi pedido, mas foi divertido :)
    //Minha playlist é boa demais >;)
    private boolean tocando = false;
    private String[] selecionaMusica = {
        "Golden Hour - JVKE", 
        "Triple Baka - HatsuneMiku", 
        "Miku - Anamanaguchi", 
        "Coffee - Beabadoobee", 
        "Revenge - XXXTENTACION", 
        "Raimu - Wisteria Arbour", 
        "Until I Found You - Stephen Sanchez", 
        "Crypt of the NecroDancer - HatsuneMiku", 
        "Oblivion - HatsuneMiku"
    };
    public void tocar() {
        if (!tocando) {
            tocando = true;
            System.out.println("Tocando música: " + selecionaMusicaAleatoria());
        } else {
            System.out.println("A música já está tocando.");
        }
    }

    public void pausar() {
        if (tocando) {
            tocando = false;
            System.out.println("Pausando a música.");
        } else {
            System.out.println("Não há música tocando para pausar.");
        }
    }
    public void selecionarMusica() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sua Lista de Músicas:");
        for (int id = 0; id < selecionaMusica.length; id++) {
            System.out.println("ID: " + (id + 1) + " - " + selecionaMusica[id]);
        }    
        System.out.println("Digite o ID da música que deseja reproduzir:");
        int idMusicaSelecionada = scanner.nextInt();
        if (idMusicaSelecionada >= 1 && idMusicaSelecionada <= selecionaMusica.length) {
            System.out.println("Reproduzindo: " + selecionaMusica[idMusicaSelecionada - 1]);
        } else {
            System.out.println("ID de música inválido.");
        }
    }

    private String selecionaMusicaAleatoria() {
        Random random = new Random();
        int idMusica = random.nextInt(selecionaMusica.length);
        return selecionaMusica[idMusica];
    }
}