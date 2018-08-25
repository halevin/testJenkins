package info.telescopeworld.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "site")
public class Site {

  // An autogenerated id (unique for each user in the db)
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @NotNull
  @OneToOne
  @JoinColumn(name="addressid")
  private Address address;

  @NotNull
  private String name;

  public Site() { }

  public Site(long id) {
    this.id = id;
  }

  public long getId() {
    return id;
  }

  public void setId(long value) {
    this.id = value;
  }

  public String getName() {
    return name;
  }

  public void setName(String value) {
    this.name = value;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }
}
