package org.training.user.service.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.training.user.service.model.Status;
import org.training.user.service.model.entity.User;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto {

    private Long userId;

    private String username;

    private String emailId;

    private String password;

    private String identificationNumber;

    private Status status;

    private User.Role role;

    private UserProfileDto userProfileDto;
}
