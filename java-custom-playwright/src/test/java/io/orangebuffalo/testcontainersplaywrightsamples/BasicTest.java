package io.orangebuffalo.testcontainersplaywrightsamples;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.assertions.PlaywrightAssertions;
import io.orangebuffalo.testcontainers.playwright.junit.PlaywrightExtension;
import java.util.regex.Pattern;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(PlaywrightExtension.class)
class BasicTest {

    @Test
    void testBasic(Page page) {
        page.navigate("https://github.com/orange-buffalo/testcontainers-playwright");
        PlaywrightAssertions.assertThat(page)
                .hasTitle(Pattern.compile(".*orange-buffalo/testcontainers-playwright.*"));
    }
}
