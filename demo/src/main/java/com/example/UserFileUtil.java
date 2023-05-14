import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class UserFileUtil {
    private static final String FILE_NAME = "users.json";

    private static Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public static List<User> readUsersFromFile() {
        List<User> users = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            Type listType = new TypeToken<ArrayList<User>>(){}.getType();
            users = gson.fromJson(reader, listType);
        } catch (IOException e) {
            System.err.println("Ошибка чтения файла: " + e.getMessage());
        }
        return users;
    }

    public static void writeUserToFile(User user) {
        List<User> users = readUsersFromFile();
        users.add(user);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            writer.write(gson.toJson(users));
        } catch (IOException e) {
            System.err.println("Ошибка записи файла: " + e.getMessage());
        }
    }
}
