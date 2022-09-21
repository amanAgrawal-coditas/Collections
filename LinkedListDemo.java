package Week_6.AssignmentCollections;

import java.util.LinkedList;

public class LinkedListDemo
 {
    public static void main(String[] args)
    {
        LinkedList<Integer>list=new LinkedList<>();
        list.add(56);
        list.add(78);
        list.add(12);
        list.add(24);
        list.add(2,76);
        System.out.println(list);
        System.out.println(list.get(3));
        System.out.println(list.size());
        list.clear();
        System.out.println(list);
        list.add(90);
        list.add(190);
        list.add(920);
        list.add(9);
        list.add(901);
        list.addFirst(34);
        list.addLast(76);
        System.out.println(list);
        System.out.println(list.element());
        list.offer(45);
        System.out.println(list);
        System.out.println(list.removeFirst());
        System.out.println(list);
        System.out.println(list.isEmpty());
    }
 }
/*
"C:\Program Files\Java\jdk1.8.0_202\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2\lib\idea_rt.jar=50906:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.2\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_202\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_202\jre\lib\rt.jar;C:\Users\coditas\IdeaProjects\hello in\out\production\hello in" Week_6.AssignmentCollections.LinkedListDemo
[56, 78, 76, 12, 24]
12
5
[]
[34, 90, 190, 920, 9, 901, 76]
34
[34, 90, 190, 920, 9, 901, 76, 45]
34
[90, 190, 920, 9, 901, 76, 45]
false

 */