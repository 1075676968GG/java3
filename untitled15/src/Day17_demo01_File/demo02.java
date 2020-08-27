package Day17_demo01_File;
/*
* 获取功能的方法
* public String getAbsolutePath() ：返回此File的绝对路径名字符串。
* public String getPath() ：将此File转换为路径名字符串。
* public String getName() ：返回由此File表示的文件或目录的名称。
* public long length() ：返回由此File表示的文件的长度。
*
* 绝对路径和相对路径
* 绝对路径：从盘符开始的路径，这是一个完整的路径。
* 相对路径：相对于项目目录的路径，这是一个便捷的路径，开发中经常使用。
*
* 判断功能的方法
* public boolean exists() ：此File表示的文件或目录是否实际存在。
* public boolean isDirectory() ：此File表示的是否为目录。
* public boolean isFile() ：此File表示的是否为文件。
*
* 创建删除功能的方法
* public boolean createNewFile() ：当且仅当具有该名称的文件尚不存在时，创建一个新的空文件。
* public boolean delete() ：删除由此File表示的文件或目录。
* public boolean mkdir() ：创建由此File表示的目录。
* public boolean mkdirs() ：创建由此File表示的目录，包括任何必需但不存在的父目录。
*
* 目录的遍历
* public String[] list() ：返回一个String数组，表示该File目录中的所有子文件或目录。
* public File[] listFiles() ：返回一个File数组，表示该File目录中的所有的子文件或目录.
* */
import java.io.File;
import java.io.IOException;

public class demo02 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\a\\File.txt");
        //文件 文件夹
        File file1 = new File("D:\\a");
        System.out.println("文件名称: " + file.getName());
        System.out.println("文件路径：" + file.getPath());
        System.out.println("文件绝对路径：" + file.getAbsolutePath());
        System.out.println("文件长度：" + file.length());
        //获取功能的方法


        System.out.println("======================================");
        System.out.println("文件父亲名称: " + file.getParent());
        //System.out.println("文件路径："+file.getFreeSpace());
        //System.out.println("文件绝对路径："+file.getParentFile());
        //System.out.println("文件长度："+file.getTotalSpace());


        System.out.println("======================================");
        System.out.println("file1存不存在:" + file1.exists());//文件是否存在
        File file2 = new File("F:\\a");
        System.out.println("file2存不存在:" + file2.exists());


        System.out.println("======================================");
        System.out.println("file1是文件夹:" + file1.isDirectory());
        System.out.println("file1是文件:" + file1.isFile());
        //判断功能的方法


        File file3 = new File("D:\\a\\File2.txt");
        file3.createNewFile();//创建文件
        File file4 = new File("D:\\a\\新建文件夹 (3)");
        file4.delete();//删除文件
        file3.mkdir();//创建由此File表示的目录
        file3.mkdirs();//创建由此File表示的目录，包括任何必需但不存在的父目录
        //创建删除功能的方法


        System.out.println("======================================");
        String[] names = file1.list();
        for (String a : names) {
            System.out.println(a);
        }

        System.out.println("======================================");
        File[] files = file1.listFiles();
        for (File b : files) {
            System.out.println(b);
        }
        //目录的遍历
    }
}
