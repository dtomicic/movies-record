<h1 align="center">
  Movie records desktop application
  <br>
  (University project)
</h1>
<br>


## Table of contents
- [Project task](#project-task)
- [Features](#features)
- [Installation](#installation)


## Project task
This project was developed as an assignment for subject "Introduction to Java". The task alone was to design and develop a desktop application that allows user to keep a record of all the movies they own (for example a TV station).

Some of the functions the application was supposed to have were:
  - Input of the movies along with the various checks (e.g. name of the director can't be numerical value, etc.)
  - Submitted movies should be displayed in a table on the main page
  - Table with all the movies should be easily searchable with a search bar, also values in the table should be case insensitive
  - Function to delete the values from a table and/or to empty the whole table
  - Contents of the table should be written to a seperate file where the data would be save in case of deleting the values from the table

## Features
Once the application is started user is greeted with a main window displaying a button for submitting a movie, button to exit the application and an empty table along with the search bar and buttons for controlling the table.

If the user chooses to submit a movie, another window opens up allowing the user to input the movie details(movie name, directors name, the year movie was released in and the genre of the movie). Once the user submits the movie he gets a message telling him the movie was submitted sucesfully. From this point user can go ahead and submit as many more movies as needed or he can simply close the window for submitting the movie and see his data displayed in the tabel.

Now user can easily search his table with the search bar right above it or he can choose to delete the whole table or just a specific movie from it.

All of the data user has submitted is saved in a .txt file inside of the applications folder.

## Installation
1. Clone the repository
2. Enter the dist folder
3. From there simply start the .jar application and you're all set
