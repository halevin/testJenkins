package info.telescopeworld;

/**
 * Created by chalevina on 20/10/2017.
 */
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

@Configuration
public class DataSourceConfig {

    @Bean
    public DataSource dataSource(){
        //jdbc:hsqldb:mem:testdb
        EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
        EmbeddedDatabase db = builder.setType(EmbeddedDatabaseType.HSQL)
                .addScript("sql/createTables.sql")
                .addScript("sql/createRows.sql")
                .addScript("sql/createRowsEyepieces.sql")
                .addScript("sql/createRowsTelescopes.sql")
                .build();
        return db;
    }

}