package Musicas;

public class Musics {
    private String name;
    private int year;
    private String type;
    private Compositores[] compositor;

    public Musics(String name, int year, String type,Compositores[] compositor) {

        this.name = name;
        this.year = year;
        this.type = type;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Musics{");
        sb.append("compositor=").append(compositor);
        sb.append(", name='").append(name).append('\'');
        sb.append(", year=").append(year);
        sb.append(", type='").append(type).append('\'');
        sb.append('}');

        return sb.toString();
    }
}
