package com.ischade.springboot.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter
    int id;

    @NotEmpty(message = "Must be not empty")
    @Size(min = 3, max = 40, message = "len [3,40]")
    String name;

    @Min(value = 1, message = "Must be greater than 0")
    @Max(value = 120, message = "must be less than 121")
    byte age;

}
