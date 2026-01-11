public class MusicalShow extends Show {
    protected Person musicAuthor;
    protected String librettoText;
    private String title;

    public MusicalShow(String title, int duration, Director director, Person musicAuthor, String librettoText) {
        super(title, duration, director);
        this.title = title;
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public void printLibretto() {
        System.out.println("Текст либретто для спектакля '" + title + "':");
        System.out.println(librettoText);
        System.out.println();
    }

}