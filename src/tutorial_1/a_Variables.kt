package tutorial_1

fun main() {
    /**
     * 変数を宣言する
     * ・ var → 変数への再代入可能
     * ・ val → 変数への再代入不可
     * kotlinではvalを使うことが基本 (例外を除く
     * また型の宣言は明示的にすることも可能だが、推論されるので宣言しなくてもよい
     */
    // 型の宣言
    val from : String = "東北"
    val age = 27
    val name = "shota suzuki"
    println(age)
    println(name)

    // nullは?を付けることで代入可能
    val nulls : String? = null

    // これはコンパイルエラーになる
    // val nullpo = null

}