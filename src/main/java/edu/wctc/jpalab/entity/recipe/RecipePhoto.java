package edu.wctc.jpalab.entity.recipe;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
@NoArgsConstructor
@Table(name="photo", schema="recipe")
public class RecipePhoto {
    @Id
    @Column(name = "photo_id")
    private int id;
    @ManyToOne
    @JoinColumn(name = "photo_recipe_id")
    private Recipe recipe;
    @Column(name = "photo_filename")
    private String photoFileName;
    @Column(name = "photo_caption")
    private String photoCaption;
    @Column(name = "photo_datestamp")
    private Timestamp photoDateStamp;
    @Column(name = "photo_visible")
    private boolean photoVisible;
}
