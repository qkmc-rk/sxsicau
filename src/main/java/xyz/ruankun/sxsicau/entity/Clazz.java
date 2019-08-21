package xyz.ruankun.sxsicau.entity;

import javax.persistence.*;

@Entity
@Table(name = "sx_dict_clazz")
public class Clazz {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "sx_dict_id")
    private Integer id;

    @Column(name = "sx_dict_major_id")
    private Integer majorId;

    @Column(name = "sx_dict_clazz_count")
    private Integer classCount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMajorId() {
        return majorId;
    }

    public void setMajorId(Integer majorId) {
        this.majorId = majorId;
    }

    public Integer getClassCount() {
        return classCount;
    }

    public void setClassCount(Integer classCount) {
        this.classCount = classCount;
    }
}
