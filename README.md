# d4ss63dd2-9Ma8-s11e4-aeB1-ps4sac1D0Gd3
This is a Covid Statistics application which works with data from JSON. 

### Startup
1. Open project with IntelliJ and start the StatisticsApplication.class.
2. The service will be accessible at "localhost:8080".

### API
1. POST / - Save data from [JSON](https://api.covid19api.com/summary) to database.
2. GET /country/{countryCode} - Get data by specifying country code. Example: BG
3. GET / - List all saved countries.
