package io.orangebuffalo.testcontainersplaywrightsamples

import com.microsoft.playwright.Page
import com.microsoft.playwright.assertions.PlaywrightAssertions
import io.orangebuffalo.testcontainers.playwright.junit.PlaywrightExtension
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(PlaywrightExtension::class)
class BasicTest {

    @Test
    fun testBasic(page: Page) {
        page.navigate("https://github.com/orange-buffalo/testcontainers-playwright")
        PlaywrightAssertions.assertThat(page).hasTitle("GitHub - orange-buffalo/testcontainers-playwright")
    }
}
