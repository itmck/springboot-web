package com.itmck.springbootweb.common;

import java.util.List;

public interface JedisClient {

	Object get(String key);
	
	void set(String key, Object value, int exp);

	void remove(String key);
	/**
	 * 将一个或多个值插入到列表头部。 如果 key 不存在，一个空列表会被创建并执行 LPUSH 操作。 当 key 存在但不是列表类型时，返回一个错误。
	 * @param key 队列名
	 * @param value
	 */
	void lpush(String key, Object value);
	/**
	 * 移除并返回列表的第一个元素
	 * @param key
	 * @return
	 */
	Object lpop(String key);
	/**
	 * 将一个或多个值插入到列表的尾部(最右边)。如果列表不存在，一个空列表会被创建并执行 RPUSH 操作。
	 *  当列表存在但不是列表类型时，返回一个错误。
	 * @param key
	 * @param value
	 */
	void rpush(String key, Object value);
	/**
	 * 用于移除并返回列表的最后一个元素
	 * @param key
	 * @return
	 */
	Object rpop(String key);



	/**
	 * 返回列表中指定区间内的元素，区间以偏移量 START 和 END 指定。
	 * 其中 0 表示列表的第一个元素， 1 表示列表的第二个元素，以此类推。
	 * 你也可以使用负数下标，以 -1 表示列表的最后一个元素， -2 表示列表的倒数第二个元素，以此类推。
	 * @param key
	 * @param start
	 * @param end
	 * @return
	 */
	List<Object> lrange(String key, int start, int end);
	
	
	
	
//	String hget(String hkey, String key);
//	long hset(String hkey, String key, String value);
//	long incr(String key);
//	long expire(String key, int second);
//	long ttl(String key);
//	long del(String key);
//	long hdel(String hkey, String key);
	
}
