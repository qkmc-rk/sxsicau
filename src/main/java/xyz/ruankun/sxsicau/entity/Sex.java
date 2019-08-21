package xyz.ruankun.sxsicau.entity;

import javax.persistence.*;

@Entity
@Table(name = "sx_dict_sex")
public class Sex {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "sx_dict_id")
    private Integer sxDictId;

    @Column(name = "sx_dict_sex")
    private String sxDictSex;

    public Integer getSxDictId() {
        return sxDictId;
    }

    public void setSxDictId(Integer sxDictId) {
        this.sxDictId = sxDictId;
    }

    public String getSxDictSex() {
        return sxDictSex;
    }

    public void setSxDictSex(String sxDictSex) {
        this.sxDictSex = sxDictSex;
    }
}
