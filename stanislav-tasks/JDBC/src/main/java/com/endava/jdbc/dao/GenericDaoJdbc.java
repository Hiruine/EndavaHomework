package com.endava.jdbc.dao;

public interface GenericDaoJdbc <T> {
    void create(T t);
    T read(T object);
    T update(T object);
    void delete(T t);
}
