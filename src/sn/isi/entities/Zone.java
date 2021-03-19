package sn.isi.entities;

public class Zone {
    private Integer id;
    private String nom;
    private Double latitude;
    private  Double longitude;

    // constructeurs sans arguments
    public Zone (){
        super();
    }

    public Zone(Integer id, String nom, Double latitude, Double longitude) {
        this.id = id;
        this.nom = nom;
        this.latitude = latitude;
        this.longitude = longitude;
    }

// getters and setters


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
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
