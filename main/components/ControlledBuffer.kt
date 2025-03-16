package components

class ControlledBuffer(val bitSize: Int) : CircuitComponent("${bitSize}-Bit Controlled Buffer") {
    private var value: Int = 0
    private var enabled: Boolean = false

    fun store(data: Int, enable: Boolean) 
    {
        if (enable) 
        {
            value = data and ((1 shl bitSize) - 1)
            enabled = true
        } 
        else 
        {
            enabled = false
        }
    }

    fun read(): Int? = if (enabled) value else null
}
