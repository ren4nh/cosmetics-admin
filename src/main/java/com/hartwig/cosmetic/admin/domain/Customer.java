package com.hartwig.cosmetic.admin.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "customers")
public class Customer extends BaseEntity {

    private String name;
    private String phone;
    @Column(name = "facebook_url")
    private String facebookUrl;

}
