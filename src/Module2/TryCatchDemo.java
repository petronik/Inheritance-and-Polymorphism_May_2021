package Module2;

import java.sql.*;

public class TryCatchDemo {

	public static void fun() throws IllegalAccessException {
		System.out.println("fun() method called!");
		
		throw new IllegalAccessException("we can provide a message!!!");
	}
	
	public static void main(String[] args) {
		
		try {
			String url = "jdbc:mysql://127.0.0.1:3306/test";
			Connection conn = DriverManager.getConnection(url, "root", "1234");
			
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM test.students");
			
			while(rs.next()) {
				System.out.println(
						rs.getInt(1) + " " +
						rs.getString(2)+ " " + 
						rs.getString(3) + " " +
						rs.getFloat(4)
						);
			}
			
			conn.close();
		}
		catch (Exception e) {
			System.err.println(e);
		}
		
		
		/*
		try {
			fun();
		}
		catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		
		
		int a = 10, b = 5, c = 5, res;
		
		try {
			res = a / (b - c);
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
		}
		
		System.out.println("Have a nice day!");
		*/
	}

}

/*
 use test;

create table Students (
	id int,
    name nvarchar(64),
    email nvarchar(32),
    marks float
);

Insert into students values
(101, 'Mark', 'mark@gmail.com', 77.14),
(102, 'Lucy', 'lucy@gmail.com', 17.22),
(103, 'Tracy', 'tracy@gmail.com', 71.55);

SELECT * FROM test.students;
*/
