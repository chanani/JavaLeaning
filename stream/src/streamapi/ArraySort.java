package streamapi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class ArraySort {

    public static void main(String[] args) {
        System.out.println("---------Stream 사용전---------");

        // Stream 사용 전
        String[] nameArr = {"IronMan", "Captain", "Hulk", "Thor"};
        List<String> nameList = Arrays.asList(nameArr);

        // 원본의 데이터가 직접 정렬됨
        Arrays.sort(nameArr);
        Collections.sort(nameList);

        for (String str : nameArr) {
            System.out.println(str);
        }

        /////////////////////
        System.out.println("---------Stream 사용후---------");

        // Stream 사용 후
        String[] nameArr2 = {"IronMan", "Captain", "Hulk", "Thor"};
        List<String> nameList2 = Arrays.asList(nameArr);

        // 원본의 데이터가 아닌 별도의 Stream을 생성함
        Stream<String> arrayStream = Arrays.stream(nameArr2);
        Stream<String> nameStream = nameList2.stream();

        // 복사된 데이터를 정렬하여 출력함
        nameStream.sorted().forEach(System.out::println);
        arrayStream.sorted().forEach(name -> System.out.println("name : " + name));

    }


}
