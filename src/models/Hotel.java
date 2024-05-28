package models;

/**
 *
 * @author William
 */
public class Hotel {
    private int code;
    private String name;
    private String city;
    private String address;
    private int rating;
    private float priceNight;
    private String amenities;
    private String cancellationPolicy;

    public Hotel(int code) {
        this.code = code;
    }

    public Hotel(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public Hotel(int code, String name, String city, String address, int rating, float priceNight, String amenities, String cancellationPolicy) {
        this.code = code;
        this.name = name;
        this.city = city;
        this.address = address;
        this.rating = rating;
        this.priceNight = priceNight;
        this.amenities = amenities;
        this.cancellationPolicy = cancellationPolicy;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public float getPriceNight() {
        return priceNight;
    }

    public void setPriceNight(float priceNight) {
        this.priceNight = priceNight;
    }

    public String getAmenities() {
        return amenities;
    }

    public void setAmenities(String amenities) {
        this.amenities = amenities;
    }

    public String getCancellationPolicy() {
        return cancellationPolicy;
    }

    public void setCancellationPolicy(String cancellationPolicy) {
        this.cancellationPolicy = cancellationPolicy;
    }
    
    @Override
    public String toString(){
        return name;
    }

}
