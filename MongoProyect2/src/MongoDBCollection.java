import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import com.mongodb.WriteConcern;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.DBCursor;
import com.mongodb.ServerAddress;
import java.util.Arrays;

public class MongoDBCollection {

	public static void main(String args[]) {
		 try {
		 // Connect to Database
		 MongoClient mongoClient = new MongoClient("localhost", 27017);
		 DB db = mongoClient.getDB("analytics");
		 System.out.println("Your connection to DB is ready for Use::" + db);
		
		 // Create Collection
		
		 DBCollection linked = db.createCollection("LinkedIn", new
		 BasicDBObject());
		 System.out.println("Collection created successfully");
		
		 }
		
		 catch (Exception e) {
		 
			 System.out.println(e.getClass().getName() + ":" + e.getMessage());
		 
		 }
	}
}
