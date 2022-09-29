package com.patterns.factory;

public interface Factory<T> {

	T create(String insuranceType);

}
