public class Musica extends ServiceCommunicator {

    public String musica;
    public String serviceURL;

    public Musica(String serviceURL, String musica) {
        super(serviceURL);
        this.serviceURL = serviceURL;
        this.musica = musica;
    }

    public String getMusica() {
        return this.serviceURL + this.musica;
    }

    public static void main(String[] args) {
        Musica m = new Musica("https://itunes.apple.com/search?term=BEYONCE&limit=1", "Beyonce");


        System.out.println(m.getMusica());
    }
}

