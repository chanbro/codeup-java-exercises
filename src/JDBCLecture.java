//import java.sql.*;
//import com.mysql.cj.jdbc.Driver;
//
//public class JDBCLecture {
//
//        public void getURL() {
//            Connection conn;
//            try {
//                DriverManager.registerDriver(new Driver());
//                conn = DriverManager.getConnection(
//                        "jdbc:mysql://localhost/adlister_db?serverTimezone=UTC&useSSL=false",
//                        "user",
//                        "password"
//                );
//                System.out.println("Connection successful.");
//                System.out.println(conn);
//                // Creating statement object
//                Statement statement = conn.createStatement();
//                // Getting list of results
//                String query = "SELECT * FROM ads";
//                ResultSet rs = statement.executeQuery(query);
//                // Call next() to iterate over result set starting at first id; use rs.absolute(int row) to go to specific id
//                while (rs.next()) {
//                    // Returns first row of data
//                    System.out.println(rs.getString("id"));
//                    System.out.println(rs.getString("user_id"));
//                    System.out.println(rs.getString("title"));
//                    System.out.println(rs.getString("description"));
//                }
//
//                // Getting ad data
//                Ad ad = new Ad(
//                        rs.getLong("id"),
//                        rs.getLong("user_id"),
//                        rs.getString("title"),
//                        rs.getString("description")
//                );
//                System.out.println(ad.getId());
//                System.out.println(ad.getUserId());
//                System.out.println(ad.getTitle());
//                System.out.println(ad.getDescription());
//
//                // Getting Metadata
//                ResultSetMetaData rsmd = rs.getMetaData();
//                int colCount = rsmd.getColumnCount();
//                for (int i = 1; i <=colCount; i++){
//                    System.out.println(rsmd.getColumnName(i));
//                }
//
//                // Creating new ad
//                String insertQuery = String.format("INSERT INTO ads (title, description)");
//                Ad newAd = new Ad(
//                        "New Stuff",
//                        "Contact for more details"
//                );
//                statement.executeUpdate(insertQuery, Statement.RETURN_GENERATED_KEYS);
//                rs = statement.getGeneratedKeys();
//                if (rs.next()) {
//                    System.out.println("Inserted id is: " + rs.getLong(1));
//                }
//
//                // Update Ad
//                Ad updateAd = new Ad();
//                String updateQuery = String.format("UPDATE ads SET title %s description %s");
//                boolean success = statement.executeUpdate(updateQuery);
//
//                // Deleting ad
//                String deleteQuery = "DELETE FROM ads WHERE id = 2";
//                ResultSet rs = statement.executeUpdate(deleteQuery);
//                System.out.println(rs);
//                System.out.println("Statement executed successfully");
//            } catch (SQLException e) {
//                e.printStackTrace();
//                System.out.println("There was a problem connection to SQL.");
//            }
//        }
//
//        public void getUsername(){}
//        public void getPassword(){}
//
//    }
//}
