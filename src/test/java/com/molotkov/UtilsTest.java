package com.molotkov;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

import static org.rnorth.visibleassertions.VisibleAssertions.assertEquals;

public class UtilsTest {

    @Test
    public void testIterateSimultaneously() {
        final List<String> list1 = new ArrayList<>();
        final List<String> list2 = new ArrayList<>();
        list1.add("hello");
        list2.add("world");
        String result = "";
        Utils.iterateSimultaneously(list1,list2, (String str1, String str2) -> {
            result.concat(String.format("%s %s!", str1, str2));
        });
        assertEquals("IterateSimultaneously method succeeds", "hello world!", result);
    }
}
