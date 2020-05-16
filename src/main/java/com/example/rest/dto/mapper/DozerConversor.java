package com.example.rest.dto.mapper;

import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;
import java.util.*;


public class DozerConversor {

    private static Mapper mapper = DozerBeanMapperBuilder.buildDefault();

    public static <O,D> D parseObject(O origem, Class<D> destino) {
        return mapper.map(origem,destino);
    }

    public static <O,D> List<D> parseListObjects(List<O> origem, Class<D> destino) {
        List<D> destinoObjects = new ArrayList<D>();
        for (Object origens: origem ) {
            destinoObjects.add(mapper.map(origens,destino));
        }
        return destinoObjects;
    }
}
