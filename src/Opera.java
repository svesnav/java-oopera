public class Opera extends MusicalShow {
    private int choirSize;
    private Person musicAuthor;

    public Opera(String title, int duration, Director director, Person musicAuthor, String librettoText, int choirSize) {
        super(title, duration, director, musicAuthor, librettoText);
        this.choirSize = choirSize;
        this.musicAuthor = musicAuthor;
    }


}