package Text1;

import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.nio.Buffer;
import java.nio.charset.Charset;
import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        Collection<String> coll = new ArrayList<>();
//        coll.add("aaa");
//        coll.add("bbb");
//        coll.add("ccc");
//
////        coll.forEach(new Consumer<String>() {  //匿名内部类
////            @Override
////            public void accept(String s) {
////                System.out.println(s);
////            }
////        });
//
//        //lambda表达式  简化书写
//        coll.forEach(s -> System.out.println(s));
//
//        System.out.println();
//
//        for ( String s : coll ) System.out.println(s);
//
//        ArrayList list = new ArrayList();
//        list.add("aaa");
//        list.add(1);
//
//        for ( Object t : list ) System.out.println(t);
//        Map<String, String> map = new HashMap<>();
//
//        map.put("111","234");
//        map.put("123","23423");
//        map.put("2343","23423");
//
//        map.forEach(new BiConsumer<String, String>() {
//            @Override
//            public void accept(String key, String value) {
//                System.out.println(key+" -> "+value);
//            }
//        });
//
//        System.out.println("--------------------------------");
//
//        Set<Map.Entry<String,String>> entries = map.entrySet();
//        for ( Map.Entry<String, String> entry : entries )
//        {
//            String key = entry.getKey();
//            String value = entry.getValue();
//            System.out.println(key + " -> " + value);
//        }
//
//        System.out.println("---------------------------------");
//
//        Set<String> keys = map.keySet();
//        for (String key : keys) {
//            String value = map.get(key);
//            System.out.println(key+" -> "+value);
//        }
//
//        System.out.println("-----------------------------");
//        Iterator<String> iterator = keys.iterator();
//        while ( iterator.hasNext() )
//        {
//            String key = iterator.next();
//            String value = map.get(key);
//            System.out.println(key + " -> " + value);
//        }
//
//        System.out.println("----------------------------");
//
//        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
//        lhm.put("a",111);
//        lhm.put("b",234);
//        lhm.put("a",653);
//
//        lhm.forEach(new BiConsumer<String, Integer>() {
//            @Override
//            public void accept(String s, Integer integer) {
//                System.out.println(s+" -> "+integer);
//            }
//        });

//        System.out.println("--------------------------");
//
//        TreeMap<Integer,String> tm = new TreeMap<>(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {//o1表示要添加的元素,o2表示已经在红黑树里的元素
//                return o2 - o1;
//            }
//        });
//
//        tm.put(1,"asjdfl");
//        tm.put(2,"akhdf");
//        tm.put(1,"hasdkf");
//        tm.put(6,"yuweroj");
//
//       // System.out.println(tm);
//
//        Set<Integer> keys = tm.keySet();
////        for (Integer key : keys) {
////            System.out.println(key+"  -> " +tm.get(key));
////        }
//
//        Iterator<Integer> iterator = keys.iterator();
//        while ( iterator.hasNext() )
//        {
//            int key = iterator.next();
//            String value = tm.get(key);
//            System.out.println(key+" -> "+value);
//        }
//        TreeMap<student,String> tm = new TreeMap<>();
//        student s1 = new student("nihao", 12);
//        student s2 = new student("absd", 12);
//        student s3 = new student("bianxin", 13);
//
//        tm.put(s1,"shenzhen");
//        tm.put(s2,"beijing");
//        tm.put(s3,"shanghai");
//
//        tm.forEach(new BiConsumer<student, String>() {
//            @Override
//            public void accept(student student, String s) {
//                System.out.println(student+" -> "+s);
//            }
//        });


//
//        HashMap<String, String> hm = new HashMap<>();
//        hm.put("111","abc");
//
//        Map<String, String> map = Map.ofEntries(hm.entrySet().toArray(new Map.Entry[11]));
//
//        map.put("sdajf","sdafasa");

//        ArrayList<String> list = new ArrayList<>();
//        Collections.addAll(list,"a","b","c");
//        Stream<String> stream = list.stream();
//        stream.forEach((s) -> System.out.println(s));

//        HashMap<String, String> hm = new HashMap<>();
//        hm.put("111","abc");
//        hm.put("222","lkasjd");
//        hm.put("233","lsdakjhflsda");
//
//        hm.entrySet().stream().forEach(new Consumer<Map.Entry<String, String>>() {
//            @Override
//            public void accept(Map.Entry<String, String> stringStringEntry) {
//                System.out.println(stringStringEntry);
//            }
//        });

//        ArrayList<String> list = new ArrayList<>();
//        list.add("sdf");
//        list.add("jfsldkj");
//        list.add("kjfsadljkds");
//
//        String[] arr1 = list.stream().toArray(new IntFunction<String[]>() {
//            @Override
//            public String[] apply(int value) {
//                return new String[value];
//            }
//        });
//
//        System.out.println(Arrays.toString(arr1));
//        System.out.println("------------------------------------");
//
//        String[] arr = list.stream().toArray(value -> new String[value]);
//        System.out.println(Arrays.toString(arr));


//        ArrayList<String> list = new ArrayList<>();
//        Collections.addAll(list,"1","2","3");
//        list.stream().map(new Function<String, Integer>() {
//            @Override
//            public Integer apply(String s) {
//                return Integer.parseInt(s);
//            }
//        }).forEach(s -> System.out.println(s));
//
//        System.out.println("-=--------------------------");
//
//        List<Integer> collect = list.stream().map(new Function<String, Integer>() {
//            @Override
//            public Integer apply(String s) {
//                return Integer.parseInt(s);
//            }
//        }).collect(Collectors.toList());
//
//        for (Integer integer : collect) {
//            System.out.println(integer+ "  ");
//        }
//
//        System.out.println("-------------------------------");
//
//
//        list.stream().map(Integer::parseInt).forEach(s-> System.out.println(s));
//
//        ArrayList<String> list = new ArrayList<>();
//        Collections.addAll(list,"bianxin,18","xiaoming,18");
//        student[] students = list.stream().map(student::new).toArray(student[]::new);
//        for (student student : students) {
//            System.out.println(student.toString());
//        }

        //int[] arr = { 1, 2, 3 };
//        int[] arr = null;
//
//        if ( arr == null ) throw new NullPointerException();
//        if ( arr.length == 0 ) throw new ArrayIndexOutOfBoundsException();
//
//        try{
//
//            //System.out.println(1/0);
//            //System.out.println(arr[ 10 ] );
//            String s = null;
//            System.out.println(s.equals("sdjflkjs"));
//        }catch (ArrayIndexOutOfBoundsException e)
//        {
//            System.out.println(e);
//            System.out.println("数组越界了！！！");
//        }catch (ArithmeticException | NullPointerException e)
//        {
//            //System.out.println(e);
//            e.printStackTrace();
//            System.out.println("除0了！！！");
//            System.out.println("空指针异常！！！！");
//            System.out.println("一个catch可以同时捕获多个异常");
//        }catch (Exception e )
//        {
//            System.out.println(e);
//            System.out.println("最大的异常！！！");
//        }
//
//
//        System.out.println("sjdfl kjlkdfj lk");

//        File file = new File("Work\\aaa");
//        file.mkdirs();
//        File src = new File(file,"a.txt");
//        boolean newFile = src.createNewFile();
//        if (newFile) System.out.println("创建成功");
//        else System.out.println("创建失败");

//        FileOutputStream fos = new FileOutputStream("Work\\aaa\\a.txt",true);
//        String str = "abc";
//        byte[] bytes = str.getBytes();
//        fos.write(bytes);
//
//        String warp = "\r\n";
//        byte[] bytes1 = warp.getBytes();
//        fos.write(bytes1);
//
//        fos.write(bytes);
//        fos.close();
//
//        FileInputStream fis = new FileInputStream("Work\\aaa\\a.txt");
//        int b;
//        while ( ( b = fis.read() ) != -1 ) System.out.print((char)b);
//        fis.close();

//        long begin = System.currentTimeMillis();
//
//        FileInputStream fis = new FileInputStream("D:\\capture\\2023-12-03 14-53-58.mkv");
//        FileOutputStream fos = new FileOutputStream("work\\aaa\\copy.mkv");
//
//        int len;
//        byte[] bytes = new byte[ 1024 * 1024 * 5 ];
//        while ((len = fis.read(bytes)) != -1) fos.write(bytes,0,len);
//
//        fos.close();
//        fis.close();
//
//        long end = System.currentTimeMillis();
//
//        System.out.println(end - begin);

//        String str = "ai你哟";
//        byte[] byte1 = str.getBytes();
//        System.out.println(Arrays.toString(byte1));
//
//        byte[] byte2 = str.getBytes("GBK");
//        System.out.println(Arrays.toString(byte2));
//
//        String str1 = new String(byte1);
//        System.out.println(str1);
//
//        String str2 = new String(byte2,"GBK");
//        System.out.println(str2);
//        FileReader fr = new FileReader("Work\\aaa\\a.txt");
//        char[] ch1 = new char[1];
//        int len;
//        //int ch;
//        while ( ( len = fr.read(ch1) ) != -1 ) System.out.print(new String(ch1,0,len));
//        fr.close();

//        FileReader fr = new FileReader("Work\\aaa\\a.txt", Charset.forName("GBK"));
//        int ch;
//        while ( ( ch = fr.read() ) != -1 ) System.out.println((char)ch);
//        fr.close();

//        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("Work\\\\aaa\\\\a.txt")));
//        String line;
//        while ( ( line = br.readLine() ) != null ) System.out.println(line);
//        br.close();
//
//        student stu = new student("zhangsan",18,"beijing");
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Work\\\\aaa\\\\a.txt"));
//        oos.writeObject(stu);
//        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Work\\\\aaa\\\\a.txt"));
        student o = (student)  ois.readObject();
        System.out.println(o);
        ois.close();
    }


}