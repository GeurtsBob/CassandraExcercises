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

