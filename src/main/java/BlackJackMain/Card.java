package BlackJackMain;

public class Card {
    String couleur;
    String name;
    int value;
    String imagePath;
    public Card(String suit, String name, int value) {
        this.couleur = suit;
        this.name = name;
        this.value = value;
        this.imagePath = imagePath;
    }public String getCouleur() {
        return this.couleur;
    }public String getName() {
        return this.name;
    }public int getValue() {
        return this.value;
    }public String getImagePath() {
        return this.imagePath;
    }
}
