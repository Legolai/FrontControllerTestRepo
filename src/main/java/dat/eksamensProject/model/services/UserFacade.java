package dat.eksamensProject.model.services;

import dat.eksamensProject.model.entities.User;
import dat.eksamensProject.model.exceptions.DatabaseException;
import dat.eksamensProject.model.persistence.ConnectionPool;
import dat.eksamensProject.model.persistence.UserMapper;

public class UserFacade
{
    public static User login(String username, String password, ConnectionPool connectionPool) throws DatabaseException
    {
        UserMapper userMapper = new UserMapper(connectionPool);
        return userMapper.login(username, password);
    }

    public static User createUser(String username, String password, String role, ConnectionPool connectionPool) throws DatabaseException
    {
        UserMapper userMapper = new UserMapper(connectionPool);
        return userMapper.createUser(username, password, role);
    }
}
