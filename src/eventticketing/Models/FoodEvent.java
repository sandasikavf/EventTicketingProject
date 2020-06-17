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

    public FoodEvent() {

    }

    public String getCuisine() {
        return cuisine;
    }
    
    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public FoodEvent(String name, Date date, Time time, String location, String description, String cuisine) {
        super.setName(name);
        super.setDate(date);
        super.setTime(time);
        super.setLocation(location);
        super.setDescription(description);
        this.cuisine = cuisine;
    }

    
    
    public FoodEvent(String name, Date date, Time time, String location, String description){
        super.setName(name);
        super.setDate(date);
        super.setTime(time);
        super.setLocation(location);
        super.setDescription(description);
    }

//    public String toString() {
//        return name + ", " + date + ", " + time + ", " + cuisine + ", ";
//    }
}