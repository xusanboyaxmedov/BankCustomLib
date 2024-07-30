package org.example.to_do.repository;

import org.example.to_do.utils.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseRepository {
    protected static final Connection connection = Util.getConnection();

}
