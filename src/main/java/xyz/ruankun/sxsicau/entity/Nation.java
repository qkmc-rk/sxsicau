package xyz.ruankun.sxsicau.entity;

import javax.persistence.*;

@Entity
@Table(name = "sx_dict_nation")
public class Nation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "sx_dict_id")
    private Integer sxDictId;

    @Column(name = "sx_dict_nation")
    private String sxDictNation;

    public Integer getSxDictId() {
        return sxDictId;
    }

    public void setSxDictId(Integer sxDictId) {
        this.sxDictId = sxDictId;
    }

    public String getSxDictNation() {
        return sxDictNation;
    }

    public void setSxDictNation(String sxDictNation) {
        this.sxDictNation = sxDictNation;
    }
}
