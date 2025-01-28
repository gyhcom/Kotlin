package com.gyh.kotlinbasics


fun main(){
    var shoppingList = mutableListOf("Processor", "RAM", "Graphics Card")

    shoppingList.add(2,"Cooling System")
    shoppingList.remove("Graphics Card")
    shoppingList.add("Graphics Card 100")

    shoppingList.removeAt(1)

    for(item in shoppingList){
        println(item)
    }

    for (index in 0 until shoppingList.size) {
        println("item ${shoppingList[index]} is at index $index")
    }
}
