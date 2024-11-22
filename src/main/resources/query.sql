-- query.sql
SELECT product_name
FROM ORDERS
         JOIN CUSTOMERS ON ORDERS.customers_id = CUSTOMERS.id
WHERE LOWER(CUSTOMERS.name) = :name;