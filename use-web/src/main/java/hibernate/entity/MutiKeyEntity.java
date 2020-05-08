package hibernate.entity;

import javax.persistence.*;

@Entity
@Table(name = "muti_key", schema = "test", catalog = "")
@IdClass(MutiKeyEntityPK.class)
public class MutiKeyEntity {
    private int id;
    private String name;
    private int idCard;
    private String remark;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Id
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Id
    @Column(name = "id_card")
    public int getIdCard() {
        return idCard;
    }

    public void setIdCard(int idCard) {
        this.idCard = idCard;
    }

    @Basic
    @Column(name = "remark")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MutiKeyEntity that = (MutiKeyEntity) o;

        if (id != that.id) return false;
        if (idCard != that.idCard) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + idCard;
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        return result;
    }
}
