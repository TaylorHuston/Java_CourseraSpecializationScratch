/**
 * Created by Taylor on 8/7/17.
 */
public class SimpleLocation {

    private double latitude;
    private double longitude;

    public SimpleLocation(double lat, double lon) {
        this.latitude = lat;
        this.longitude = lon;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public void setLatitude(double lat) {
        if (lat < -90 || lat > 90) {
            System.out.println("Illegal latitude value");
        } else {
            this.latitude = lat;
        }
    }

    public double getLongitude() {
        return this.longitude;
    }

    public void setLongitude(double lon) {
        if (lon < -180 || lon > 18-) {
            System.out.println("Illegal longitude value");
        } else {
            this.longitude = lon;
        }
    }

    public double distance(SimpleLocation other) {
        return getDist(this.latitude, this.longitude,
                other.latitude, other.longitude);
    }

}
