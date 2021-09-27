package striker.studing.caching;

import org.junit.Assert;
import org.junit.Test;

public class CacheTest {

    @Test
    public void removeByOldTest(){
        Cache<String, Integer> cache = new Cache<>(5);
        cache.put("one", 1);
        cache.put("two", 2);
        cache.put("three", 3);
        System.out.println(cache);
        cache.put("six", 6);
        System.out.println(cache);
        cache.put("ten", 10);
        System.out.println(cache);
        cache.put("twelve", 12);
        System.out.println(cache);
    }
    @Test
    public void getTest(){
        Cache<String, Integer> cache = new Cache<>(3);
        cache.put("one", 1);
        cache.put("two", 2);
        cache.put("three", 3);
        System.out.println(cache);
        cache.get("one");
        System.out.println(cache);
        cache.put("four", 4);
        System.out.println(cache);
    }
    @Test
    public void removeTest(){
        Cache<String, Integer> cache = new Cache<>(3);
        cache.put("one", 1);
        cache.put("two", 2);
        cache.remove("two");
        Assert.assertEquals(1, cache.size());
        System.out.println(cache);
    }
}
