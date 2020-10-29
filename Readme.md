# Slot Machine

In the project directory, you can build:

`mvn clean package`

and run:

`java -jar target/slotmachine-0.0.1-SNAPSHOT.jar`

Runs the app in the development mode.<br />
[http://localhost:8080](http://localhost:8080).


## API endpoints

All available endpoints.

### Slotmachine

POST /pull<br />

## Given – slot machine requirements
   
This is a typical slot machine reel matrix. An occurrence of 3 same symbols starting on reel1 in a horizontal or diagonal alignment will result in a win. This is called a „winline“

| Reel1 | Reel2 | Reel3 |
|-------|-------|-------|
| A     | B     | C     |
| C     | C     | B     |
| A     | A     | A     |
| C     | B     | A     |
| A     | A     | A     |
| C     | C     | A     |
| A     | A     | A     |
| B     | C     | C     |
| C     | B     | C     |
| C     | C     | B     |
| C     | A     | B     |
| A     | A     | C     |
| B     | A     | C     |
| C     | B     | A     |
| B     | A     | C     |
| C     | B     | A     |
| A     | A     | C     |
| C     | B     | A     |
| B     | C     | C     |
| A     | B     | A     |
| B     |       | C     |
| A     |       |       |

Wins
- 3 times an A wins 10 cents
- 3 times a B wins 15 cents
- 3 times a C wins 20 cents

The win calculation will be done on a 3x3 subset of the whole reel matrix always starting from left to right.

### Task – build your own small slot machine win evaluation
Collect a random position for each reel to use as a starting point for the win calculation subset. Perform all horizontal and diagonal winline calculations on this subset and return the resulting values via a small API to an imaginary frontend. The resulting value should at least contain:
- Information for each winline
- The total win amounts