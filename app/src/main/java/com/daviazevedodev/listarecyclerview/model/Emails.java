package com.daviazevedodev.listarecyclerview.model;

import java.util.Arrays;
import java.util.List;

public class Emails {
    public static List<Email> fakeEmails() {
        return Arrays.asList(
                Email.EmailBuilder.builder()
                        .setUser("Facebook")
                        .setSubject("Veja as nossas 3 dicas")
                        .setPreview("Recomendamos este site para você")
                        .setDate("25 Sept")
                        .build(),

                Email.EmailBuilder.builder()
                        .setUser("Instagram")
                        .setSubject("Como tirar fotos bonitas ?")
                        .setPreview("Recomendamos este tutorial para você")
                        .setDate("25 Sept")
                        .setUnread(true)
                        .build(),

                Email.EmailBuilder.builder()
                        .setUser("League of Legends")
                        .setSubject("Você foi banido por até 3015")
                        .setPreview("Recomendamos que você pare de jogar este jogo")
                        .setDate("19 Out")
                        .setUnread(true)
                        .build(),

                Email.EmailBuilder.builder()
                        .setUser("Spotify")
                        .setSubject("Você foi banido por até 3015")
                        .setPreview("Recomendamos que você pare de jogar este jogo")
                        .setDate("19 Out")
                        .setUnread(true)
                        .build(),

                Email.EmailBuilder.builder()
                        .setUser("SPC e SERASA")
                        .setSubject("Você foi banido por até 3015")
                        .setPreview("Recomendamos que você pare de jogar este jogo")
                        .setDate("19 Out")
                        .setUnread(true)
                        .build(),

                Email.EmailBuilder.builder()
                        .setUser("Tidal")
                        .setSubject("Você foi banido por até 3015")
                        .setPreview("Recomendamos que você pare de jogar este jogo")
                        .setDate("19 Out")
                        .setUnread(true)
                        .build(),

                Email.EmailBuilder.builder()
                        .setUser("Youtube")
                        .setSubject("Você foi banido por até 3015")
                        .setPreview("Recomendamos que você pare de jogar este jogo")
                        .setDate("19 Out")
                        .setUnread(true)
                        .build(),

                Email.EmailBuilder.builder()
                        .setUser("Caixa")
                        .setSubject("Você foi banido por até 3015")
                        .setPreview("Recomendamos que você pare de jogar este jogo")
                        .setDate("19 Out")
                        .setUnread(true)
                        .build(),

                Email.EmailBuilder.builder()
                        .setUser("Twitter")
                        .setSubject("Você foi banido por até 3015")
                        .setPreview("Recomendamos que você pare de jogar este jogo")
                        .setDate("19 Out")
                        .setUnread(true)
                        .build(),

                Email.EmailBuilder.builder()
                        .setUser("Pokemon GO")
                        .setSubject("Você foi banido por até 3015")
                        .setPreview("Recomendamos que você pare de jogar este jogo")
                        .setDate("19 Out")
                        .setUnread(true)
                        .build(),

                Email.EmailBuilder.builder()
                        .setUser("Faculdade UFRJ")
                        .setSubject("Você foi banido por até 3015")
                        .setPreview("Recomendamos que você pare de jogar este jogo")
                        .setDate("19 Out")
                        .setUnread(true)
                        .build(),

                Email.EmailBuilder.builder()
                        .setUser("Casas Bahia")
                        .setSubject("Você foi banido por até 3015")
                        .setPreview("Recomendamos que você pare de jogar este jogo")
                        .setDate("19 Out")
                        .setUnread(true)
                        .build(),

                Email.EmailBuilder.builder()
                        .setUser("Itaú")
                        .setSubject("Você foi banido por até 3015")
                        .setPreview("Recomendamos que você pare de jogar este jogo")
                        .setDate("19 Out")
                        .setUnread(true)
                        .build(),

                Email.EmailBuilder.builder()
                        .setUser("Empregos.io")
                        .setSubject("Você foi banido por até 3015")
                        .setPreview("Recomendamos que você pare de jogar este jogo")
                        .setDate("19 Out")
                        .setUnread(true)
                        .build()
        );
    }
}
