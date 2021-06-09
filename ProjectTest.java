
class ProjectTest {
    public static void main(String[] args) {
        Project elevatorPitch = new Project();
        String print = elevatorPitch.returnNameAndDescription();
        System.out.println(print);
        
        // Testing our name constructor
        Project test = new Project("Ryan");
        String print2 = test.returnNameAndDescription();
        System.out.println(print2);
        // Testing our name setter
        test.setName("Tom");
        // Testing our name getter
        System.out.println(test.getName());
        String print3 = test.returnNameAndDescription();
        System.out.println(print3);
        // Testing out name and description constructore
        Project test2 = new Project("Billy", "Another One");
        String print4 = test2.returnNameAndDescription();
        System.out.println(print4);
        // Testing our description setter
        test2.setDescription("Another OOP project. This time with more stuff.");
        // Testing our description getter
        System.out.println(test2.getDescription());
        String print5 = test2.returnNameAndDescription();
        System.out.println(print5);
    }
}