package functions

func HelloWorld() string {
	return "Hello World"
}

func PrintWords(x, y string) string {
	return x + " " + y
}

func CanIChangeString(x string) string {
	x = "Provolone"
	return x
}

func CanIChangeString1(x *string) *string {
	*x = "Provolone"
	return x
}
