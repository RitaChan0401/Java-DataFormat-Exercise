public class F4_4 {
    public static void main(String[] args) {
//        Enrollee enrollee = new Enrollee();
//        System.out.println(toHeader(enrollee));
//        System.out.println(toCsv(enrollee));
//        Instructor instructor = new Instructor();
//        System.out.println(toHeader(instructor));
//        System.out.println(toCsv(instructor));
    }
    public static String toHeader(Object object){
        return "id,name,score";
    }

    public static String toHeader(Enrollee enrollee){
        return "id,name";
    }

    public static String toHeader(Instructor instructor){
        return null;
    }

    public static String toCsv(Object object){
        return null;
    }

    public static String toCsv(Enrollee enrollee){
        return null;
    }

    public static String toCsv(Instructor instructor){
        return null;
    }
}
