package components

class RAM(val addressBits: Int, val dataBits: Int) : CircuitComponent("RAM") 
{
    private val memory = mutableMapOf<Int, Int>()

    fun write(address: Int, data: Int) 
    {
        val maskedAddress = address and ((1 shl addressBits) - 1)
        val maskedData = data and ((1 shl dataBits) - 1)
        memory[maskedAddress] = maskedData
    }

    fun read(address: Int): Int 
    {
        val maskedAddress = address and ((1 shl addressBits) - 1)
        return memory.getOrDefault(maskedAddress, 0)
    }
}
