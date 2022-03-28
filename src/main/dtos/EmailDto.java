package com.ms.service_mail.dtos;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
public class EmailDto {

    @NotBlank
    private String ownerRef;
    @NotBlank
    @Email
    private String emailFrom;
    @NotBlanK
    private String emailTo;
    @NotBlank
    private String subject;
    @NotBlank
    private String text;
}
