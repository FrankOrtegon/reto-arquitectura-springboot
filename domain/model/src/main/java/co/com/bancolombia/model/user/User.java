package co.com.bancolombia.model.user;
import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class User {

    private String nombre;
    private String address;

    public User() {
    }

    public User(String nombre, String address) {
        this.nombre = nombre;
        this.address = address;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
