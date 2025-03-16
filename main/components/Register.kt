package components

class Register(val bitSize: Int, val triggerType: String) : CircuitComponent("${bitSize}-Bit Register") 
{
    private var value: Int = 0

    fun store(data: Int) 
    {
        value = data and ((1 shl bitSize) - 1)
    }

    fun read(): Int = value
}
