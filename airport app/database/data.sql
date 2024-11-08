-- Insert Cities
INSERT INTO city (id, name, state, population) VALUES
(1, 'New York', 'NY', 8419600),
(2, 'Los Angeles', 'CA', 3980400),
(3, 'Chicago', 'IL', 2716000),
(4, 'Houston', 'TX', 2328000),
(5, 'Phoenix', 'AZ', 1690000),
(6, 'Philadelphia', 'PA', 1584200),
(7, 'San Antonio', 'TX', 1541200),
(8, 'San Diego', 'CA', 1423800),
(9, 'Dallas', 'TX', 1341000),
(10, 'San Jose', 'CA', 1035300);

-- Insert Airports
INSERT INTO airport (id, name, code, city_id) VALUES
(1, 'John F. Kennedy International Airport', 'JFK', 1),
(2, 'LaGuardia Airport', 'LGA', 1),
(3, 'Los Angeles International Airport', 'LAX', 2),
(4, 'O\'Hare International Airport', 'ORD', 3),
(5, 'George Bush Intercontinental Airport', 'IAH', 4),
(6, 'Phoenix Sky Harbor International Airport', 'PHX', 5),
(7, 'Philadelphia International Airport', 'PHL', 6),
(8, 'San Antonio International Airport', 'SAT', 7),
(9, 'Dallas/Fort Worth International Airport', 'DFW', 9),
(10, 'Norman Y. Mineta San Jose International Airport', 'SJC', 10);

-- Insert Passengers
INSERT INTO passenger (id, first_name, last_name, phone_number, city_id) VALUES
(1, 'Greg', 'Williams', '555-1234', 1),
(2, 'Gary', 'Smith', '555-5678', 2),
(3, 'Michelle', 'Brown', '555-9101', 3),
(4, 'Emil', 'Harris', '555-1123', 4),
(5, 'Matthew', 'Johnson', '555-1314', 5),
(6, 'Olivia', 'Easton', '555-1516', 6),
(7, 'Daniel', 'Jones', '555-1718', 7),
(8, 'Sophia', 'Garcia', '555-1920', 8),
(9, 'Liam', 'Martinez', '555-2122', 9),
(10, 'Isabella', 'Rodriguez', '555-2324', 10);

-- Insert Aircraft
INSERT INTO aircraft (id, type, airline_name, number_of_passengers) VALUES
(1, 'Boeing 737', 'American Airlines', 160),
(2, 'Airbus A320', 'Delta Airlines', 150),
(3, 'Boeing 747', 'United Airlines', 366),
(4, 'Airbus A380', 'Qantas', 555),
(5, 'Boeing 767', 'British Airways', 181),
(6, 'Boeing 777', 'Emirates', 396),
(7, 'Airbus A330', 'Lufthansa', 277),
(8, 'Boeing 787', 'Singapore Airlines', 236),
(9, 'Airbus A350', 'Cathay Pacific', 280),
(10, 'Boeing 757', 'Icelandair', 199);

-- Insert Relationships between Airports and Aircraft
INSERT INTO airport_aircraft (airport_id, aircraft_id) VALUES
(1, 1), (2, 1), (3, 2), (4, 3), (5, 4), (6, 5), (7, 6), (8, 7), (9, 8), (10, 9);

-- Insert Relationships between Passengers and Aircraft
INSERT INTO aircraft_passengers (aircraft_id, passenger_id) VALUES
(1, 1), (2, 2), (3, 3), (4, 4), (5, 5), (6, 6), (7, 7), (8, 8), (9, 9), (10, 10);
