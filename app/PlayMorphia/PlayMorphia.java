package PlayMorphia;

import com.mongodb.MongoClient;
import com.typesafe.config.Config;
import controllers.mongoConfiguration.MyMongoClientFactory;
import play.Configuration;
import play.Environment;
import play.inject.ApplicationLifecycle;
import xyz.morphia.Datastore;
import xyz.morphia.Morphia;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.lang.reflect.Constructor;
import java.util.concurrent.CompletableFuture;

/**
 * Created by morelli on 21/02/19.
 */
@Singleton
public class PlayMorphia {

    MongoClient mongo = null;
    Datastore datastore = null;
    Morphia morphia = null;

    @Inject
    public PlayMorphia(Configuration config) {
        try {
            configure(config);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private void configure(Configuration config) throws Exception {

        MongoClientFactory factory = getMongoClientFactory(config);
        mongo = factory.createClient();

        if (mongo == null) {
            throw new IllegalStateException("No MongoClient was created by instance of "+ factory.getClass().getName());
        }

        morphia = new Morphia();

        // Tell Morphia where to find our models
        morphia.mapPackage(factory.getModels());

        datastore = morphia.createDatastore(
                mongo, factory.getDBName());

    }

    protected MongoClientFactory getMongoClientFactory(Configuration config) throws Exception {
        return new MyMongoClientFactory(config);
    }


    public MongoClient mongo() {
        return mongo;
    }
    public Datastore datastore() { return datastore; }
    public Morphia morphia() { return morphia; }
}
