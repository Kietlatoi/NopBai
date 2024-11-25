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
public class Tour {
   private String TourID,name,destination,duration,description;
   private int price;

    public Tour(String TourID, String name, String destination, String duration, String description, int price) {
        this.TourID = TourID;
        this.name = name;
        this.destination = destination;
        this.duration = duration;
        this.description = description;
        this.price = price;
    }

    public String getTourID() {
        return TourID;
    }

    public void setTourID(String TourID) {
        this.TourID = TourID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Tour{" + "TourID=" + TourID + ", name=" + name + ", destination=" + destination + ", duration=" + duration + ", description=" + description + ", price=" + price + '}';
    }
   
            
}
