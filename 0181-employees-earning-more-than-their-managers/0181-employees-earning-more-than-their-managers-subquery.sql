/*
 * Problem: 181. Employees Earning More Than Their Managers
 * Difficulty: Easy
 * LeetCode Link: https://leetcode.com/problems/employees-earning-more-than-their-managers/
 * Topic: Database (SQL)
 *
 * Approach: Correlated Subquery
 * - For every row in outer table Employee 'e1', execute an inner subquery.
 * - The subquery retrieves the salary of the manager (e2.salary) whose ID matches e1.managerId.
 * - Filters where e1.salary is strictly greater than the subquery result.
 */

SELECT 
    e1.name AS Employee
FROM Employee e1
WHERE e1.salary > (
    SELECT e2.salary
    FROM Employee e2
    WHERE e1.managerId = e2.id
);
