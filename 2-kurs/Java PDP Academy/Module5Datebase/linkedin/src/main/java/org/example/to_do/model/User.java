package org.example.to_do.model;

import lombok.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class User extends BaseModel{
    private String name;
    private String username;
    private String password;

    public static User map(ResultSet resultSet) throws SQLException {
        User user = User.builder()
                .name(resultSet.getString("name"))
                .username(resultSet.getString("username"))
                .password(resultSet.getString("password"))
                .build();
        user.setId(resultSet.getObject("id", UUID.class));
        user.setCreatedDate(resultSet.getTimestamp("created_date").toLocalDateTime());
        return user;
    }
}
