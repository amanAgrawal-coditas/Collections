package Week_6.AssignmentCollections;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
       arrayDeque.add(67);
       arrayDeque.add(60);
       arrayDeque.add(62);
       arrayDeque.add(61);
       arrayDeque.add(64);
       arrayDeque.add(666);
       arrayDeque.add(667);
        System.out.println(arrayDeque);
        System.out.println(arrayDeque.size());
        arrayDeque.push(87);
        System.out.println(arrayDeque);
        arrayDeque.pop();
        System.out.println(arrayDeque);
        System.out.println(arrayDeque.peek());
        System.out.println(arrayDeque.contains(62));
        System.out.println(arrayDeque.offer(870));
        System.out.println(arrayDeque);
        arrayDeque.removeFirst();
        System.out.println(arrayDeque);

    }
/*
"C:\Program Files\Java\jdk1.8.0_202\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2\lib\idea_rt.jar=51163:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_202\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\rt.jar;C:\Users\coditas\IdeaProjects\hello in\out\production\hello in" Week_6.AssignmentCollections.ArrayDequeDemo
[67, 60, 62, 61, 64, 666, 667]
7
[87, 67, 60, 62, 61, 64, 666, 667]
[67, 60, 62, 61, 64, 666, 667]
67
true
true
[67, 60, 62, 61, 64, 666, 667, 870]
[60, 62, 61, 64, 666, 667, 870]
 */

}
