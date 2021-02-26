package sevendatabases

import redis.clients.jedis.Jedis

fun main() {
    val jedis = Jedis()
    for(i in 0..100) {
        println("Publish message #$i")
        jedis.lpush("message", "Message #$i")
        Thread.sleep(200)
    }
}