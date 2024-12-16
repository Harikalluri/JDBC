package jdbc;
import java.sql.*;
import java.util.Scanner;
public class jdbc1 {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcpractice","root","root");
		CallableStatement p=c.prepareCall("insert into employee values(?,?)");//create database database_name, alter table employee add  email varchar(20),insert into employee values('hari','hati@gmail.com'),select * from employee
	
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the name");
		p.setString(1, scanner.nextLine());
		System.out.println("Enter the email");
		p.setString(2, scanner.nextLine());
		int e=p.executeUpdate();
		System.out.println(e);
		
}
}