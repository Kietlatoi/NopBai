/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author toila
 */
public class Hotel {
    private String hotelID,name,location,avaliableRooms, amenities, pricing;

    public Hotel(String hotelID, String name, String location, String avaliableRooms, String amenities, String pricing) {
        this.hotelID = hotelID;
        this.name = name;
        this.location = location;
        this.avaliableRooms = avaliableRooms;
        this.amenities = amenities;
        this.pricing = pricing;
    }

    public String getHotelID() {
        return hotelID;
    }

    public void setHotelID(String hotelID) {
        this.hotelID = hotelID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAvaliableRooms() {
        return avaliableRooms;
    }

    public void setAvaliableRooms(String avaliableRooms) {
        this.avaliableRooms = avaliableRooms;
    }

    public String getAmenities() {
        return amenities;
    }

    public void setAmenities(String amenities) {
        this.amenities = amenities;
    }

    public String getPricing() {
        return pricing;
    }

    public void setPricing(String pricing) {
        this.pricing = pricing;
    }

    @Override
    public String toString() {
        return "Hotel{" + "hotelID=" + hotelID + ", name=" + name + ", location=" + location + ", avaliableRooms=" + avaliableRooms + ", amenities=" + amenities + ", pricing=" + pricing + '}';
    }
    
    
}
