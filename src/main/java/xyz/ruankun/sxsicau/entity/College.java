package xyz.ruankun.sxsicau.entity;


import javax.persistence.*;

@Entity
@Table(name = "sx_dict_college")
public class College {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "sx_dict_id")
    private Integer sxDictId;

    @Column(name = "sx_dict_campus_id")
    private Integer sxDictCampusId;

    @Column(name = "sx_dict_college")
    private String sxDictCollege;

    public Integer getSxDictId() {
        return sxDictId;
    }

    public void setSxDictId(Integer sxDictId) {
        this.sxDictId = sxDictId;
    }

    public Integer getSxDictCampusId() {
        return sxDictCampusId;
    }

    public void setSxDictCampusId(Integer sxDictCampusId) {
        this.sxDictCampusId = sxDictCampusId;
    }

    public String getSxDictCollege() {
        return sxDictCollege;
    }

    public void setSxDictCollege(String sxDictCollege) {
        this.sxDictCollege = sxDictCollege;
    }
}
