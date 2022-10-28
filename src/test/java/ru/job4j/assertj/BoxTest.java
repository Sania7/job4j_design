package ru.job4j.assertj;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BoxTest {

    @Test
    void isThisSphere() {
        Box box = new Box(0, 10);
        String name = box.whatsThis();
        assertThat(name).isEqualTo("Sphere")
                .isNotNull();
    }

    @Test
    void isThisNotTetrahedron() {
        Box box = new Box(3, 1);
        String name = box.whatsThis();
        assertThat(name).isNotEqualTo("Tetrahedron")
                .isNotNull();
    }

    @Test
    void getNumberOfVertices() {
        Box box = new Box(4, 1);
        int a = box.getNumberOfVertices();
        assertThat(a).isEqualTo(4).isEven()
                .isPositive()
                .isNotZero()
                .isNotNegative();
    }

    @Test
    void isExist() {
        Box box = new Box(8, 1);
        boolean d = box.isExist();
        assertThat(d).isTrue()
                .isNotNull();
    }

    @Test
    void isNotExist() {
        Box box = new Box(3, 1);
        boolean b = box.isExist();
        assertThat(b).isFalse()
                .isNotNull();
    }

    @Test
    void getArea() {
        Box box = new Box(8, 1);
        double s = box.getArea();
        assertThat(s).isEqualTo(6)
                .isPositive()
                .isNotNull()
                .isNotNegative();
    }

    @Test
   void isNotGettingArea() {
        Box box = new Box(3, 0);
        double d = box.getArea();
        assertThat(d).isEqualTo(0.0);
    }
}