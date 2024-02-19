package org.bostonbragg.billstracker.converters;

import org.springframework.stereotype.Component;

@Component
abstract public class Converter<T, U> {
    protected abstract U apply(T object);
}
