package components

class Multiplexer(val bitSize: Int) : CircuitComponent("${bitSize}-Bit Multiplexer") 
{
    fun select(input0: Int, input1: Int, selectBit: Boolean): Int 
    {
        return if (selectBit) input1 else input0
    }
}