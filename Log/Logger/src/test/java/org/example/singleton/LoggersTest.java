package org.example.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoggersTest {

    @Test
    public void deveRetornarMensagem() {
        Loggers.getInstance().setMessage("Teste bem sucedido!");
        assertEquals("Teste bem sucedido!", Loggers.getInstance().getMessage());
    }

}