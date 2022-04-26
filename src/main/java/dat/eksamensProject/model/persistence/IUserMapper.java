package dat.eksamensProject.model.persistence;

import dat.eksamensProject.model.exceptions.DatabaseException;
import dat.eksamensProject.model.entities.User;

public interface IUserMapper
{
    public User login(String email, String kodeord) throws DatabaseException;
    public User createUser(String username, String password, String role) throws DatabaseException;
}
