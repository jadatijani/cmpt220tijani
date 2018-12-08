USE Zipster
SELECT a.city_name, a.state, b.zip
FROM city a
JOIN zip_code b
ON a.city_id = b.city_id;



 SELECT b.zip 
 FROM city a
JOIN zip_code b
ON a.city_id = b.city_id
where city_name = 'x' and state = 'y';