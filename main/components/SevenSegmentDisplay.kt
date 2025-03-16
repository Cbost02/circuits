package components

class SevenSegmentDisplay : DigitalDisplay("7-Segment Display") 
{
    override fun display(value: Int) 
    {
        println("Displaying on 7-Segment: $value")
    }
}
