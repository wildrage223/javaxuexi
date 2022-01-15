package struct;

public class SwitchDemo01 {
    public static void main(String[] args) {
        //case穿透，即没写break
        char grade = 'C';

        switch (grade) {
            case 'A':
                System.out.println("优秀");
                break;
            case 'B':
                System.out.println("良好");
                break;
            case 'C':
                System.out.println("及格");
                break;
            case 'D':
                System.out.println("再接再厉");
                break;
            default:
                System.out.println("未知等级");
                break;
        }
    }
}
