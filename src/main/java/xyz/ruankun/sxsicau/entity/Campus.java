package xyz.ruankun.sxsicau.entity;

import javax.persistence.*;

@Entity
@Table(name = "sx_dict_campus")
public class Campus {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "sx_dict_id")
    private Integer id;

    @Column(name = "sx_dict_campus")
    private String campus;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }
}
