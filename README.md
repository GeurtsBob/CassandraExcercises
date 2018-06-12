Cassandra Practice Material
===================


Exercise 1 - CQL | Create the 'youtube' keyspace

Check-out exercise 1 with the following command: git checkout origin/exercise-1

Create a keyspace named 'youtube' to store our videos.   Run 'mvn test' to check if your script is correct.


---

Exercise 2 - CQL | Create the 'videos' table | Q3

Check-out exercise 2 with the following command: git checkout origin/exercise-2

Create a table named 'videos' to store our videos. A video should have the following properties: <br />
- A unique identifier(UUID) as titles can be the same: `video_id`
- A title: `title`
- A description: `description`
- A set of tags: `tags`
- The uploader: `uploaded_by`
- An upload date: `upload_date`

Run 'mvn test' to check if your script is correct.

---

Exercise 3 - CQL | Create the 'users' table | Q4

Check-out exercise 3 with the following command: git checkout origin/exercise-3

Create a table named 'users' to store our users. A video should have the following properties: <br />
- A unique identifier: `user_id`
- A username : `username`
- An email address: `email_address`
- A create date: `create_date`
- A first name: `first_name`
- A last name: `last_name`
- A country of origin: `country`

Run 'mvn test' to check if your script is correct.

---

Exercise 4 - CQL | Create a User Defined Type

Check-out exercise 4 with the following command: git checkout origin/exercise-4

Create a User Defined Type named 'user_opinion' to store our user opinions. A user opinion should have the following properties: <br />
- A reference to the user
- An opinion either, a positive opinion is stored as +1 and negative as -1 

Run 'mvn test' to check if your script is correct.

---

Exercise 5 - CQL | Alter the videos table

Check-out exercise 5 with the following command: git checkout origin/exercise-5

Alter the videos table to include a set of user opinions.

Run 'mvn test' to check if your script is correct.

---

Exercise 6 - CQL | Create an email partitioned user table

Check-out exercise 6 with the following command: git checkout origin/exercise-6

Alter the comments to include a set of user opinions.

Run 'mvn test' to check if your script is correct.

---

Exercise 7 - CQL | Create the title partitioned videos table | Q2

Check-out exercise 7 with the following command: git checkout origin/exercise-7

Create the title partitioned videos table.

Run 'mvn test' to check if your script is correct.

---

Exercise 8 - CQL | Create the user id partitioned videos table | Q7

Check-out exercise 8 with the following command: git checkout origin/exercise-8

Create the user id partitioned videos table

Run 'mvn test' to check if your script is correct.

---

Exercise 9 - CQL | Create the video id partitioned comments table clustered by comment date (Descending) | Q8

Check-out exercise 9 with the following command: git checkout origin/exercise-9

Create the video id partitioned comments table clustered by comment date to store our comments by video. A comment should have the following properties: <br />
- A unique identifier (time-based)
- A reference to the video
- A username 
- The comment
- A reference to the commenter
- A comment date
- A set of user opinions

Run 'mvn test' to check if your script is correct.

---

Exercise 10 - CQL | Create the user id partitioned comments table clustered by comment date (Descending) | Q6

Check-out exercise 10 with the following command: git checkout origin/exercise-10

Create the user id partitioned comments table to store our comments by video. A comment should have the following properties: <br />
- A unique identifier (time-based)
- A reference to the video
- A username 
- The comment
- A reference to the commenter
- A comment date
- A set of user opinions

Run 'mvn test' to check if your script is correct.

