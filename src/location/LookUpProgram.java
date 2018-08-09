package location;


import java.math.BigInteger;
import java.net.InetAddress;
import java.net.UnknownHostException;
import com.maxmind.geoip.LookupService;
import java.io.IOException;
import java.net.InetAddress;
import com.maxmind.geoip.Location;

public class LookUpProgram {

    public static void findLocation(String args ) throws UnknownHostException {

        long ipAddress = new BigInteger(InetAddress.getByName("122.175.165.159").getAddress()).longValue();

       // System.out.println("By String IP address: \n" +
              //.getLocation("122.175.165.159"));

        //System.out.println("By long IP address: \n" +
         //      GeoIPv4.getLocation("122.175.165.159"));

        //System.out.println("By InetAddress IP address: \n" +
           //     GeoIPv4.getLocation(InetAddress.getByName("72.229.28.185")));

    }
    
}
class GeoIPv4 {

    private static LookupService lookUp;

    static {
        try {
            lookUp = new LookupService(
                    GeoIPv4.class.getResource("./GeoLiteCity.dat").getFile(),
                    LookupService.GEOIP_MEMORY_CACHE);

            System.out.println("GeoIP Database loaded: " + lookUp.getDatabaseInfo());
        } catch (IOException e) {
            System.out.println("Could not load geo ip database: " + e.getMessage());
        }
    }

    public static GeoLocation getLocation(String ipAddress) {
        return GeoLocation.map(lookUp.getLocation(ipAddress));
    }

    public static GeoLocation getLocation(long ipAddress){
        return GeoLocation.map(lookUp.getLocation(ipAddress));
    }

    public static GeoLocation getLocation(InetAddress ipAddress){
        return GeoLocation.map(lookUp.getLocation(ipAddress));
    }
}
 class GeoLocation {

    private String countryCode;
    private String countryName;
    private String postalCode;
    private String city;
    private String region;
    private int areaCode;
    private int dmaCode;
    private int metroCode;
    private float latitude;
    private float longitude;

    public GeoLocation(String countryCode, String countryName, String postalCode, String city, String region,
                       int areaCode, int dmaCode, int metroCode, float latitude, float longitude) {
        this.countryCode = countryCode;
        this.countryName = countryName;
        this.postalCode = postalCode;
        this.city = city;
        this.region = region;
        this.areaCode = areaCode;
        this.dmaCode = dmaCode;
        this.metroCode = metroCode;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    // -- getters ommitted

    public static GeoLocation map(Location loc){
        return new GeoLocation(loc.countryCode, loc.countryName, loc.postalCode, loc.city, loc.region,
                loc.area_code, loc.dma_code, loc.metro_code, loc.latitude, loc.longitude);
    }

    @Override
    public String toString() {
        return "GeoLocation{" +
                "countryCode='" + countryCode + '\'' +
                ", countryName='" + countryName + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", city='" + city + '\'' +
                ", region='" + region + '\'' +
                ", areaCode=" + areaCode +
                ", dmaCode=" + dmaCode +
                ", metroCode=" + metroCode +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}