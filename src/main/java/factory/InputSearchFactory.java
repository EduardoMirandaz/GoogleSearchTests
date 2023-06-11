package factory;

import factory.base_factory.BaseFactory;

public class InputSearchFactory extends BaseFactory {

    public static String createNewRandomInput(){
        return (createRandomStringToSearchFor());
    }

}
