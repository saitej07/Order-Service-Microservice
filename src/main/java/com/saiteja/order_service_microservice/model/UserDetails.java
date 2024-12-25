package com.saiteja.order_service_microservice.model;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDetails {

    private String email;
    private String firstName;
    private String lastName;
}
