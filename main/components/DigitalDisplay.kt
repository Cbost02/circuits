package components

abstract class DigitalDisplay(name: String) : CircuitComponent(name) 
{
    abstract fun display(value: Int)
}
