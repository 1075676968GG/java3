package Day17_demo01_File;

import java.io.File;
/*
* 创建File的方式
* */
public class demo01 {
    public static void main(String[] args) {
        File file=new File("D:\\a\\File.txt");

        String parentPath="d:\\a";
        String childPath="hello.txt";
        File file1=new File(parentPath,childPath);

        File file2=new File("D:\\a");
        String childPath1="hello.txt";
        File file3=new File(file2,childPath1);

        File file4=new File("F:\\a");//路径不存在也不影响创建
    }
}
