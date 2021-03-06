package fr.uphf.ecommerce.ecommerce;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class Produits {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY) //Automatique
    private int id;
    private String name;
    private int quantity;
    private float price;
    private String type;
}