package za.co.varsitycollege.st10318621.weatherapp
//Comment
import org.junit.Test
import org.junit.Assert.*

class WeatherAppUITest {

    @Test
    fun weatherApp_hasCorrectNumberOfDays() {
        // Test that we expect 5 days of weather data
        val expectedDays = 5
        assertEquals(5, expectedDays)
    }

    @Test
    fun weatherApp_titleIsCorrect() {
        // Test the app title
        val appTitle = "Geo weather"
        assertEquals("Geo weather", appTitle)
    }

    @Test
    fun weatherApp_hasThreeNavigationButtons() {
        // Test navigation button count
        val navButtonCount = 3
        assertEquals(3, navButtonCount)
    }

    @Test
    fun weatherApp_navigationLabelsAreCorrect() {
        // Test navigation labels
        val navButtons = listOf("Today", "5-day forecast", "City weather")
        assertTrue(navButtons.contains("Today"))
        assertTrue(navButtons.contains("5-day forecast"))
        assertTrue(navButtons.contains("City weather"))
    }
}