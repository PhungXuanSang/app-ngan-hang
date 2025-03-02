package org.training.user.service.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.training.user.service.model.Status;

import javax.persistence.*;
import java.sql.Struct;
import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    private String username;

    private String emailId;

    private String password;

    private String contactNo;

    private String identificationNumber;

    @Enumerated(EnumType.STRING)
    private Role role;

    @CreationTimestamp
    private LocalDate creationOn;

    @Enumerated(EnumType.STRING)
    private Status status;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_profile_id", referencedColumnName = "userProfileId")
    private UserProfile userProfile;

    public enum Role {
        ADMIN, USER
    }
}