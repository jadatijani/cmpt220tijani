USE Zipster
--DROP TABLE city
--DROP TABLE zip_code

SELECT * FROM city;
SELECT * FROM zip_code;
 
CREATE TABLE city 
(
city_id INT PRIMARY KEY,
city_name VARCHAR(50),
state VARCHAR(20),
);

create TABLE zip_code 
(
zip_id INT PRIMARY KEY,
city_id INT NOT NULL,
zip INT,
CONSTRAINT fk_city_id
FOREIGN KEY(city_id)
REFERENCES city(city_id)
);

INSERT INTO city(city_id, city_name, state)
VALUES 
	(NEXT VALUE FOR dbo.seq_city_id,'Los Angeles', 'California'),
	(NEXT VALUE FOR dbo.seq_city_id,'Los Angeles', 'California'),
	(NEXT VALUE FOR dbo.seq_city_id,'Atlanta', 'Georgia'),
	(NEXT VALUE FOR dbo.seq_city_id,'New York', 'New York'),
	(NEXT VALUE FOR dbo.seq_city_id,'Miami', 'Florida'),
	(NEXT VALUE FOR dbo.seq_city_id,'Dallas', 'Texas'),
	(NEXT VALUE FOR dbo.seq_city_id,'Phoenix', 'Arizona'),
	(NEXT VALUE FOR dbo.seq_city_id,'Denver', 'Colorado'),
	(NEXT VALUE FOR dbo.seq_city_id,'Nashville', 'Tennessee'),
	(NEXT VALUE FOR dbo.seq_city_id,'Chicago', 'Illinois');

SELECT * FROM city
--DELETE FROM city
------------------------------------------------------------------------------
INSERT INTO zip_code(zip_id, city_id, zip)
VALUES 
	(NEXT VALUE FOR dbo.seq_zip_id, 1, 90001),
	(NEXT VALUE FOR dbo.seq_zip_id, 2, 90210),
	(NEXT VALUE FOR dbo.seq_zip_id, 3, 30303),
	(NEXT VALUE FOR dbo.seq_zip_id, 4, 10001),
	(NEXT VALUE FOR dbo.seq_zip_id, 5, 33140),
	(NEXT VALUE FOR dbo.seq_zip_id, 6, 75052),
	(NEXT VALUE FOR dbo.seq_zip_id, 7, 85018),
	(NEXT VALUE FOR dbo.seq_zip_id, 8, 80217),
	(NEXT VALUE FOR dbo.seq_zip_id, 9, 37116),
	(NEXT VALUE FOR dbo.seq_zip_id, 10, 60601);

SELECT * FROM zip_code
