-- Exercise 1 - Create a keyspace
CREATE KEYSPACE youtube WITH REPLICATION = {
	'class' : 'SimpleStrategy',
    'replication_factor' : 3
};


-- Exercise 2 - Create the 'videos' table
CREATE TABLE youtube.videos (
  video_id uuid PRIMARY KEY,
  title text,
  description text,
  tags set<text>,
  uploaded_by uuid,
  upload_date date
);


-- Exercise 3 - Create the 'users' table
CREATE TABLE youtube.users (
  user_id uuid,
  username text PRIMARY KEY,
  email_address text,
  create_date date,
  first_name text,
  last_name text,
  country text
);


-- Exercise 4 - Create a User Defined Type


