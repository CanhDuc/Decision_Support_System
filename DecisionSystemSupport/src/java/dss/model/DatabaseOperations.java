package dss.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import dss.dao.User;

public class DatabaseOperations extends JDBC_Connect {

    int count1, count2;

    public User checkUser(String userName, String password) throws SQLException {
        PreparedStatement ps1 = getConnection().prepareStatement("Select count(contestantID) from Contestant where userName = '" + userName + "' and password = '" + password + "'");
        ResultSet result = ps1.executeQuery();
        result.next();
        int resultNumber = result.getInt(1);
        if (resultNumber != 0) {
            PreparedStatement ps2 = getConnection().prepareStatement("Select * from Contestant where userName = '" + userName + "' and password = '" + password + "'");
            result = ps2.executeQuery();
            result.next();
            User user = new User(result.getInt("contestantID"),
                    result.getString("contestantName"),
                    result.getString("userName"),
                    result.getString("password"),
                    result.getInt("affordableFee"),
                    result.getInt("successAbilityScore"),
                    result.getInt("schoolScore"),
                    result.getInt("feeScore"),
                    result.getInt("prestigeScore"),
                    result.getInt("level"));
            return user;
        }
        closeConnection();
        return null;
    }

    public boolean insertUser(User user) throws SQLException {
        PreparedStatement ps1 = getConnection().prepareStatement("insert into contestant(contestantName, "
                + " password, affordableFee, successAbilityScore, schoolScore, feeScore, prestigeScore) "
                + " values('" + user.getContestantName()
                + "','" + user.getPassword() + "','" + user.getAffordableFee()
                + "','" + user.getSuccessAbilityScore() + "','" + user.getSchoolScore()
                + "','" + user.getFeeScore()
                + "','" + user.getPrestigeScore()
                + "','" + user.getLevel() + "'");
        count1 = ps1.executeUpdate();
        closeConnection();
        if (count1 > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean changeUserSchoolInfo(User user, int affordableFee, int successAbilityScore, int schoolScore, int feeScore, int prestigeScore) throws SQLException {
        PreparedStatement ps = getConnection().prepareStatement("UPDATE Contestant SET schoolScore = " + schoolScore + ", "
                + "successAbilityScore = " + successAbilityScore + ", "
                + "feeScore = " + feeScore + ", "
                + "prestigeScore = " + prestigeScore + ", "
                + "affordableFee = " + affordableFee + " where contestantID = " + user.getContestantID());
        count1 = ps.executeUpdate();
        closeConnection();
        if (count1 > 0) {
            return true;
        } else {
            return false;
        }
    }

}
