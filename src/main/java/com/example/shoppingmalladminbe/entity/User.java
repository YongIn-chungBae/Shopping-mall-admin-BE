package com.example.shoppingmalladminbe.entity;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_idx")
    private Long idx;

    @Column(name = "user_id")
    private String id;

    @Column(name = "user_pwd")
    private String password;

    @Column(name = "user_name")
    private String name;

    @Column(name = "user_email")
    private String email;

}
