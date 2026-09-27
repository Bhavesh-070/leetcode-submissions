/*
 * Problem: 181. Employees Earning More Than Their Managers
 * Difficulty: Easy
 * LeetCode Link: https://leetcode.com/problems/employees-earning-more-than-their-managers/
 * Topic: Database (SQL)
 *
 * -------------------------------------------------------------
 * Approach 1: Self INNER JOIN (Optimal & Recommended)
 * -------------------------------------------------------------
 * Join the Employee table to itself on e.managerId = m.id,
 * then filter where the employee's salary is greater than the manager's salary.
 */

SELECT 
    e.name AS Employee
FROM Employee e
INNER JOIN Employee m 
    ON e.managerId = m.id
WHERE e.salary > m.salary;

/*
 * -------------------------------------------------------------
 * Approach 2: Correlated Subquery
 * -------------------------------------------------------------
 * For each employee record e1, execute an inner query to look up
 * their specific manager's salary from e2 where e1.managerId = e2.id.
 *
 * SELECT 
 *     e1.name AS Employee 
 * FROM Employee e1 
 * WHERE e1.salary > (
 *     SELECT e2.salary 
 *     FROM Employee e2 
 *     WHERE e1.managerId = e2.id
 * );
 */