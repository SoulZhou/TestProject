package cn.yunovo.test.bean;

import java.io.File;
import java.io.FileFilter;

/**
 * Created by Administrator on 2018/12/26.
 */

public class Test {
    public static void main(String[] args){
//        ArrayList<String> lists = new ArrayList<>();
//        lists.add("001");
//        lists.add("002");
//
//        Student2 student2 = new Student2("Tom",lists);
//        List<String> anotherList2 = student2.getCourses();
//        System.out.println("Tom's course.length 0  = " + anotherList2.size());
//        student2.addCourse("003");
////        anotherList.add("003"); 这里不能用add
//        System.out.println("Tom's course.length 1  = " + anotherList2.size());
//        System.out.println("Tom's course.length 2  = " + student2.getCourses().size());
//
//        Student student = new Student("Jim",lists);
//        List<String> anotherList = student.getCourses();
//        anotherList.add("003");
//        System.out.println("Tom's course.length 1  = " + anotherList.size());
//        System.out.println("Tom's course.length 2  = " + student.getCourses().size());
        File f = new File("E:\\5002mstar");
        File[] files = f.listFiles();
        for (File ff : files){
            System.out.println("path = "+ff.getAbsolutePath());
        }

        FileFilter fileFilter = new FileFilter() {
            @Override
            public boolean accept(File file) {
                return file.isFile();
            }
        };
        File[] files2 = f.listFiles(fileFilter);
        for (File ff : files2){
            System.out.println("path2 = "+ff.getAbsolutePath());
        }

    }

}
