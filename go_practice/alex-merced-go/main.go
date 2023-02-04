package main

import (
	"fmt"
)

var print = fmt.Println

type person struct {
	Name string
	Age  int
}

type alien struct {
	Name   string
	Age    int
	Planet string
}

type sentient interface {
	SayMyName()
}

func (p person) SayMyName() {
	print("Hello, my name is " + p.Name)
}
func (a alien) SayMyName() {
	print("Hello, my name is " + a.Name)
}

func stats(s interface{}) {
	print(s)
}

func main() {
	// fmt.Println("Hello World")
	// var myName string
	// cheese := 5
	// myName = "Alex Merced"
	// print(myName, cheese)

	// if 5 > 6 {
	// 	print("This is true")
	// } else {
	// 	print("This is false")
	// }

	// for x := 0; x < 10; x++ {
	// 	print(x)
	// }

	// x := 0 // similar to while loop
	// for x < 10 {
	// 	print(x)
	// 	x++
	// }

	// x := 4
	// switch x {
	// case 1:
	// 	print(1)
	// case 2:
	// 	print(2)
	// default:
	// 	print("None of the above")
	// }

	// print(functions.HelloWorld())
	// print(functions.PrintWords("Hello", "World"))

	// cheese := "Gouda"
	// cheeseP := &cheese
	// *cheeseP = "American" //changes cheese variable to "American"

	// print(cheeseP)  // prints address of cheese variable
	// print(*cheeseP) // prints value of cheese variable
	// print(functions.CanIChangeString(cheese))
	// print(cheese)
	// print(functions.CanIChangeString1(cheeseP))
	// print(cheese)

	// var myArr1 [3]int
	// myArr1[2] = 5
	//OR
	// myArr := []int{1, 2, 3}
	// myArr[2] = 6

	// var mySlice []int
	// mySlice = append(mySlice, 5)
	// mySlice = append(mySlice, 6)
	// print(mySlice)

	// myArr := []int{1, 2, 3, 4, 5, 6, 7, 8, 9}
	// mySlice := myArr[3:6]
	// print(mySlice)
	// mySlice[2] = 7 // mySlice is a pointer to myArr
	// print(mySlice)
	// print(myArr)

	// myMap := map[string]int{
	// 	"AlexAge": 34,
	// 	"BobsAge": 55,
	// }
	//print(myMap["AlexAge"])

	// persons := []person{{Name: "Alex", Age: 34}, {Name: "Bob", Age: 55}}
	// print(persons[0])
	// persons[1].SayMyName()

	Alex := person{Name: "Alex Merced", Age: 34}
	Zim := alien{Name: "Zim", Age: 5000, Planet: "Jupiter"}

	Alex.SayMyName()
	Zim.SayMyName()
	stats(Alex)
	stats(Zim)
}
