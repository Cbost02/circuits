package main

import components.*

class MainCircuit {
    val components = mutableListOf<CircuitComponent>()

    fun addComponent(component: CircuitComponent) 
    {
        components.add(component)
    }

    fun listComponents() 
    {
        components.forEach { println(it.name) }
    }
}