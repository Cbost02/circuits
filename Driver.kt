package main

import components.*

fun main() 
{
    val circuit = MainCircuit()

    val adder = Adder(4)
    val register = Register(8, "High-Level")
    val display = SevenSegmentDisplay()

    circuit.addComponent(adder)
    circuit.addComponent(register)
    circuit.addComponent(display)

    circuit.listComponents()
}