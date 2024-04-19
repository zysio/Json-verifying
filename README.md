# Json-verifying


## How to run

1. Clone this repository to your local machine: `git clone https://github.com/zysio/Json-verifying.git`
2. Go to project root directory.
3. Run tests by typing in terminal: `mvn test`


## Description

The json_verifying class requires creating an object and providing it with the file path as an argument. Within this class, there is a method named verify.

### Method verify inside json_verifying class:

1. Checks if the JSON has a valid format.
2. Checks if the file is empty or exists.
3. Checks all Resource fields contained within Statements.
4. Checks if Resource field exists.

If any of the Resource fields contain a single asterisk "*", the method will return false. Otherwise, it will return true.


## Contact

Krzysztof Cybulski - kcybulski205@gmail.com

Project link: https://github.com/zysio/Json-verifying.git

## License

Distributed under the MIT License. See LICENSE.txt for more information.
