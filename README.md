# quotes

Our problem domain is to read from JSON file and then get data from it randomly.

first we build a class for book that will take the same parameters as in the JSON file 

then we build a getters for the required data (author and the text)

then we build a toString method to show the data in a pretty way

after that in the App class we make imported some packages to serve our project like the GSON and typetoken from google 

first we instanciate from the GSON object

then we read the file using the buffered reader File method and we provided the path

we used the typetoken to convert the JSON data/file to an arraylist of books to use it

for the random output we did a Math method to get our random number and then implemented this number in a system.out method
