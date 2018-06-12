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
CREATE TYPE youtube.user_opinion (
  user_id uuid,
  opinion int
);


-- Exercise 5 - Alter the videos table
ALTER TABLE youtube.videos
ADD likes set<frozen<user_opinion>>;

-- Exercise 6 - Create an email partitioned user table
CREATE TABLE youtube.users_by_email_address (
    user_id uuid,
    username text,
    email_address text PRIMARY KEY,
    create_date date,
    first_name text,
    last_name text,
    country text
);


-- Exercise 7 - Create the title partitioned videos table
