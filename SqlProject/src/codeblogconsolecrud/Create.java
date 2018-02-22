package codeblogconsolecrud;

import java.sql.SQLException;
import java.util.Scanner;

public class Create {

    Create() throws SQLException {
        Scanner userInput = new Scanner(System.in);
        System.out.println("You selected option 1: Create database record: ");
        String name;
        System.out.println("Enter student name: ");
        name = userInput.next();

        String className;
        System.out.println("Enter student class: ");
        className = userInput.next();

        String mark;
        System.out.println("Enter student mark: ");
        mark = userInput.next();
       
        DBUtilities dbUtilities = new DBUtilities();
        
        String sql_stmt = "INSERT INTO studentsdetail (name,className,mark) VALUES ('" + name + "','" + className + "','" + mark + "')";
        
        dbUtilities.ExecuteSQLStatement(sql_stmt);
        
        
        CodeBlogConsoleCRUD.DisplayMenu();
    }
}