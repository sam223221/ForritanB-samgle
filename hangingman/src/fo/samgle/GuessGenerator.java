package fo.samgle;

import java.util.Random;

public class GuessGenerator {
    public String GenerateGuess() {
        String[] listOfGuesses = {"Tórshavn", "Klaksvík", "Hoyvík", "Argir", "Fuglafjørður", "Vágur", "Vestmanna",
                "Tvøroyri", "Miðvágur", "Sørvágur", "Saltangará", "Leirvík", "Sandavágur", "Toftir", "Strendur",
                "Kollafjørður", "Skáli", "Eiði", "Hvalba", "Norðragøta", "Sandur", "Skopun", "Runavík", "Trongisvágur",
                "Syðrugøta", "Kvívík", "Viðareiði", "Søldarfjørður", "Porkeri", "Hósvík", "Norðskáli", "Nes",
                "Rituvík", "Hvannasund", "Sumba", "Nólsoy", "Kaldbak", "Hvalvík", "Streymnes", "Norðdepil", "Velbastaður",
                "Skálavík", "Oyndarfjørður", "Oyri", "Saltnes", "Haldarsvík", "Signabøur", "Lambi", "Froðba", "Hov",
                "Leynar", "Oyrarbakki", "Æðuvík", "Fámjin", "Skálabotnur", "Sandvík", "Hvítanes", "Norðoyri", "Lopra",
                "Kunoy", "Húsavík", "Haraldssund", "Funningur", "Kirkjubøur", "Innan_Glyvur", "Tjørnuvík",
                "Bøur", "Øravíkarlíð", "Selatrað", "Vatnsoyrar", "Funningsfjørður", "Skipanes", "Árnafjørður", "Válur",
                "Húsar", "Skúvoy", "Gøtugjógv", "Oyrareingir", "Dalur", "Gjógv", "Svínoy", "Mikladalur", "Kolbanargjógv",
                "Langasandur", "Stykkið", "Øravík", "Gøtueiði", "Hestur", "Ljósá", "Svínáir", "Akrar", "Elduvík",
                "Morskranes", "Kirkja", "Saksun", "Gásadalur", "Trøllanes", "Hellur", "Mykines", "Hattarvík", "Norðradalur",
                "Ánir", "Skælingur", "Lambareiði", "Kaldbaksbotnur", "Stóra_Dímun",
                "Syðradalur", "Norðtoftir", "Skarvanes", "Sund", "Koltur", "Múli", "Depil",
                "Nesvík", "Víkarbyrgi"};
        Random r = new Random();
        Integer randomPosition = r.nextInt(listOfGuesses.length - 1);
        return listOfGuesses[randomPosition];
    }
}