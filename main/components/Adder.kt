package components

class Adder(val bitSize: Int) : CircuitComponent("${bitSize}-Bit Adder") 
{
    fun add(a: Int, b: Int): Int = (a + b) and ((1 shl bitSize) - 1)
}