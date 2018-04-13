package com.ymmihw.spring.integration.introduction.endpoints;

public interface Activator<T> {

  public void handleMessage(T input);

}
