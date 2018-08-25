package info.telescopeworld.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by chalevina on 10/12/2017.
 */
@Entity
@Table(name = "barrel")
public class Barrel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @Column(name="NAME")
    private String name;

    @Column(name="DIAMETER_MM")
    private Double diameterMm;

    @Column(name="DIAMETER_INCH")
    private Double diameterInch;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getDiameterMm() {
        return diameterMm;
    }

    public void setDiameterMm(Double diameterMm) {
        this.diameterMm = diameterMm;
    }

    public Double getDiameterInch() {
        return diameterInch;
    }

    public void setDiameterInch(Double diameterInch) {
        this.diameterInch = diameterInch;
    }
}
