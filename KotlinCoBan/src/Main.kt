//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Hello Worl")
    println("Minh la MasterTu")
    //print("Nhâp tên của bạn: ")
    //var name: String
    //name = readLine().toString()
    //println("Bạn tên là: $name")
    // Nếu muốn thay đổi giá trị biến name thì pha dùng var
    //name = "Khoa"
    //println("Tên mới là: $name")
    var a: Int = 3
    var b: Int = 5
    println("Tổng của $a và $b là: ${Add(a, b)}")
    println("TBC của $a và $b là: ${average(a,b)}")
    var c = 1.0F
    var d = 1.5F
    var e = 2.5F
    var result = sumOf3number(c,d,e)
    println("$c + $d + $e = $result")
}

// Viết hàm:
fun Add(a: Int, b: Int): Int {
    return a + b
}
fun sumOf3number(a: Float,b: Float,c: Float) = a+b+c
fun average(a: Int,b: Int): Float
{
    return ((a+b)/2).toFloat()
}