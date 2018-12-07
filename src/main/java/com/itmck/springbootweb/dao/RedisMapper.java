//package com.itmck.springbootweb.dao;
//
//import com.itmck.springbootweb.common.JedisClient;
//import org.apache.ibatis.annotations.Mapper;
//import org.springframework.stereotype.Repository;
//import redis.clients.jedis.Jedis;
//import redis.clients.jedis.JedisPool;
//
//import javax.annotation.Resource;
//import java.io.*;
//import java.nio.charset.Charset;
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * Create by it_mck 2018/11/2 11:36
// *
// * @Description:
// * @Version: 1.0
// */
//@Repository
//@Mapper
//public class RedisMapper implements JedisClient {
//
//    @Resource
//    protected JedisPool jedisPool;
//    protected static final Charset charset = Charset.forName("UTF-8");
//
//    /* ============================= protected ============================ */
//    protected static byte[] objectToBytes(Object s) {
//        if (s == null) {
//            return null;
//        }
//        // 序列化后数据流给ByteArrayOutputStream 来保存。
//        // ByteArrayOutputStream 可转成字符串或字节数组
//        ByteArrayOutputStream baos = null;
//        ObjectOutputStream oos = null;
//        byte[] b = null;
//        try {
//            baos = new ByteArrayOutputStream();
//            oos = new ObjectOutputStream(baos);
//            oos.writeObject(s);
//            b = baos.toByteArray();
//            oos.close();
//            baos.close();
//        } catch (IOException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        } finally {
//            if (oos != null) {
//                try {
//                    oos.close();
//                } catch (IOException e) {
//                    // TODO Auto-generated catch block
//                    e.printStackTrace();
//                }
//            }
//            if (baos != null) {
//                try {
//                    baos.close();
//                } catch (IOException e) {
//                    // TODO Auto-generated catch block
//                    e.printStackTrace();
//                }
//            }
//        }
//        return b;
//    }
//
//    protected static Object bytesToObject(byte[] b) {
//        if (b == null) {
//            return null;
//        }
//        ByteArrayInputStream bais = null;
//        ObjectInputStream ois = null;
//        Object obj = null;
//        try {
//            bais = new ByteArrayInputStream(b);
//            ois = new ObjectInputStream(bais);
//            obj = ois.readObject();
//            ois.close();
//            bais.close();
//        } catch (ClassNotFoundException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        } catch (IOException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        } finally {
//            if (ois != null) {
//                try {
//                    ois.close();
//                } catch (IOException e) {
//                    // TODO Auto-generated catch block
//                    e.printStackTrace();
//                }
//            }
//            if (bais != null) {
//                try {
//                    bais.close();
//                } catch (IOException e) {
//                    // TODO Auto-generated catch block
//                    e.printStackTrace();
//                }
//            }
//        }
//        return obj;
//    }
//
//    public void remove(String key) {
//        Jedis jedis = jedisPool.getResource();
//        jedis.del(key.getBytes(charset));
//        jedis.close();
//    }
//
//    public void set(String key, Object obj, int exp) {
//        Jedis jedis = jedisPool.getResource();
//        jedis.setex(key.getBytes(charset), exp, objectToBytes(obj));
//        jedis.close();
//    }
//
//    public Object get(String key) {
//        Jedis jedis = jedisPool.getResource();
//        Object obj = bytesToObject(jedis.get(key.getBytes(charset)));
//        jedis.close();
//        return obj;
//    }
//
//    @Override
//    public void lpush(String key, Object value) {
//        // TODO Auto-generated method stub
//        Jedis jedis = jedisPool.getResource();
//        jedis.lpush(key.getBytes(charset), objectToBytes(value));
//        jedis.close();
//    }
//
//    @Override
//    public Object lpop(String key) {
//        // TODO Auto-generated method stub
//        Jedis jedis = jedisPool.getResource();
//        Object obj = bytesToObject(jedis.lpop(key.getBytes(charset)));
//        jedis.close();
//        return obj;
//    }
//
//    @Override
//    public List<Object> lrange(String key, int start, int end) {
//        // TODO Auto-generated method stub
//        Jedis jedis = jedisPool.getResource();
//        List<byte[]> bs = jedis.lrange(key.getBytes(charset), start, end);
//        List<Object> objs=new ArrayList<Object>();
//        for (byte[] b : bs) {
//            objs.add(bytesToObject(b));
//        }
//        jedis.close();
//        return objs;
//    }
//
//
//    @Override
//    public void rpush(String key, Object value) {
//        // TODO Auto-generated method stub
//        Jedis jedis = jedisPool.getResource();
//        jedis.rpush(key.getBytes(charset), objectToBytes(value));
//        jedis.close();
//    }
//
//    @Override
//    public Object rpop(String key) {
//        // TODO Auto-generated method stub
//        Jedis jedis = jedisPool.getResource();
//        Object obj = bytesToObject(jedis.rpop(key.getBytes(charset)));
//        jedis.close();
//        return obj;
//    }
//
//
//}
