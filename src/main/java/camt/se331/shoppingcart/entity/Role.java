package camt.se331.shoppingcart.entity;

/**
 * Created by liuyahong on 2016/4/26.
 */



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.io.Serializable;

@Entity
public class Role implements Serializable {
     private static final long serialVersionUID = 1L;
     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     private Long id;
     private String roleName;

             public Role() {
         }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Role(String roleName) {
        this.roleName = roleName;
    }
}
