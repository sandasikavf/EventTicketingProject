//This file creates the Event object.
package eventticketing.Models;

//This makes enums for a function in the EventTicketing file as there is a function which requires it.
import java.sql.Date;
import java.sql.Time;

//enum Option {
//    NAME,
//    DATE,
//    TIME,
//    TYPE
//}
public abstract class Event {

    private int id;
    private String name;
    private Date date;
    private Time time;
    private String location;
    private String description;
    private String type;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public String getType() {
        return type;
    }

    public Time getTime() {
        return time;
    }

    public String getLocation() {
        return location;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toString() {
        return name + ", " + date + ", " + time + "";
    }

    public void addDetails(int id, String name, Date date, Time time, String location, String description, String type){
        this.id = id;
        this.name = name;
        this.date = date;
        this.time = time;
        this.location = location;
        this.description = description;
        this.type = type;                

    }

}
