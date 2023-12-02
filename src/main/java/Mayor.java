<<<<<<< HEAD:src/main/java/Mayor.java
 

=======
package main.java;
>>>>>>> c7f5a062d99275f7fee24ddc25519bd11cae82f4:src/Mayor.java
import java.util.Set;

public class Mayor extends StateCandidate {
  protected final String city;

  public Mayor(String name, String party, int number, String state, String city) {
    super(name, party, number, state);
    this.city = city;
  }

  @Override
  public String toString() {
    return super.name + super.party + super.number + this.city + this.state;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == this)
      return true;

    if (!(obj instanceof Mayor))
      return false;

    var fd = (Mayor) obj;

    return this.toString().equals(fd.toString());
  }

  public String getCity() {
    return this.city;
  }
}