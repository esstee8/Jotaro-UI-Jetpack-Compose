// GOAL : Just learn the swift syntax lol

/*
 Big Takeaways/Differences from Python:
 * String Interpolation
 * Some functions require that you name the parameter, for readibility
 * Provide a 'default' option for dictionaries, to cover the possibility that the Key:Value pair doesn't exist
 * "Swift must at all times know what data types your constants and variables contain"
 * Swift requires that we always explicitly mention the parameter (along with it's value) when calling a function (Ok it's not required but it's always a good idea in Swift). Also, we must respect the order of the parameters such that the arguments also align with the parameter ordering (even if we name it)
 
 * Parameter overloading. Documentation exists for two functions of the same name, but with differing parameters:
*   hireEmployee(name:) or hireEmployee(title:)
 
 
 */

import UIKit

// Can use semicolons like matlab
var poop = "Hello, poop";
var butt = "butt"

// Constant
let bepis = "bepis"

var list_of_word = [poop, butt, bepis]

print(list_of_word)

//              /               //

let jackson = """

\"Micheal\".jpeg

joe.jpeg

"""

print(jackson.uppercased())
print(jackson.hasPrefix(""))
print(jackson.hasSuffix("Z"))


//              /               //

print(100_000_120) // you can prettify it w/underscores
var test_num = 100_000_120

// Swift lets us set variable names that
print(test_num.isMultiple(of: 10))
// Use the '!' operator and '.toggle()' to do the same thing

var bep = true
print(bep.toggle())
print(!test_num.isMultiple(of: 7))

//              /               //

print(0.1 + 0.2)

print(Int(1.0) + 11)
print(1.0 + Double(11))

//              /               //


//               /               //


var asdf = "butts";
var two = 2.0
var twosy = 20
var listy = [1,2,3]

// Calculations can happen inside of a String Interpolation
// You concantenate strings as in python, but Interpolation is ALWAYS the quickest
// So, just do interpolation in swift
print("I want \(twosy) chicken nuggets, with \(two + 1) L of sauce, slathered on my \(asdf) while counting \(listy.capacity)")

// Special notation for initializing arrays of a type
//  "Initializing" is just saying we're allocating memory for a type of data
// No mixing of types.
var albums = Array<String>()
var albums_but_sleeker = [String]() // like python, except put type inside

let bepis_recipe = [
    "bean": "cola",
    "sweetener": "hfcs",
    "location": "Nashville Factory"
]

/*
 
 “Expression implicitly coerced from 'String?' to 'Any’”,
 but it will really mean
 "Expression converted from 'Optional String' to a Generic type"
 So we print the conversion to 'Generic type'
 
 
 Since it's a String? (String Optional) we HAVE TO provide what to print in the case it doesn't have a value for the provided key.
 
 */

print("\n Bepis has the following sweetener: \(bepis_recipe["sweetener", default: "NONE FOUND"])")

print("\n Bepis has the following cocaine: \(bepis_recipe["Cocaine Amount (g)", default: "NONE FOUND"])")



// Keys can be strings or integers or some other type
// Values can obviously be another type
// Like arrays, Dictionaries must have ONE type for the key, and ONE type for value

var heights = [String: Int]()
heights["Antonio"] = 180
heights["Fernanda"] = 150
print(heights)

// SETS - No duplicates, order is unmaintained
//      -> Uniqueness, Searching is fast


// ENUMS - Enumeration : "the action of mentioning a number of things one by one."
// Enums are like fuzzy logic. Instead of being 'True-False', enums allow us to encapsulate a countable, finite selectable range of values
// F.ex
enum Teletubbies { // This is an enum of type 'Teletubbies'
    case TinkyWinky, Dipsy, Lala, Po
}
// Enums are made of constants, and we can't change constant values inside
//  This allows for some syntax sugar
var current_tubby = Teletubbies.Lala
current_tubby = Teletubbies.TinkyWinky
current_tubby = .Lala // We omit the orignal object; It's implicit


// Type Annotations
//  Type inference: The type is INFERRED from the value
// -> Explicitly mention the value in situations where Swift may falsly assume it to be another type
// -> Also for arrays; We explicitly say the type when we don't have any values to currently store. Swift wouldn't be able to infer the type otherwise.

//var mL = 34 // But mL aren't limited to integers
var mL: Double = 34.0 // Variable milliliters defined as a Double, assigned to value 34.0

var empty_str_array = [String]()

// On the topic of Type Annotations, this is how we make a placeholder variable
let president: String

president = "John Cena"

//" Swift must at all times know what data types your constants and variables contain "


//          /           //

var bepis_bool = true

if bepis_bool {
    print("COCA COLA LIGHT!")
}

var username_: String = ""

if username_.isEmpty { // count of 0 is optimal.
    username_ = "Anonymous"
}

print(username_)

// squeeze

var bepis_calories = 154.0

if bepis_calories > 150.0 && bepis_calories < 160.00 {
    print("Calories amount is \(bepis_calories)")
}


//var curr_tubby = Teletubbies.Lala
var curr_tubby = Teletubbies.Po

if curr_tubby == .Lala {
    print("LALA!")
} else if curr_tubby == .Po {
    print("PO!")
} else if curr_tubby == .Dipsy {
    print("DIPSY!")
} else {
    print("TINKY WINKY!")
}

//                                                      //
// Using a switch in conjunction with enums allows (and forces) us to write cases for each individual case once (and only once)

// So we conduct a Switch-Case check on a variable that's initialized as an Enum value
switch curr_tubby {
case.Dipsy:
    print("DIPSY")
case.Lala:
    print("LALA")
case.Po:
    print("PO")
case.TinkyWinky:
    print("TinkyWinky")
//default:
//    print("Teletubby not found")
}

// default above will never be executed becase we're running it on an enum
// The possibilites are countable
// Which is why we do it on strings lol.
// Swift matches cases in ORDER -> DEFAULT MUST ALWAYS BE LAST
// We use `fallthrough` to execute the next case (and only the next case). Of course, unless if we put *another* fallthrough in the next case.

asdf = "tinky"

switch asdf {
case "tinky":
    print("winky")
    fallthrough
case "asdf":
    print("asdf")
    fallthrough
default:
    print("infinite case")
}

//////
///
/// TERNARY OPERATOR - 'What ? True : False '
/// Generally, Ternary operators are cleaner
let age = 18
let canVote = age >= 18 ? "yes" : "no"
print(canVote)


let tele = [Teletubbies.Lala, Teletubbies.Po, Teletubbies.Dipsy, Teletubbies.TinkyWinky]
let tubbyCount = tele.isEmpty ? "no tubbies" : "\(tele.count) tubbies"


// For-Each Loop
for tubbies in tele{
    print("\(tubbies) !!!!")
}

for teletubbies in tele {
    print(teletubbies)
}

// for i in Range 1 to 3
for _ in 1 ..< tele.count {
    print(" teletubby")
}


// Functions declared once can be used above and below
bepisPlus()
// Break and Continue keywords
func bepisPlus(){
    print("Bepis+")
}
bepisPlus()

func printTimesTables(number: Int) {
    for i in 1 ..< 13{
        print("\(i) x \(number) is \(i*number)")
    }
}

// We use argument of `3` for parameter `number`
printTimesTables(number: 3)


var x = 3.0
x = sqrt(x)
print(x)

func rollDice() -> Int {
    Int.random(in: 1...6) //One-liner; IMPLICIT RETURN!
}

for _ in 1...10 {
    print(rollDice())
}


var one = "asdf"
var twos = "afds"
func compareStr(one: String, two: String) -> Bool {
    Set(one) == Set(two)
}
print(compareStr(one: one, two: twos))

// TUPLES!!!! - Return more than one piece of data
// A benefit to parameter names is that it allows us to dictate *which* paramter of the tuple we want. Sort of like a dictionary. But Tuples GUARANTEE DATA!
// Also, dictionaries may have tons of data

func getTubby() -> (first: String, last: String) {
    (first: "Tinky", last: "Winky")
}
var tubby = getTubby() // ****
print("\(tubby.first) then a \(tubby.last)")

var (tubby_first, tubby_last) = getTubby() // ****
print(tubby_last)
print(tubby_first)
print("____")
let (_, last_asdf) = getTubby() // ****
print(last_asdf)







