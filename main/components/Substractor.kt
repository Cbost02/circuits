package components

class Subtractor(val bitSize: Int) : CircuitComponent("${bitSize}-Bit Subtractor") 
{
    fun subtract(a: Int, b: Int): Int = (a - b) and ((1 shl bitSize) - 1)
}
