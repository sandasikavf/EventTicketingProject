/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventticketing.Models;

import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author Adhay
 */
public class FoodEvent extends Event {

    String cuisine;

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public String getCuisine() {
        return cuisine;
    }

    public FoodEvent() {

    }

    public FoodEvent(int id, String name, Date date, Time time, String location, String description, String type, String cuisine) {
        super.setId(id);
        super.setName(name);
        super.setDate(date);
        super.setTime(time);
        super.setLocation(location);
        super.setDescription(description);
        super.setType(type);
        this.cuisine = cuisine;
    }

    public FoodEvent(String name, Date date, Time time, String location, String description) {
        super.setName(name);
        super.setDate(date);
        super.setTime(time);
        super.setLocation(location);
        super.setDescription(description);

    }

    public String toString() {
        String details = ("Name: " + getName() + "\nDate: " + getDate() + "\nTime: " + getTime()
                + "\nLocation: " + getLocation() + "\nCuisine: " + cuisine + "\nDescirption: " + getDescription());
        return details;
    }
}
