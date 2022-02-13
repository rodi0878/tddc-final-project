package cz.upce.tddc.finalproject.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 */
@Entity
@Table(name = "memos")
public class Memo {
    
    @Id
    @GeneratedValue
    private Integer id;
    
    private String memo;

    public Memo() {
    }

    public Memo(Integer id, String memo) {
        this.id = id;
        this.memo = memo;
    }

    public Memo(String memo) {
        this.memo = memo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
    
    
}
