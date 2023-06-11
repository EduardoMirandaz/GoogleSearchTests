package factory.base_factory;

import com.github.javafaker.Faker;

public abstract class BaseFactory {

    protected static Faker FAKER = new Faker();

    public static String createRandomStringToSearchFor(){
        String randomString;
        do {
            randomString = FAKER.esports().game();
        } while (randomString.contains("."));
        return randomString;
    }


}
