package com.app.mytix.domain;

import javax.persistence.*;

@Entity
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Version
    private Integer version;

    private String locationName;
    private String streetAddress;
    private String city;
    private String state;
    private String country;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Event eventId;

    //region CONSTRUCTORS
    public Location() {}
    //endregion

    //region GETTERS / SETTERS
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVersion() {
        return version;
    }
    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getLocationName() {
        return locationName;
    }
    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getStreetAddress() {
        return streetAddress;
    }
    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    public Event getEventId() {
        return eventId;
    }
    public void setEventId(Event eventId) {
        this.eventId = eventId;
    }
    //endregion
}
