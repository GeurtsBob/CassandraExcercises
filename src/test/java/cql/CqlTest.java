package cql;

import classes.Column;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Row;
import org.cassandraunit.AbstractCassandraUnit4CQLTestCase;
import org.cassandraunit.dataset.CQLDataSet;
import org.cassandraunit.dataset.cql.ClassPathCQLDataSet;
import org.junit.Test;

import java.util.List;

import static classes.Column.fromResultSet;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.junit.Assert.assertThat;

public class CqlTest extends AbstractCassandraUnit4CQLTestCase {

    public CQLDataSet getDataSet() {
        return new ClassPathCQLDataSet("youtube.cql");
    }

    //Exercise 1
    @Test
    public void isYouTubeKeySpaceCreated() {
        ResultSet result = getSession().execute("SELECT * FROM system_schema.keyspaces WHERE keyspace_name = 'youtube';");
        assertThat(result.all(), hasSize(1));
    }

    //Exercise 2 + Exercise 5
    @Test
    public void isVideosTableCreated() {
        ResultSet result = getSession().execute("SELECT table_name FROM system_schema.tables WHERE keyspace_name='youtube' AND table_name='videos';");
        List<Row> rows = result.all();
        assertThat(rows, hasSize(1));
    }

    @Test
    public void videosTableHasCorrectColumns() {
        ResultSet result = getSession().execute("SELECT * FROM system_schema.columns WHERE keyspace_name = 'youtube' AND table_name = 'videos';");
        List<Column> columns = fromResultSet(result);

        assertThat(columns, hasSize(7));
        assertThat(columns, containsInAnyOrder(
                new Column("video_id", "none", "partition_key", "uuid"),
                new Column("title", "none", "regular", "text"),
                new Column("description", "none", "regular", "text"),
                new Column("tags", "none", "regular", "set<text>"),
                new Column("likes", "none", "regular", "set<frozen<user_opinion>>"),
                new Column("uploaded_by", "none", "regular", "uuid"),
                new Column("upload_date", "none", "regular", "date")
        ));
    }

    //Exercise 3
    @Test
    public void isUsersTableCreated() {
        ResultSet result = getSession().execute("SELECT table_name FROM system_schema.tables WHERE keyspace_name='youtube' AND table_name='users';");
        List<Row> rows = result.all();
        assertThat(rows, hasSize(1));
    }

    @Test
    public void usersTableHasCorrectColumns() {
        ResultSet result = getSession().execute("SELECT * FROM system_schema.columns WHERE keyspace_name = 'youtube' AND table_name = 'users';");
        List<Column> columns = fromResultSet(result);

        assertThat(columns, hasSize(7));
        assertThat(columns, containsInAnyOrder(
                new Column("user_id", "none", "regular", "uuid"),
                new Column("username", "none", "partition_key", "text"),
                new Column("email_address", "none", "regular", "text"),
                new Column("create_date", "none", "regular", "date"),
                new Column("first_name", "none", "regular", "text"),
                new Column("last_name", "none", "regular", "text"),
                new Column("country", "none", "regular", "text")
        ));
    }

    //Exercise 4
    @Test
    public void isUserOpinionTableCreated() {
        ResultSet result = getSession().execute("SELECT type_name FROM system_schema.types WHERE keyspace_name='youtube' AND type_name='user_opinion';");
        List<Row> rows = result.all();
        assertThat(rows, hasSize(1));
    }
}