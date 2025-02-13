package com.thirdegg.lintrules.android.checkedexceptions

import com.android.tools.lint.checks.infrastructure.TestFiles

object ThrowsTestClasses {

    val ThrowsInterfaceKotlin = TestFiles.kotlin("""

            package com.thirdegg.lintrules.android

            class ThrowsInterfaceKotlin {

                fun tryOne() {
                    throw ThrowsException()
                }

                fun tryTwo() {
                    throw ThrowsException()
                    throw ThrowsTwoException()
                }
            }

        """).indented()

    val ThrowsExceptionsKotlin = TestFiles.kotlin("""

            package com.thirdegg.lintrules.android

            import java.lang.Exception

            class ThrowsException:Exception("ThrowsException")
            class ThrowsTwoException:Exception("ThrowsException")
            class ThrowsThreeException:ThrowsTwoException()

        """).indented()

    val ThrowsClassJava = TestFiles.kotlin("""

            package com.thirdegg.lintrules.android

            class ThrowsClassJava {

                @Throws(ThrowsException::class)
                fun tryTwo() {
                    ThrowsInterfaceKotlin().tryOne()
                }

                @Throws(ThrowsException::class,ThrowsTwoException::class)
                fun tryThree() {
                    ThrowsInterfaceKotlin().tryTwo()
                }

                @Throws(ThrowsException::class,ThrowsTwoException::class,ThrowsThreeException::class)
                fun test() {
                    tryTwo()
                    tryThree()
                }

                fun test2() {
                    try {
                        test()
                    } catch(e:ThrowsException) {

                    }
                }

            }


        """).indented()

}