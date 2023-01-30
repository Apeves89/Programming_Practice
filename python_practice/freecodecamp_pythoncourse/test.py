# name = ' Beau'
# age = 39
# gpa = 3.7

#Possible variable syntax
# name1 = 'john'
# HEIGHT = '5ft 7in'
# my_name = 'Alex'
# _name = 'Scott'
# print(type(age))        # returns type of variable
# print(isinstance(name, str))

# print(int("20"))              #converts string to integer, no decimals or text
# print(float('20'))            # converts to float.

# 1 +1 #2
# 2 - 1 #1
# 2 * 2 #4
# 4 / 2 #2
# 4 % 3 #1 modulo/modulus
# 4 ** 2 #16 exponents
# 5 // 2 #2 floor division, divides and rounds down to nearest whole number

# a = 1
# b = 2

# a == b #False
# a != b # True
# a > b #False
# a <= b #True

# name = 'Beau'
# print("""Beau is
#       39 
#       years
#       old""")
# print(name.strip())
# print("Beau".lower())
# print("beAu pERson".title())
# print("Beau".islower())
# String Methods
# isalpha()   #check if string contains only characters and is not empty
# isalnum()   # check if a string contains characters or digits and is not empty
# isdecimal() # check if a string contains digits and is not empty
# lower()     # all characters set to lowercase
# islower()   # check if string is all lowercase
# upper()     # all characters set to uppercase
# isupper()   # check if string is all uppercase
# title()     #capitalizes first character of each word in string
# startswith()# check if string starts with specific substring
# endswith()  # check if string ends with specific substring
# replace()   #replace a part of a string
# split()     #splits a string by specified separator into a list
# strip()     #trim the whitespace from a string
# join()      #joins an iterable into one string
# find()      #find the position of a substring, returns -1 if not found
# len()       #returns the length of a string

# name1 = "Be\nau"     #Be   # \ escape character
                       #au
# print(name[1:3])        # ea

#BOOLEANS
# book_1_read = True
# book_2_read = False
# read_any_book = any([book_1_read, book_2_read]) # checks if any of the values are true and returns True of False
# read_all_book = all([book_1_read, book_2_read]) #checks if all of the values are true 

#NUMBER DATA TYPES
# num1 = 2+3j
# num = complex(2,3)
# # print(num.real, num.imag)
# abs(-5.5)   #returns absolute value of numbers
# round(5.49) # rounds up or down as usual rounding

# from enum import Enum
# class State(Enum):      # used to define constants, cannot be altered
#     INACTIVE = 0
#     ACTIVE = 1
    
# print(State.ACTIVE.value)
# print(list(State))

#USER INPUT
# age =input("What is your age? ")
# print("Your age is " + age)

#CONDITIONAL STATEMENTS
# condition = True
# if condition == True:
#     print("The condition")
#     print("was True")
# else:
#     print("The condition")
#     print("was False")

# condition = False
# name = "Beau"

# if condition == True:
#     print("The condition")
#     print("was True")
# elif name == "Roger":
#     print("Hello Roger")
# elif name == "Syd":
#     print("Hello Syd")
# elif name == "Flavio":
#     print("Hello Flavio")
# else:
#     print("The condition")
#     print("was False")

#LISTS

# dogs = ["Roger", 1, "Syd", True,"Quincy",7]

# print("Roger" in dogs)   
# print(dogs[2]) 
# dogs[2] = "Beau"
# print(dogs[2:4])
# print(len(dogs))
# dogs.append("Judah")    #add to the list
# dogs.extend(["Judah",5])    #add list to existing list
# dogs += ["Alex", 9]         #add list to existing list
# dogs.remove("Beau")         #removes item from list based on value
# print(dogs.pop())           #removes index or last item if not specified
# dogs.insert(2,"Test")
# dogs[1:1] = ["Test1", "Test2"]
# dogs = ["Roger", "Syd", "Quincy", "beau"]
# dogscopy = dogs[:]
# dogs.sort(key=str.lower)        # sorts disregarding capitalization
# print(dogscopy)
# print(sorted(dogs, key=str.lower))
# print(dogs)