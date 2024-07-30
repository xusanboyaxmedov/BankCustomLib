package org.example.to_do.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
public class BaseModel {
    protected UUID id;
    protected LocalDateTime createdDate;
}
