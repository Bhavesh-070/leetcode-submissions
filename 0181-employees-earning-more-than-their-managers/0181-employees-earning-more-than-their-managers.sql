/*
 * Problem: 181. Employees Earning More Than Their Managers
 * Difficulty: Easy
 * LeetCode Link: https://leetcode.com/problems/employees-earning-more-than-their-managers/
 * Topic: Database (SQL)
 *
 * Approach: Self INNER JOIN (Optimal & Standard)
 * - Join the Employee table 'e' with itself 'm' representing managers on e.managerId = m.id.
 * - Filter records where employee's salary exceeds their manager's salary (e.salary > m.salary).
 * - Faster than correlated subqueries as RDBMS optimizers handle JOINs efficiently via Hash/Merge Join.
 */

SELECT 
    e.name AS Employee
FROM Employee e
INNER JOIN Employee m 
    ON e.managerId = m.id
WHERE e.salary > m.salary;