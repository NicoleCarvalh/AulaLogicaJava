package Aula03;

public class Aula03_Playlist {
    public static void main(String[] args) {
        String[] playlist = {"Raul Seixas", "Kendrick Lamar", "Sabrina Carpenter", "Lana Del Rey", "Travis Scott", "Taylor Swift"};
        System.out.println("Tocando agora " + playlist[0]);
        System.out.println("Próxima: " + playlist[1]);
        System.out.println("Total de artistas " + playlist.length);
        System.out.println("Último artista da playlist: " + playlist[playlist.length - 1]);
    }
}
