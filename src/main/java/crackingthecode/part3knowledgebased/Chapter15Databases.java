package crackingthecode.part3knowledgebased;

public class Chapter15Databases {

    /**
     * 15.1 - Write a method to find the number of employees in each department.
     */
    // I feel the book was very unclear about this question.
    // 1 select Dept_Name, Departments.Dept_ID, count(*) as ‘num_employees’
    // 2 from Departments
    // 3 left join Employees
    // 4 on Employees.Dept_ID = Departments.Dept_ID
    // 5 group by Departments.Dept_ID, Dept_Name

    // SELECT
    //      Dept_Name, Departments.Dept_ID, count(*) as 'num_employees'
    // FROM
    //      Departments
    // LEFT JOIN
    //      Employees
    // ON
    //      Employees.Dept_ID = Departments.Dept_ID
    // GROUP BY
    //      Departments.Dept_ID, Dept_Name

    /**
     * 15.2 - What are the different types of joins? Please explain how they differ and why certain
     * types are better in certain situations.
     */
    // http://en.wikipedia.org/wiki/Join_%28SQL%29
    // Cross Join:
    //  - Explicit:
    //  - - SELECT *
    //  - - FROM employee CROSS JOIN department;
    //  - Implicit:
    //  - - SELECT *
    //  - - FROM employee, department;
    //  Natural Join
    //  - - Where R x S are relations
    // - Explicit:
    // - - SELECT *
    // - - FROM employee NATURAL JOIN department;
    // Inner Join:
    // - Explicit:
    // - - SELECT *
    // - - FROM employee
    // - - INNER JOIN department ON employee.DepartmentID = department.DepartmentID;
    // Equi-join:
    // - Explicit:
    // - - SELECT *
    // - - FROM employee JOIN department
    // - - ON employee.DepartmentID = department.DepartmentID;
    // Outer Join:
    // - Left outer join(left join):
    // - - SELECT *
    // - - FROM employee
    // - - LEFT OUTER JOIN department ON employee.DepartmentID = department.DepartmentID;
    // - Right outer join(right join):
    // - - SELECT *
    // - - FROM employee RIGHT OUTER JOIN department
    // - - ON employee.DepartmentID = department.DepartmentID;
    // - Full outer join
    // - - SELECT *
    // - - FROM employee FULL OUTER JOIN department
    // - - ON employee.DepartmentID = department.DepartmentID

    /**
     * 15.3 - What is denormalization? Explain the pros and cons.
     */
    // https://msdn.microsoft.com/en-us/library/cc505841.aspx
    // http://en.wikipedia.org/wiki/Denormalization
    // Improve database performance
    // Pros
    // - Improved performance
    // - Need fewer joins
    // - Maintain history information
    // Cons
    // - Problems with data consistency - mainly with aggregated data, needs updates

    // In computing, denormalization is the process of attempting to optimize the read performance
    // of a database by adding redundant data or by grouping data.[1][2] In some cases,
    // denormalization is a means of addressing performance or scalability in relational
    // database software.

    // A normalized design will often store different but related pieces of information in separate
    // logical tables (called relations). If these relations are stored physically as separate disk
    // files, completing a database query that draws information from several relations
    // (a join operation) can be slow. If many relations are joined, it may be prohibitively slow.
    // There are two strategies for dealing with this. The preferred method is to keep the logical
    // design normalized, but allow the database management system (DBMS) to store additional
    // redundant information on disk to optimise query response. In this case it is the DBMS
    // software's responsibility to ensure that any redundant copies are kept consistent. This
    // method is often implemented in SQL as indexed views (Microsoft SQL Server) or materialised
    // views (Oracle, PostgreSQL). A view represents information in a format convenient for
    // querying, and the index ensures that queries against the view are optimised.

    // The more usual approach is to denormalize the logical data design. With care this can achieve
    // a similar improvement in query response, but at a cost—it is now the database designer's
    // responsibility to ensure that the denormalized database does not become inconsistent. This is
    // done by creating rules in the database called constraints, that specify how the redundant
    // copies of information must be kept synchronised. It is the increase in logical complexity of
    // the database design and the added complexity of the additional constraints that make this
    // approach hazardous. Moreover, constraints introduce a trade-off, speeding up reads
    // (SELECT in SQL) while slowing down writes (INSERT, UPDATE, and DELETE). This means a
    // denormalized database under heavy write load may actually offer worse performance than its
    // functionally equivalent normalized counterpart.

    /**
     * 15.4 - Draw an entity-relationship diagram for a database with companies, people, and
     * professionals (people who work for companies).
     */

    /**
     * 15.5 - Imagine a simple database storing information for students’ grades. Design what this
     * database might look like, and provide a SQL query to return a list of the honor roll
     * students (top 10%), sorted by their grade point average.
     */
    // http://sqlfiddle.com/
    // If students contain their own GPA
    // ____________
    // | Student  |
    // ------------
    // | Id       |
    // | Name     |
    // | Gpa      |
    // ------------
    // SELECT
    //      *
    // FROM
    //      students
    // ORDER BY
    //      students.gpa

    // book solution:
    // Students, Courses, and CourseEnrollment.

    // SELECT StudentName, GPA
    // FROM(
    //      SELECT top 10 percent Avg(CourseEnrollment.Grade) AS GPA, CourseEnrollment.StudentID
    //      FROM CourseEnrollment
    //      GROUP BY CourseEnrollment.StudentID
    //      ORDER BY Avg(CourseEnrollment.Grade)) Honors
    // INNER JOIN Students ON Honors.StudentID = Students.StudentID
}
