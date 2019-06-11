# quotes

###Feature Tasks
Using the Ron Swanson quote api, the app generates a random Ron Swanson quote. If that isn't 
possible, it would use the file recentquotes.json to show random popular book quotes. Your program 
should use GSON to parse the .json file. The app needs no functionality other than showing the quote
 and the author when it is run. The app should choose one quote each time it is run. Also each Ron Swanson 
 quote is to be added to the recentquotes.json file.

## Using this app

git clone this repo 
```java
https://github.com/lhchandler4/quotes.git
```
```
cd quotes
```

```
idea .
```

 

###Approach & Efficiency
We used Scanner to read from recentquotes.json file and  Gson to parse file  from Json to Object 

### Testing

```./gradlew test``` 