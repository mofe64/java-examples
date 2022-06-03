package com.company.diary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EntryTest {
    Entry entry;
    Entry entry1;

    @BeforeEach
    void setUp() {
        entry = new Entry("testTitle", "testBody");
        entry1 = new Entry("customId", "title", "body");
    }

    @Test
    void testThatWeCanCreateEntriesWithAllFields() {
        assertEquals("testTitle", entry.getTitle());
        assertEquals("testBody", entry.getBody());
        assertNotNull(entry.getId());
        assertEquals("customId", entry1.getId());
    }

    @Test
    void testThatWeCanSetTitleAndBody() {
        entry.setTitle("newTitle");
        entry.setBody("newBody");
        assertEquals("newTitle", entry.getTitle());
        assertEquals("newBody", entry.getBody());
    }

    @Test
    void testThatWeCanValidateEntryParameters() {
        assertThrows(IllegalArgumentException.class,
                () -> new Entry("", "test"));

        assertThrows(IllegalArgumentException.class,
                () -> new Entry("test title", ""));
    }


}