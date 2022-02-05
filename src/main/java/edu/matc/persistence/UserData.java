package edu.matc.persistence;

import edu.matc.entity.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Access users in the user table.
 *
 * @author pwaite
 */
public class UserData {

    private final Logger logger = LogManager.getLogger(this.getClass());

    /**
     * Gets all users.
     *
     * @return the all users
     */
    public List<User> getAllUsers() {
        String sql = "SELECT * FROM user";
        logger.info("Here's the select sql " + sql);
        logger.error("test");
        return executeQuery(sql);
    }

    /**
     * Gets users by last name.
     *
     * @param lastName the last name
     * @return the users by last name
     */
    public List<User> getUsersByLastName(String lastName) {
        String sql = "SELECT * FROM user WHERE last_name like '%" + lastName + "%'";
        return executeQuery(sql);
    }

    private List<User> executeQuery(String sql) {
        List<User> users = new ArrayList<User>();
        Database database = Database.getInstance();
        Connection connection = null;

        try {
            database.connect();
            connection = database.getConnection();
            Statement selectStatement = connection.createStatement();
            ResultSet results = selectStatement.executeQuery(sql);
            while (results.next()) {
                User employee = createUserFromResults(results);
                users.add(employee);
            }
            database.disconnect();
        } catch (SQLException sqle) {
            logger.error("SearchUser.getAllUsers()...SQL Exception: ", sqle);
        } catch (Exception e) {
            logger.error("SearchUser.getAllUsers()...Exception: ", e);
        }
        return users;
    }

    private User createUserFromResults(ResultSet results) throws SQLException {
        User user = new User();
        user.setLastName(results.getString("last_name"));
        user.setFirstName(results.getString("first_name"));
        user.setUserName(results.getString("user_name"));
        user.setDateofBirth(results.getDate("date_of_birth").toLocalDate());
        return user;
    }

}