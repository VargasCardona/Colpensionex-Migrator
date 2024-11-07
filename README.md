# Colpensionex Retirement Migrator

![Repo Size](https://img.shields.io/github/repo-size/VargasCardona/Colpensionex-Migrator )
![GitHub License](https://img.shields.io/github/license/VargasCardona/Colpensionex-Migrator )
![GitHub last commit](https://img.shields.io/github/last-commit/VargasCardona/Colpensionex-Migrator )

This project automates the transfer of contributors from private pension funds to the public pension fund, Colpensionex. Developed by EamSoft for Colpensionex, this tool streamlines the transfer process to improve service quality and reduce manual labor.

## Table of Contents
- [Background](#background)
- [Features](#features)
- [Technical Details](#technical-details)
- [Setup and Usage](#setup-and-usage)
- [Contributors](#contributors)
- [License](#license)

## Background
The current transfer process for contributors is manual, creating delays and affecting the quality of service. Automating this process with the **Utilitario Traspaso Colpensionex** will increase efficiency, reduce processing time, and enhance user satisfaction.

## Features
- **Automated Transfer**: Transfers contributors from private pension funds to Colpensionex based on eligibility.
- **CSV Data Integration**: Processes CSV files containing transfer requests and flagged contributors.
- **Priority Queue**: Enqueues approved contributors for transfer based on priority criteria.
- **Blacklist Management**: Handles a custom-linked list for contributors flagged for pension embargo.

## Technical Details
- **Programming Language**: Java
- **CSV Parsing**: Utilizes a base class with generic methods for reading/writing CSV data.
- **Data Caching**: All CSV data is stored in-memory using a `SuperCache` class for fast access.
- **Business Logic**: Defined in the `servicio` package, which includes validation logic for each transfer request.

## Setup and Usage
1. Clone the Repository:
```
git clone https://github.com/your-username/Utilitario-Traspaso-Colpensionex.git
cd Utilitario-Traspaso-Colpensionex
```

2. Compile the Project: Ensure you have Java installed, then run:
```
javac -d bin src/**/*.java
```
3. Run the Application:
```
java -cp bin MainClassName
```

## Contributors

- **Nicolás Vargas Cardona** - [GitHub Profile](https://github.com/VargasCardona)
- **Mateo Loaiza García** - [GitHub Profile](https://github.com/Matthub05)
- **Camilo Duarte Rivera** - [GitHub Profile](https://github.com/DuarteCamilo)
- **Nicolás Olaya Rincón** - [GitHub Profile](https://github.com/)

## License
This project is licensed under the [GNU General public license](https://www.gnu.org/licenses/) - see the LICENSE file for details.
