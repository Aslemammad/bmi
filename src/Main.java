import java.io.*;
import java.util.Scanner;
import com.google.gson.*;
import com.google.gson.stream.*;



public class Main {


    public static void main(String[] args) {
        Gson gson = new Gson();

//    getInformation info = new getInformation();
//        info.setFullName();
//        info.setNationalityCode();
//        info.setPhoneNumber();
//        info.setHeight();
//        info.setWeight();
//        info.setBmi();
//        System.out.print(info.getBmi());
//
//            writeToFile(gson.toJson(info));
        readFromFile();



    }


    //
    private static void writeToFile(String myData) {
        String file_location = "/home/bagher/Document/BMI.json";
        File bmiFile = new File(file_location);
        if (!bmiFile.exists()) {
            try {
                File directory = new File(bmiFile.getParent());
                if (!directory.exists()) {
                    directory.mkdirs();
                }
                bmiFile.createNewFile();
            } catch (IOException e) {
                log("Excepton Occured: " + e.toString());
            }
        }

        try {
            // Convenience class for writing character files
            FileWriter crunchifyWriter;
            crunchifyWriter = new FileWriter(bmiFile.getAbsoluteFile(), true);

            // Writes text to a character-output stream
            BufferedWriter bufferWriter = new BufferedWriter(crunchifyWriter);
            bufferWriter.write(myData.toString()+ "\n");
            bufferWriter.close();

            log("\nCompany data saved at file location: " + bmiFile + " Data: " + myData + "\n");
        } catch (IOException e) {
            log("\nHmm.. Got an error while saving Company data to file " + e.toString());
        }
    }



    public static void readFromFile() {
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        String bmiFile = "/home/bagher/Document/BMI.json";
        if (!(new File(bmiFile).exists()))
            log("File doesn't exist");
        try {
                BufferedReader reader = new BufferedReader(new FileReader(bmiFile));
            String line = reader.readLine();

            while (line != null) {

            getInformation getJson = gson.fromJson(line, getInformation.class);
            System.out.print("Name:"+getJson.getFullName()+ "  NationalityCode:"+getJson.getNationalityCode()+"  Phone Number:"+getJson.getPhoneNumber()+"  BMI:"+getJson.getBmi()+"  Height:"+getJson.getHeight()+"  Weight:"+getJson.getWeight()+"\n");

                // read next line
                line = reader.readLine();
            }


//




        } catch (Exception e) {
            log("error load cache from file " + e.toString());
        }

        log("\nComapny Data loaded successfully from file ");

    }






    private static void log(String string) {
        System.out.println(string);
    }
    }


