package com.jetbrains.amt;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.nio.file.Paths;

public class Mp3UtilTest {

    @Test
    void getArtist_shouldBe_AungMyatThu() {
        String artist = Mp3Util.getArtist(Paths.get("./my.mp3"));
        Assertions.assertEquals("Aung Myat Thu", artist);
    }
}
