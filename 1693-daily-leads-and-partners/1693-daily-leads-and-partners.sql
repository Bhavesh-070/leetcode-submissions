/*
 * Problem: 1693. Daily Leads and Partners
 * Difficulty: Easy
 * LeetCode Link: https://leetcode.com/problems/daily-leads-and-partners/
 * Topic: Database (SQL)
 *
 * Approach: GROUP BY with COUNT(DISTINCT ...) Aggregation
 * 1. Group the records by both 'date_id' and 'make_name'.
 * 2. Apply COUNT(DISTINCT lead_id) to calculate the number of unique leads.
 * 3. Apply COUNT(DISTINCT partner_id) to calculate the number of unique partners.
 * 4. Format date_id as 'YYYY-MM-DD' using TO_CHAR to match output specification.
 */

SELECT 
    TO_CHAR(date_id, 'YYYY-MM-DD') AS date_id, 
    make_name, 
    COUNT(DISTINCT lead_id) AS unique_leads, 
    COUNT(DISTINCT partner_id) AS unique_partners 
FROM DailySales 
GROUP BY 
    date_id, 
    make_name;