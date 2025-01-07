package constants;

import java.awt.*;

public class CommonConstants {
    // color hex values
    public static final Color PRIMARY_COLOR = Color.decode("#1C1C1C");
    public static final Color SECONDARY_COLOR = Color.decode("#333333");
    public static final Color TEXT_COLOR = Color.decode("#E0E0E0");

    // mysql credentials

    // place the url of your db in this format -> jdbc:mysql:ip_address/schema-name
    public static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/login_schema";

    // place the username that you made here (might be different)
    public static final String DB_USERNAME = "root";
    // place the password that you made here (might be different)
    public static final String DB_PASSWORD = "naman210128";
    public static final String DB_USERS_TABLE_NAME = "users";
}
