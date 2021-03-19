package sn.isi.entities;

import java.util.ArrayList;
import java.util.List;

public class Rn {
    private String nom;
    private  Integer id;
    private List<Zone>  zones;
    private Double latitude;
    private Double longitude ;
    // Constructeur


    public Rn(String nom, Integer id, List<Zone> zones, Double latitude, Double longitude) {
        this.nom = nom;
        this.id = id;
        this.zones = zones;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Rn() {
        super();
    }
    //getters stters


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Zone> getZones() {
        return zones;
    }

    public void setZones(List<Zone> zones) {
        this.zones = zones;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }
}
