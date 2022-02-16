import redis.clients.jedis.JedisPool


fun main(args: Array<String>) {
    val pool = JedisPool("localhost", 6379)
    val resource = pool.resource
    resource.set("token", "goose");
}