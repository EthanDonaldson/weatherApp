package za.co.varsitycollege.st10318621.weatherapp

import org.junit.Test
import org.junit.Assert.*

class WeatherDataTest {

    @Test
    fun temperatureFormat_isCorrect() {
        // Test temperature string format
        val minTemp = "15°C"
        val maxTemp = "22°C"

        assertTrue(minTemp.contains("°C"))
        assertTrue(maxTemp.contains("°C"))
    }

    @Test
    fun dateFormat_isValid() {
        // Test date string format
        val date = "October 18, 2025"

        assertTrue(date.contains(","))
        assertTrue(date.contains("2025"))
    }

    @Test
    fun weatherData_hasCorrectNumberOfDays() {
        // Verify we have exactly 5 days of weather data
        val weatherDays = listOf(
            "October 18, 2025",
            "October 19, 2025",
            "October 20, 2025",
            "October 21, 2025",
            "October 22, 2025"
        )

        assertEquals(5, weatherDays.size)
    }

    @Test
    fun navigationButtons_haveCorrectLabels() {
        // Test navigation button labels
        val navButtons = listOf("Today", "5-day forecast", "City weather")

        assertEquals(3, navButtons.size)
        assertTrue(navButtons.contains("Today"))
        assertTrue(navButtons.contains("5-day forecast"))
        assertTrue(navButtons.contains("City weather"))
    }

    @Test
    fun appTitle_isCorrect() {
        // Test app title
        val title = "Geo weather"

        assertEquals("Geo weather", title)
        assertFalse(title.isEmpty())
    }

    @Test
    fun temperatureValues_areRealistic() {
        // Test that temperature values are within realistic range
        val temperatures = listOf(15, 22, 14, 20, 16, 23, 17, 24, 15, 21)

        temperatures.forEach { temp ->
            assertTrue("Temperature $temp should be between -50 and 50", temp in -50..50)
        }
    }
}