public class ZipCode extends ServiceCommunicator {

    public String zipcode;
    public String serviceURL;

    public ZipCode(String serviceURL, String zipcode) {
        super(serviceURL);
        this.serviceURL = serviceURL;
        this.zipcode = zipcode;
    }

    public String getZipcode() {
        return this.serviceURL + this.zipcode;
    }

    public static void main(String[] args) {
        ZipCode i = new ZipCode("http://api.zippopotam.us/us/", "10011");

        System.out.println(i.getZipcode());
    }

}


