package db.migration;

import org.flywaydb.core.api.migration.BaseJavaMigration;
import org.flywaydb.core.api.migration.Context;

import java.sql.ResultSet;
import java.sql.Statement;

public class V8__Countries extends BaseJavaMigration {
    public void migrate(Context context) throws Exception {
        try (Statement select = context.getConnection().createStatement()) {
			select.execute("INSERT INTO COUNTRYS(COUNTRY_ID,COUNTRY_NAME,REGION_ID )  VALUES (1, 'BRASIL',1),(2,'PARAGUAY',2),(3,'URUGUAY',3),(4,'PARAGUAY',4),(5,'PERU',5)");
									
            
        }
    }
}



