package fifteen;

public class StringSample {
    public static void main(String[] args) {
        StringSample sample = new StringSample();
        sample.convert();

        }

        public void convert() {
        try {
            String korean = "한글";  //한글이라는 값을 갖는 String 객체인 korean을 생성했다.

            byte[] array1 = korean.getBytes();  //getByte()라는 메소드를 사용하여 korean을 byte배열로 만들었다.
            for(byte data:array1) {  //만들어진 byte 배열에 어떤 값들이 있는지 살펴보기 위해서 for 루프를 사용하여
                                     //각각의 byte 값을 출력하도록 해 놓았다
                System.out.println(data + " ");
            }
            System.out.println();
            String korean2 = new String(array1); //byte 배열을 갖고 String 객체를 만들기 위해서 byte 배열(array1)을
                                                 //매개 변수로 갖는 String 객체를 생성하고, 그 문자열을 출력했다.
            System.out.println(korean2);
        } catch (Exception e) {
            e.printStackTrace();
        }

            }
    }

