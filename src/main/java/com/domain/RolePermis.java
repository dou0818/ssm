package com.domain;

import javax.persistence.*;

@Table(name = "role_permis")
public class RolePermis {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    @Column(name = "roleid")
    private Integer roleid;

    @Column(name = "permisid")
    private Integer permisid;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return roleid
     */
    public Integer getRoleid() {
        return roleid;
    }

    /**
     * @param roleid
     */
    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    /**
     * @return permisid
     */
    public Integer getPermisid() {
        return permisid;
    }

    /**
     * @param permisid
     */
    public void setPermisid(Integer permisid) {
        this.permisid = permisid;
    }
}