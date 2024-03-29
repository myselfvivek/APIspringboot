package org.example.courseapidata.topic;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Topic {

    @Id
    private String id;
    private String name;
    private String discription;

    public Topic(){

    }
    public Topic(String id, String name, String discription) {
        super();
        this.id = id;
        this.name = name;
        this.discription = discription;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }
}
