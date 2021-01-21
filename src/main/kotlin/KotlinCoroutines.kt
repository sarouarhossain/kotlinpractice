import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    println("From main Thread: ${Thread.currentThread().name}")

    GlobalScope.launch {
        println("Fake work coroutine: ${Thread.currentThread().name}")
        //Thread.sleep(1000)
        delay(1000)
        println("Fake work coroutine ends: ${Thread.currentThread().name}")
    }

    GlobalScope.launch {
        println("Fake work coroutine1: ${Thread.currentThread().name}")
        //Thread.sleep(1000)
        delay(1000)
        println("Fake work coroutine ends1: ${Thread.currentThread().name}")
    }

    //Thread.sleep(5000)


    delay(5000)


    println("From main Thread ends: ${Thread.currentThread().name}")
}