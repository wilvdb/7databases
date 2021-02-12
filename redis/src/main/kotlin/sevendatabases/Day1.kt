package sevendatabases

import redis.clients.jedis.Jedis

fun main() {
    val jedis = Jedis()
    println("--- Open transaction ---")
    val transaction = jedis.multi()
    println("- Set count = 1")
    transaction.set("count", "1")
    println("- Incr count")
    transaction.incr("count")
    transaction.exec()
    println("--- Commit transaction ---")
    val count = jedis.get("count")
    println("- Get count : $count")
}