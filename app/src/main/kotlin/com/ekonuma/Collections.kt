package com.ekonuma

fun main(){
    //Array
    val rockPlanets = arrayOf<String>("Mercury", "Venus", "Earth", "Mars")
    val gasPlanets = arrayOf("Jupiter", "Saturn", "Uranus", "Neptune")
    val solarSystemArray = rockPlanets + gasPlanets
    
    //List
    val solarSystemList = mutableListOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    println(solarSystemList.size)
    println(solarSystemList[0])
    println(solarSystemList.get(0))
    println(solarSystemList.indexOf("Earth"))
    solarSystemList.add(3, "Theia")
    for (planet in solarSystemList)
        println(planet)
    println("Future Moon" in solarSystemList)
    
    //Set
    val solarSystemSet = mutableSetOf("Mercury", "Venus", "Earth", "Mars", "", "Jupiter", "Saturn", "Uranus", "Neptune")
    println(solarSystemSet.size)
    solarSystemSet.add("Pluto")
    println(solarSystemSet.size)
    
    //Map
    val solarSystemMap = mutableMapOf(
        "Mercury" to 0,
        "Venus" to 0,
        "Earth" to 1,
        "Mars" to 2,
        "Jupiter" to 79,
        "Saturn" to 82,
        "Uranus" to 27,
        "Neptune" to 14
    )
    
    solarSystemMap["Pluto"] = 5
    println(solarSystemMap["Moon"])
}

