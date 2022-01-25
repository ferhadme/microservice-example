package com.ferhad.accountservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "account")
@Builder
public class UserAcc {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "userSequence", sequenceName = "user_seq")
    private Long id;
    @Column(unique = true)
    private String username;
    private String password;

    @ManyToMany(mappedBy = "users")
    private Set<RoleAcc> roles;
}
