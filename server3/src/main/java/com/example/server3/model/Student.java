package com.example.server3.model;

import com.example.server3.enums.StudentStatus;
import lombok.*;
import org.springframework.stereotype.Component;

//@Data
//@Component
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private Long id;
    private String firstName;
    private String lastName;
    private String patronymic;
    private long idGroup;
    private StudentStatus status;
}
