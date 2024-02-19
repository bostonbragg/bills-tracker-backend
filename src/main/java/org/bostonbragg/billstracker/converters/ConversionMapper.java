package org.bostonbragg.billstracker.converters;

import org.bostonbragg.billstracker.BillsTrackerApplication;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.ResolvableType;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ConversionMapper {
    ApplicationContext context;

    @Autowired
    ConversionMapper(ApplicationContext context) {
        this.context = context;
    }

    public <T, U> U convert(T o, Class<U> clazz) {
        ResolvableType type = ResolvableType.forClassWithGenerics(Converter.class, o.getClass(), clazz);
        return (U) ((Converter) context.getBeanProvider(type).getObject()).apply(o);
    }

    public <T, U> List<U> convertList(List<T> list, Class<U> clazz) {
        return list.stream().map(o -> convert(o, clazz)).toList();
    }
}
