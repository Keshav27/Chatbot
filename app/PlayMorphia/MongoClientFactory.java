package PlayMorphia;

import com.typesafe.config.Config;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import play.Configuration;

import javax.inject.Inject;

/**
 * Created by morelli on 21/02/19.
 */
public class MongoClientFactory {

    protected Configuration config;
    protected boolean isTest;

    @Inject
    protected MongoClientFactory(Configuration config) {
        this.config = config;
        this.isTest = false;
    }

    /**
     * Creates and returns a new instance of a MongoClient.
     *
     * @return a new MongoClient
     * @throws Exception
     */
    public MongoClient createClient() throws Exception {
        MongoClientURI uri = getClientURI();
        MongoClient mongo = new MongoClient(uri.getDatabase());

        return mongo;
    }


    /**
     * Returns the database name associated with the current configuration.
     *
     * @return The database name
     */
    public String getDBName() {
        return getClientURI().getDatabase();
    }

    protected MongoClientURI getClientURI() {
        MongoClientURI uri = new MongoClientURI(
                isTest
                        ? config.getString("playmorphia.test-uri")
                        : config.getString("playmorphia.uri"));
        return uri;
    }

    /**
     * Returns the models folder name associated with the current configuration.
     *
     * @return The models folder name
     */
    public String getModels() {
        return config.getString("playmorphia.models");
    }


}
