package edu.wctc.jpalab.entity.recipe;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name="recipe", schema="recipe")
public class Recipe {
    @Id
    @Column(name = "recipe_id")
    private int id;
    @ManyToOne
    @JoinColumn(name = "recipe_chef_id")
    private Chef chefId;
    @Column(name = "recipe_title")
    private String recipeTitle;
    @Column(name = "recipe_description")
    private String recipeDescription;

}
