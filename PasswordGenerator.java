public class PasswordGenerator{
    private int digits;
    private String prefix;
    private static int count;

    public PasswordGenerator(int d, String p){
        digits = d;
        prefix = p;
    }
    public PasswordGenerator(int d){
        digits = d;
        prefix = "A";
    }

    public int pwCount(){
        return count;
    }

    public String pwGen(){
        String output = prefix + ".";
        for(int i = 0;i<digits;i++){
            int num = (int) (Math.random()*10);
            output += num;
        }
        count++;
        return output;
    }

    public static void main(String[]args){
        PasswordGenerator pw1 = new PasswordGenerator(4,"chs");
        System.out.println(pw1.pwCount());
        System.out.println(pw1.pwGen());
        System.out.println(pw1.pwGen());
        System.out.println(pw1.pwCount());

        PasswordGenerator pw2 = new PasswordGenerator(6);
        System.out.println(pw2.pwCount());
        System.out.println(pw2.pwGen());
        System.out.println(pw2.pwCount());
        System.out.println(pw1.pwCount());
    }
}