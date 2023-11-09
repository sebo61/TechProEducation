package generics.interfaces;
// GENERİC İNTERFACE implemente eden class da gemneric olmalı

public class GenericInterfaceImpl <T> implements GenericInterface <T> {
    @Override
    public void print(T value) {

    }

    @Override
    public T find() {
        return null;
    }
}
