sealed class IntOrString {
    data class IntValue(val value: Int) : IntOrString()
    data class StringValue(val value: String) : IntOrString()
}