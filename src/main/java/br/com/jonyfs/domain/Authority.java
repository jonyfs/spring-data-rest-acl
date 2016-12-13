/**
 * This file was generated by the JPA Modeler
 */
package br.com.jonyfs.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;

/**
 * 
 */
@Entity
public class Authority implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    @Basic
    @NotNull
    private String name;

    @ManyToMany(targetEntity = Groups.class)
    private List<Groups> groupses;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Groups> getGroupses() {
        return this.groupses;
    }

    public void setGroupses(List<Groups> groupses) {
        this.groupses = groupses;
    }

}