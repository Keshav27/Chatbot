package controllers.mongoConfiguration;

import PlayMorphia.MongoClientFactory;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;
import com.typesafe.config.Config;
import play.Configuration;

public class MyMongoClientFactory  extends MongoClientFactory {

    private Configuration config;

    public MyMongoClientFactory(Configuration config) {
        super(config);
        this.config = config;
    }

    public MongoClient createClient() throws Exception {

        MongoClientURI uri = new MongoClientURI(
                "mongodb+srv://keshav27:keshav27@cluster0-mtsng.mongodb.net/test");

        MongoClient mongoClient = new MongoClient(uri);
        MongoDatabase database = mongoClient.getDatabase("chatbot");
        System.out.println(database.toString());
        return mongoClient;
    }

    public String getDBName() {
        return config.getString("playmorphia.database");
    }

}