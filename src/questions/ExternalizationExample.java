package questions;

import java.io.*;

/**
 * @author SanketKalode
 * @date 07-06-2024
 */
public class ExternalizationExample {
    public static void main(String[] args) {

        Test testObj = new Test(1, "abc");

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("text.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            testObj.writeExternal(objectOutputStream);
            objectOutputStream.flush();
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

class Test implements Externalizable {

    private int num;
    private String str;

    public Test(int num, String str) {
        this.num = num;
        this.str = str;
    }

    public Test() {
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeUTF(str);
        out.writeInt(num);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        this.num = in.readInt();
        this.str = in.readUTF();
    }
}
