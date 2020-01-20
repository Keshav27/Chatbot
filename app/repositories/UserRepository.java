package repositories;

import PlayMorphia.PlayMorphia;
import models.User;

import javax.inject.Inject;

public class UserRepository {

    @Inject
    PlayMorphia morphia;

    public User findByName(String username) {
       User user = morphia.datastore().
                createQuery(User.class).
                field("username").
                equal(username).
                get();
        return user;
    }

    public void save(User u) {
        morphia.datastore().save(u);
    }
}