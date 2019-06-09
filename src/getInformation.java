import java.util.Scanner;



public class getInformation {
    private String fullName;
    private String nationalityCode;
    private String phoneNumber;
    private float height;
    private float weight;
    private float bmi;



    public String getFullName(){
        return fullName;
    }
    public String getNationalityCode(){
        return nationalityCode;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public float getHeight(){
        return height;
    }
    public float getWeight(){
        return weight;
    }
    public float getBmi(){
        return bmi;
    }


    public void setFullName(){
         Scanner input = new Scanner(System.in);

        System.out.print("enter person's full name :");
        this.fullName = input.nextLine();
    }
    public void setNationalityCode(){
         Scanner input = new Scanner(System.in);

        System.out.print("enter person's nationality code : ");
        this.nationalityCode = input.nextLine();
    }
    public void setPhoneNumber(){
         Scanner input = new Scanner(System.in);

        System.out.print("enter person's phone number : ");
        this.phoneNumber = input.nextLine();
    }
    public void setHeight(){
         Scanner input = new Scanner(System.in);

        System.out.print("enter person's height : ");
        this.height = input.nextFloat() / 100;
    }
    public void setWeight(){
         Scanner input = new Scanner(System.in);

        System.out.print("enter person's weight : ");
        this.weight = input.nextFloat();// cm to m
    }
    public void setBmi(){
        this.bmi = weight / (height*height);
    }


//    public void writeToFile(String myData) {
//        File crunchifyFile = new File(file_location);
//        if (!crunchifyFile.exists()) {
//            try {
//                File directory = new File(crunchifyFile.getParent());
//                if (!directory.exists()) {
//                    directory.mkdirs();
//                }
//                crunchifyFile.createNewFile();
//            } catch (IOException e) {
//                //log("Excepton Occured: " + e.toString());
//            }
//        }
//
//        try {
//            // Convenience class for writing character files
//            FileWriter crunchifyWriter;
//            crunchifyWriter = new FileWriter(crunchifyFile.getAbsoluteFile(), true);
//
//            // Writes text to a character-output stream
//            BufferedWriter bufferWriter = new BufferedWriter(crunchifyWriter);
//            bufferWriter.write(myData.toString());
//            bufferWriter.close();
//
//            // log("Company data saved at file location: " + crunchify_file_location + " Data: " + myData + "\n");
//        } catch (IOException e) {
//            // log("Hmm.. Got an error while saving Company data to file " + e.toString());
//        }
//    }



}
