package xyz.ruankun.sxsicau.entity;

import javax.persistence.*;

@Entity
@Table(name = "sx_dict_major")
public class Major {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "sx_dict_id")
    private Integer sxDictId;

    @Column(name = "sx_dict_college_id")
    private Integer sxDictCollegeId;

    @Column(name = "sx_dict_major")
    private String sxDictMajor;

    public Integer getSxDictId() {
        return sxDictId;
    }

    public void setSxDictId(Integer sxDictId) {
        this.sxDictId = sxDictId;
    }

    public Integer getSxDictCollegeId() {
        return sxDictCollegeId;
    }

    public void setSxDictCollegeId(Integer sxDictCollegeId) {
        this.sxDictCollegeId = sxDictCollegeId;
    }

    public String getSxDictMajor() {
        return sxDictMajor;
    }

    public void setSxDictMajor(String sxDictMajor) {
        this.sxDictMajor = sxDictMajor;
    }
}
