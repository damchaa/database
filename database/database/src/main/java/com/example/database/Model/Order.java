package com.example.database.Model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @Column(name = "id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "orderproduct",
        joinColumns = @JoinColumn(name = "order_id",referencedColumnName = "id"),
        inverseJoinColumns = @JoinColumn(name = "product_id",referencedColumnName = "id")
        )
    private Set<Product> products;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }
    public String toString() {
        return "User{" +
                "id=" + id +
                ", user='" + user + '\'' +
                ", products=" + products +
                '}';
    }
}
