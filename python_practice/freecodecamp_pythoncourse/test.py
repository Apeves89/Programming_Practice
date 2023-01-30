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

#TUPLES
# tuples cannot be modified but acts as lists

# names = ("Roger", "Syd","Beau")

# names[0]    # "Roger"
# names.index("Roger")    # 0
# len(names)
# # print("Roger" in names)
# names[0:2]
# print(sorted(names))
# newTuple = names + ("Tina", "Quincy")
# print(newTuple)

#DICTIONARIES

# dog = {
#     "name":"Roger",
#     "age": 8,
#     'color':'green'
# }

# dog['name'] = 'Syd'
# print(dog["name"])
# print(dog)
# print(dog.get('name'))
# print(dog.get('color', 'brown'))
# print(dog.pop('name'))
# print(dog.popitem())
# print('color' in dog)
# print(list(dog.keys()))
# print(list(dog.values()))
# print(list(dog.items()))
# print(len(dog))
# dog['favorite food']= 'Meat'
# del dog['color']
# dogCopy = dog.copy()
# print(dog)

#SETS
#not ordered and mutable. Can only have one of each value

# set1 = {'Roger','Syd'}
# set2 = {'Roger'}
# intersect = set1 & set2
# mod = set1 | set2   #union between sets
# mod = set1 - set2      # difference between sets
# mod = set1 > set2
# mod = set1 < set2
# print(intersect)        #'Roger'
# print(mod)
# print(list(set1))


#FUNCTIONS
# def hello(name = "my friend"):
#     print('Hello '+ name)
# hello("Beau")
# hello("Quincy")
# hello()
    
# def hello(name,age):
#     print('Hello '+ name + ", you are " +
#           str(age) + " years old!")
# hello("Beau" ,39)
# hello("Quincy", 26)

# def change(value):
#     value['name'] = 'Syd'

# val = {'name': 'beau'}
# change(val)
# print(val)

# def hello(name):
#     # if not name:
#     #     return
#     print('Hello ' + name + '!')
#     return name, 'Beau', 8
    
# # hello(False)
# print((hello('Syd')))

# age = 8 
# def test():
#     print(age)
# print(age)
# test()

# def talk(phrase):
#     def say(word):
#         print(word)
    
#     words = phrase.split(' ')
#     for word in words:
#         say(word)
        
# talk('I am going to buy the milk')

# def count():
#     count = 0
#     def increment():
#         nonlocal count
#         count = count + 1
#         print(count)
#     increment()
    
# count()   #1
# count()   #1

# def counter():
#     count = 0
#     def increment():
#         nonlocal count
#         count = count + 1
#         return count
#     return increment
# increment = counter()

# print(increment())  #1
# print(increment())  #2
# print(increment())  #3

#OBJECTS

# age = 8
# print(age.real)
# print(age.imag)
# print(age.bit_length())

# items = [1,2]
# items.append(3)
# items.pop()
# print(id(items))

#LOOPS
# items = [1,2,3,4]
# for index,item in enumerate(items):     #enumerate() creates index in for loop
#     print(item, index)

# items = [1,2,3,4]
# for item in items:
#     if item ==2:
#         # continue            #continue stops iteration at that point and go to next iteration
#         break           # break  stops the loop 
#     print(item)

#CLASSES
# class Animal:
#     def walk(self):
#         print('Walking...')

# class Dog(Animal):
#     def __init__(self,name,age):
#         self.name = name
#         self.age = age
    
#     def bark(self):
#         print('woof!')
        
# roger = Dog('Roger', 8)

# print(roger.name)
# print(roger.age)
# roger.bark()
# roger.walk()

#MODULES
# import Dog
# Dog.bark()  #import file

# from Dog import bark    #import function from another file
# bark()

# from lib import Dog   #created lib directory to store files and import
# Dog.bark()

# from lib.Dog import bark
# bark()

# math for math utilities
# re for regular expressions
# json to work with JSON
# datetime to work with dates
# sqlite3 to use SQLite
# os for Operating System utilities
# random for random number generation
# statistics for statistics utilities
# requests to perform HTTP network requests
# http to create HTTP servers
# urllib to manage URLs

# import math 
# from math import sqrt

# print(sqrt(4))

#ACCEPTING ARGUMENTS THROUGH COMMAND LINE
# import sys

# name = sys.argv[1]

# print("hello " + name)

# import argparse
# parser = argparse.ArgumentParser(
#     description='This program prints the name of my dogs'
# )

# parser.add_argument('-c', '--color', metavar='color',
# required=True, choices={'red','yellow'}, help='the color to search for')

# args = parser.parse_args()

# print(args.color)

#LAMBDA FUNCTIONS
# lambda num : num * 2

# multiply = lambda a,b : a * b

# print(multiply(2,4))

#map(), filter(), reduce()
# numbers = [1,2,3]

# def double(a):
#     return a * 2

# double = lambda a : a * 2
# result = map(double, numbers)
# result = map(lambda a : a * 2, numbers)
# print(list(result))

# numbers = [1,2,3,4,5,6]
# # def isEven(n):
# #     return n % 2 == 0
# # result = filter(isEven, numbers)
# result = filter(lambda n : n % 2==0, numbers)
# print(list(result))

# from functools import reduce
# expenses = [
#     ('Dinner', 80),
#     ('Car repair', 120)
# ]

# # sum = 0
# # for expense in expenses:
# #     sum += expense[1]
# # print(sum)

# sum = reduce(lambda a , b: a[1] + b[1],expenses)
# print(sum)

#RECURSION

# 3! = 3 * 2 * 1 = 6
# 4! = 4 * 3 * 2 * 1 = 24
# 5! = 5 * 4 * 3 * 2 * 1 = 120

# def factorial(n):
#     if n == 1: return 1
#     return n * factorial(n-1)
# print(factorial(5))

# #DECORATORS

# def logtime(func):
#     def wrapper():
#         print('before')
#         val = func()
#         print('after')
#         return val
#     return wrapper

# @logtime
# def hello():
#     print('hello')
    
# hello()

# #DOCSTRINGS
# """Dog module

# This module does ... bla bla bla and provides the 
# following classes:

# -Dog
# ...
# """
# def increment(n):
#     """Increment a number"""
#     return n + 1
# class Dog:
#     """A class representing a dog"""
#     def __init__(self,name,age):
#         """Initialize a new dog"""
#         self.name = name
#         self.age = age
    
#     def bark(self):
#         """Let the dog bark"""
#         print('WOF!')
# print(help(Dog))


# #Annotations

# def increment(n: int) -> int:
#     return n + 1
# count: int = 0


#EXCEPTIONS

# try:
#     # lines of code
# except <ERROR1>:
#     # handler <ERROR1>
# except <ERROR2>:
#     #handler <ERROR2>
# else:
#     # no exceptions were raised, the code ran succesfully
# finally:
#     # do something in any case

# try:
#     result = 2/0
# except ZeroDivisionError:
#     print('Cannot divide by zero!')
# finally:
#     result = 1
# print(result)

# raise Exception('An error')     # returns custom error

# try:
#     raise Exception('An error')
# except Exception as error:
#     print(error)

# class DogNotFoundException(Exception):
#     print('inside')
#     pass

# try:
#     raise DogNotFoundException()
# except DogNotFoundException:
#     print('Dog not Found!')


# #LIST COMPRESSION
# numbers = [1,2,3,4,5]
# numbers_power_2 = [n**2 for n in numbers]
# print(numbers_power_2)

# #OPERATION OVERLOADING
# class Dog:
#     def __init__(self,name,age) -> None:
#         self.name = name
#         self.age = age
#     def __gt__(self,other):
#         return True if self.age > other.age else False
    
# roger = Dog('Roger',8)
# syd = Dog('Syd',9)

# print(roger> syd)

# # __add__() respond to the + operator
# # __sub__() respond to the - operator
# # __mul__() respond to the * operator
# # __truediv__() respond to the / operator
# # __floordiv__() respond to the // operator
# # __mod__() respond to the % operator
# # __pow__() respond to the ** operator
# # __rshift__() respond to the >> operator
# # __lshift__() respond to the << operator
# # __and__() respond to the & operator
# # __or__() respond to the | operator
# # __xor__() respond to the ^ operator

