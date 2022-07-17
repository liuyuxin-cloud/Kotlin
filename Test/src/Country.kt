data class Country(
    val name: String,
    val continient: String,
    val population: Int)

class CountryApp{
    fun filterCountries(countries: List<Country>, test: (Country) -> Boolean): List<Country> {
        val res = mutableListOf<Country>()
        for(c in countries) {
            if(test(c)) {
                res.add(c)
            }
        }
        return res
    }
}

