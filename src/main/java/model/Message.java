package model;

import io.quarkus.hibernate.reactive.panache.PanacheEntityBase;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Message extends PanacheEntityBase {

    @Id
    public String id;
}
