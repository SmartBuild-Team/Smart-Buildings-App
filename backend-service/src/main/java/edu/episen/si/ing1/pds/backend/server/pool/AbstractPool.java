package edu.episen.si.ing1.pds.backend.server.pool;

import java.sql.Connection;

public abstract class AbstractPool implements Pool {

    @Override
    public void release(Connection connection) {
        if (isValid(connection)) {
            returnToPool(connection);
        } else {
            handleInvalidReturn(connection);
        }
    }


    protected abstract void handleInvalidReturn(Connection t);

    protected abstract void returnToPool(Connection t);

    protected abstract boolean isValid(Connection t);
}
