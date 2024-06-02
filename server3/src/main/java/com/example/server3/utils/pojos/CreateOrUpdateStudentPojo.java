package com.example.server3.utils.pojos;

import com.example.server3.enums.StudentStatus;
import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class CreateOrUpdateStudentPojo {
    private String firstName;
    private String lastName;
    private String patronymic;
    private long idGroup;
    private StudentStatus status;

}