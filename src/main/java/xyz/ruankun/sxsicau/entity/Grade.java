package xyz.ruankun.sxsicau.entity;

import javax.persistence.*;

@Entity
@Table(name = "sx_dict_grade")
public class Grade {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "sx_dict_id")
    private Integer sxDictId;

    @Column(name = "sx_dict_grade")
    private String sxDictGrade;

    @Column(name = "sx_dict_is_open")
    private boolean sxDictIsOpen;

    public Integer getSxDictId() {
        return sxDictId;
    }

    public void setSxDictId(Integer sxDictId) {
        this.sxDictId = sxDictId;
    }

    public String getSxDictGrade() {
        return sxDictGrade;
    }

    public void setSxDictGrade(String sxDictGrade) {
        this.sxDictGrade = sxDictGrade;
    }

    public boolean isSxDictIsOpen() {
        return sxDictIsOpen;
    }

    public void setSxDictIsOpen(boolean sxDictIsOpen) {
        this.sxDictIsOpen = sxDictIsOpen;
    }
}
