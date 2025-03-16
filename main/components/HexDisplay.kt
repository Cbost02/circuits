package components

class HexDisplay : DigitalDisplay("Hex Display") 
{
    override fun display(value: Int) 
    {
        println("Displaying on Hex: ${value.toString(16).uppercase()}")
    }
}
