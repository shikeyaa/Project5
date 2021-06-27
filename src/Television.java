public class Television extends ServiceCommunicator {

    public String television;
    public String serviceURL;

    public Television(String serviceURL, String television) {
        super(serviceURL);
        this.serviceURL = serviceURL;
        this.television = television;
    }

    public String getTelevision() {
        return this.serviceURL + this.television;
    }

    public static void main(String[] args) {
       // Television t = new Television("http://api.tvmaze.com/singlesearch/shows?q=MANIFEST", "Manifest");


        System.out.println(new Television("http://api.tvmaze.com/singlesearch/shows?q=MANIFEST", "Manifest").get());
    }
}

