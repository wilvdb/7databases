package sevendatabases

import redis.clients.jedis.Jedis

fun main() {
    val jedis = Jedis()
    while(true) {
        println("Consume message ...")
        val result = jedis.brpop(300, "message")
        println("Receive : $result")
    }
}