package generics.interfaces;
// 2. secenek generic interface i implemente eden class da generic değilse interface in data tipi belirtilmeli

public class GenericInterfaceStringImpl implements GenericInterface <String> {

    public GenericInterfaceStringImpl() {
        super();
    }

    @Override
    public void print(String value) {

    }

    @Override
    public String find() {
        return null;
    }
}
