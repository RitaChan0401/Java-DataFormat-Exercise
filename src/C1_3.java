public class C1_3 {
    public static void main(String[] args) {
        Pair pair = new Pair();
        Instructor instructor = new Instructor("001" ,"a"); //InstructorにsetIdがないため。
        instructor.setName("kohama");
        Assistant assistant = new Assistant();
        assistant.setName("takano");
        assistant.setId("002");

        pair.setFirst(instructor);
        pair.setSecond(assistant);

        Person p1 = pair.getFirst(); //取り出す。
        Person p2 = pair.getSecond();

        System.out.println(p1.getId());
        System.out.println(p1.getName());
        System.out.println(p2.getId());
        System.out.println(p2.getName());

    }
}
