package com.mycompany.myapp.client.dto;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;

/**
 * A RestrictedEntity.
 */

public class RestrictedEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String myField;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMyField() {
        return myField;
    }

    public RestrictedEntity myField(String myField) {
        this.myField = myField;
        return this;
    }

    public void setMyField(String myField) {
        this.myField = myField;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RestrictedEntity)) {
            return false;
        }
        return id != null && id.equals(((RestrictedEntity) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public String toString() {
        return "RestrictedEntity{" +
            "id=" + getId() +
            ", myField='" + getMyField() + "'" +
            "}";
    }
}
