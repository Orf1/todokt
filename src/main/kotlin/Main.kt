import redis.clients.jedis.JedisPool


fun main() {
    val pool = JedisPool("localhost", 6379)
    val resource = pool.resource
    resource.set("token", "goose")
}