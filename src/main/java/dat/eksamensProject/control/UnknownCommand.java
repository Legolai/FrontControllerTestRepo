package dat.eksamensProject.control;

import dat.eksamensProject.model.exceptions.DatabaseException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UnknownCommand extends Command {

    @Override
    String execute( HttpServletRequest request, HttpServletResponse response ) throws DatabaseException
    {
        String msg = "Unknown command. Nicolai IT";
        throw new DatabaseException( msg );
    }

}
