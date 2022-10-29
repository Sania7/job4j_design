package ru.job4j.assertj;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class NameLoadTest {

    @Test
    void checkEmpty() {
        NameLoad nl = new NameLoad();
        assertThatThrownBy(nl::getMap)
                .isInstanceOf(IllegalStateException.class)
                .hasMessageContaining("no data");
    }

    @Test
    void checkWithOut() {
        NameLoad nl = new NameLoad();
        assertThatThrownBy(() -> nl.parse("name"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("does not contain the symbol");
    }

    @Test
    void checkFirstCharacter() {
        NameLoad nl = new NameLoad();
        assertThatThrownBy(() -> nl.parse("=name"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("does not contain a key");
    }

    @Test
    void checkLastCharacter() {
        NameLoad nl = new NameLoad();
        assertThatThrownBy(() -> nl.parse("name="))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("does not contain a value");
    }

    @Test
    void checkWithEmptyMap() {
        NameLoad nl = new NameLoad();
        assertThatThrownBy(nl::parse)
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Names array is empty");
    }
}