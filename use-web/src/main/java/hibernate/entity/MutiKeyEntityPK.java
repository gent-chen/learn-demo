package hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class MutiKeyEntityPK implements Serializable {
    private int id;
    private String name;
    private int idCard;

    @Column(name = "id")
    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "name")
    @Id
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "id_card")
    @Id
    public int getIdCard() {
        return idCard;
    }

    public void setIdCard(int idCard) {
        this.idCard = idCard;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MutiKeyEntityPK that = (MutiKeyEntityPK) o;

        if (id != that.id) return false;
        if (idCard != that.idCard) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + idCard;
        return result;
    }
}
