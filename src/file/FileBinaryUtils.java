package file;

import java.io.*;
import java.util.List;

public class FileBinaryUtils {
    public void writeFile(String path) {
        int [] a = {5, 9, 1, 12, 15, 65};
        try (FileOutputStream stream = new FileOutputStream(path)){
            for (int i = 0; i < a.length; i++) {
//                byte[] data = String.valueOf(a[i]).getBytes();
//                stream.write(data);
                stream.write(a[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readFile(String path) {
        try (FileInputStream stream = new FileInputStream(path)){
            int a = 0;
            while ((a = stream.read()) != -1) {
                System.out.println(a);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeFileData(String path) {
        int [] a = {5, 9, 1, 12, 15, 65};
        try (DataOutputStream stream = new DataOutputStream(new FileOutputStream(path))){
            for (int i = 0; i < a.length; i++) {
                stream.writeInt(a[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readFileData(String path) {
        try (DataInputStream stream = new DataInputStream(new FileInputStream(path))) {
            int result = -1;
            while ((result = stream.readInt()) != -1) {
                System.out.println(result);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeFileObject(String path, List<Student> studentList) {
        try (ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(path))) {
            stream.writeObject(studentList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Student> readFileObject(String path) {
        try (ObjectInputStream stream = new ObjectInputStream(new FileInputStream(path))) {
            return (List<Student>) stream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
