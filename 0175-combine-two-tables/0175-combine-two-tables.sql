/*
 * Problem: 175. Combine Two Tables
 * Difficulty: Easy
 * LeetCode Link: https://leetcode.com/problems/combine-two-tables/
 * Topic: Database (SQL)
 *
 * Approach:
 * - Perform a LEFT OUTER JOIN from 'Person' to 'Address' on matching 'personId'.
 * - A LEFT JOIN preserves all records from the 'Person' table regardless of whether
 *   an associated address exists in the 'Address' table.
 * - If no matching 'personId' is found in 'Address', NULL values are automatically
 *   populated for 'city' and 'state'.
 */
SELECT 
    p.firstName, 
    p.lastName, 
    a.city, 
    a.state 
FROM Person p 
LEFT JOIN Address a 
    ON p.personId = a.personId;