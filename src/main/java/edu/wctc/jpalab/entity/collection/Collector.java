package edu.wctc.jpalab.entity.collection;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@NoArgsConstructor
@Table(name="collector", schema="collection")
public class Collector {
    @Id
    @Column(name="collector_id")
    private int collectorId;
    @Column(name="collector_firstname")
    private String collectorFirstName;
    @Column(name="collector_lastname")
    private String collectorLastName;
    @Column(name="collector_avatar")
    private String collectorAvatar;
}
