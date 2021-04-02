package diledsys.homework.decoder;

//https://habr.com/ru/post/545150/#ony_of
public class Decoder {

    public static StringBuilder changString(String string) {
        StringBuilder sb = new StringBuilder();
        String str = IOfile.load().toString();
        for (String s : str.split(" ")) {
            if (s.matches("но|не|да|в|с|у|о|к|от|при|про|без|перед|около")) {
                sb.append(" " + string + " ");
            } else {
                sb.append(s + " ");
            }
        }
        return sb;
    }
}
