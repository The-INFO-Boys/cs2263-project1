# Acceptance Tests

1. Play Tile

**GIVEN**: The player has six tiles  
**WHEN**: The player plays a tile  
**BUT**: It has no adjacent tiles  
**THEN**: The system adds the tile to the board  

**GIVEN**: The player has six tiles  
**WHEN**: The player plays a tile  
**AND**: The tile is adjacent to another tile  
**BUT**: The tile isn't an active hotel  
**AND**: A hotel is available to be founded  
**THEN**: The system prompts the user to create a hotel

**GIVEN**: The player has six tiles  
**WHEN**: The player plays a tile  
**AND**: The tile is adjacent to another tile  
**BUT**: The tile isn't an active hotel  
**AND**: A hotel is not available to be founded  
**THEN**: The system prompts the user that a hotel cannot be created

**GIVEN**: The player has six tiles  
**WHEN**: The player plays a tile  
**AND**: The tile is adjacent to an active hotel  
**THEN**: Add tile to active hotel chain

**GIVEN**: The player has six tiles  
**WHEN**: The player plays a tile  
**AND**: The tile is adjacent to two active hotels  
**THEN**: Merge the active hotels

2.Merge Hotels

**GIVEN**: A merge occurred between two hotels  
**WHEN**: The hotels are the same size  
**THEN**: The player selects which hotel is acquired by the other  

**GIVEN**: A merge occurred between two hotels  
**WHEN**: A primary and secondary shareholder are determined  
**THEN**: Give primary bonus to the primary shareholder and the secondary bonus to the secondary shareholder

**GIVEN**: A merge occurred between two hotels  
**WHEN**: A tie for primary shareholder is determined  
**THEN**: Add the primary and secondary shareholder bonus together and divide it amongst tied players

**GIVEN**: A merge occurred between two hotels  
**WHEN**: A primary shareholder is determined  
**BUT**: A tie for secondary shareholder is determined  
**THEN**: Give the primary shareholder bonus to the primary shareholder and split the secondary shareholder bonus between tied secondary shareholder players

**GIVEN**: A merge occurred between two hotels  
**WHEN**: A player has shares with acquired hotel  
**AND**: The player chooses to sell the stocks  
**THEN**: The player gets money per stock they choose to sell

**GIVEN**: A merge occurred between two hotels  
**WHEN**: A player has shares with acquired hotel  
**AND**: The player chooses to trade the stocks  
**THEN**: The player gets 1 stock per 2 stocks they choose to trade

**GIVEN**: A merge occurred between two hotels  
**WHEN**: A player has shares with acquired hotel  
**AND**: The player chooses to hold the stocks  
**THEN**: The player keeps the stocks they chose to keep

3. Buy Stock

**GIVEN**: The player chooses to buy stock  
**WHEN**: A hotel is not present  
**THEN**: The player cannot buy stocks

**GIVEN**: The player chooses to buy stock  
**WHEN**: Stocks are available to buy  
**AND**: The player decides to buy three stock of a hotel  
**THEN**: They lose the cost per stock of what stock they decided to buy

**GIVEN**: The player chooses to buy stock  
**WHEN**: Stocks are available to buy  
**AND**: The player decides to buy three stock of a hotel  
**BUT**: Only two stocks are available  
**THEN**: They are unable to purchase the stocks

**GIVEN**: The player chooses to buy stock  
**WHEN**: Stocks are available to buy  
**AND**: The player decides to buy three stock of a hotel  
**BUT**: They have already bought two stock this turn  
**THEN**: They are unable to purchase the stock  

**GIVEN**: The player chooses to buy stock  
**WHEN**: Stocks are available to buy  
**AND**: The player decides to buy three stock of a hotel  
**BUT**: The player does not have enough money to buy three stocks  
**THEN**: They are unable to purchase the stock

4. Save

**GIVEN**: The player chooses to save the game  
**WHEN**: A file location is provided  
**THEN**: The system stores the game in a file and stores it at said location

**GIVEN**: The player chooses to save the game  
**WHEN**: A file location is provided
**BUT**: Saving is unsuccessful  
**THEN**: The system returns an error that it could not be saved

5. Load

**GIVEN**: The player chooses to load a game  
**WHEN**: A file location is provided  
**THEN**: The system loads the provided file and updates the game based on said file

**GIVEN**: The player chooses to load a game  
**WHEN**: A file location is provided  
**BUT**: Loading the file was unsuccessful  
**THEN**: The system returns an error that it could not be loaded