package info.telescopeworld.models;

import javax.persistence.*;

@Entity
@Table(name = "mounttype")
public class MountType {

  // An autogenerated id (unique for each user in the db)
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  private String name;

  public MountType() { }

  public MountType(long id) {
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

  public void setName(String name) {
    this.name = name;
  }

}