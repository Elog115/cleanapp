package com.esfe.cleanapp.domain.port.out;

public interface ISqlHealthPort {
    boolean ping() throws Exception;
}
