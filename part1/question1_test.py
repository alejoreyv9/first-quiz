from question1 import get_city_weather

def test_get_city_weather():

  assert get_city_weather("Quito") == "22 degrees and cloudy"

  assert get_city_weather("Sao Paulo") == "17 degrees and cloudy"
