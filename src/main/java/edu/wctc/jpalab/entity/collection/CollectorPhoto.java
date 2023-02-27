package edu.wctc.jpalab.entity.collection;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
@NoArgsConstructor
@Table(name="photo", schema="collection")
public class CollectorPhoto {
    @Id
    @Column(name="photo_id")
    private int id;
    @ManyToOne
    @JoinColumn(name="photo_collector_id")
    private Collector photoCollectorId;
    @Column(name="photo_filename")
    private String photoFileName;
    @Column(name="photo_datestamp")
    private Timestamp photoDateStamp;

    @Column(name="photo_visible")
    private boolean photoVisible;

}
