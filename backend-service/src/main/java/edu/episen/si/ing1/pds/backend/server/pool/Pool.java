package edu.episen.si.ing1.pds.backend.server.pool;

import java.sql.Connection;

public interface Pool {
    // Asking for connection object if pool is empty wait until it will has a connection
    Connection getConnection();

    // Return pbject to the pool
    void release(Connection connection);

    void isReturnedTo(Boolean v);

    // Close all connections on the pool
    void shutdown();
}
