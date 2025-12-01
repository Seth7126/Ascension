package com.voxelbusters.android.essentialkit.utilities;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationUtil {
    public static Object deserialize(byte[] arr_b) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream0 = new ObjectInputStream(new ByteArrayInputStream(arr_b));
        Object object0 = objectInputStream0.readObject();
        objectInputStream0.close();
        return object0;
    }

    public static byte[] serialize(Serializable serializable0) throws IOException, IOException {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(byteArrayOutputStream0);
        objectOutputStream0.writeObject(serializable0);
        objectOutputStream0.close();
        return byteArrayOutputStream0.toByteArray();
    }
}

